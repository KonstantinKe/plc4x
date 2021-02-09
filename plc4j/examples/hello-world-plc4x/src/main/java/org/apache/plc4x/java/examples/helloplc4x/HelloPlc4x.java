/*
Licensed to the Apache Software Foundation (ASF) under one
or more contributor license agreements.  See the NOTICE file
distributed with this work for additional information
regarding copyright ownership.  The ASF licenses this file
to you under the Apache License, Version 2.0 (the
"License"); you may not use this file except in compliance
with the License.  You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
KIND, either express or implied.  See the License for the
specific language governing permissions and limitations
under the License.
*/
package org.apache.plc4x.java.examples.helloplc4x;

import org.apache.plc4x.java.PlcDriverManager;
import org.apache.plc4x.java.api.PlcConnection;
import org.apache.plc4x.java.api.messages.PlcReadRequest;
import org.apache.plc4x.java.api.messages.PlcReadResponse;
import org.apache.plc4x.java.api.types.PlcResponseCode;
import org.apache.plc4x.java.api.value.PlcValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CompletionStage;
import java.util.concurrent.TimeUnit;

import org.apache.plc4x.java.utils.connectionpool2.CachedDriverManager; //added

public class HelloPlc4x {

    private static final Logger logger = LoggerFactory.getLogger(HelloPlc4x.class);

    /**
     * Example code do demonstrate using PLC4X.
     *
     * @param args ignored.
     */
    public static void main(String[] args) throws Exception {
        CliOptions options = CliOptions.fromArgs(args);
        if (options == null) {
            CliOptions.printHelp();
            // Could not parse.
            System.exit(1);
        }
        String connectionString = options.getConnectionString();
        PlcDriverManager manager = new PlcDriverManager();
        PlcDriverManager cached = new CachedDriverManager(connectionString,() -> manager.getConnection(connectionString));

         //i defines how often value is retreived
        for (int i = 0; i < 10000; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                try (PlcConnection conn = cached.getConnection(connectionString)) {
                    if (conn.isConnected()){
                        PlcReadRequest.Builder builder = conn.readRequestBuilder();

                        for (int k = 0; k < options.getFieldAddress().length; k++) {
                            builder.addItem("value-" + options.getFieldAddress()[k], options.getFieldAddress()[k]);
                        };

                        PlcReadRequest readRequest = builder.build();
                        PlcReadResponse syncResponse = readRequest.execute().get(2000, TimeUnit.MILLISECONDS);
                        printResponse(syncResponse);
                    } else {
                        logger.info("PLC is not connected, let's try again to connect");
                        conn.connect();
                    }
                }
            } catch (Exception e) {
            e.printStackTrace();
        }
        }
        System.exit(0);
    }

    private static void printResponse(PlcReadResponse response) {
        for (String fieldName : response.getFieldNames()) {
            if(response.getResponseCode(fieldName) == PlcResponseCode.OK) {
                int numValues = response.getNumberOfValues(fieldName);
                // If it's just one element, output just one single line.
                if(numValues == 1) {
                    logger.info("Value[" + fieldName + "]: " + response.getObject(fieldName));
                }
                // If it's more than one element, output each in a single row.
                else {
                    logger.info("Value[" + fieldName + "]:");
                    for(int i = 0; i < numValues; i++) {
                        logger.info(" - " + response.getObject(fieldName, i));
                    }
                }
            }
            // Something went wrong, to output an error message instead.
            else {
                logger.error("Error[" + fieldName + "]: " + response.getResponseCode(fieldName).name());
            }
        }
    }

}
