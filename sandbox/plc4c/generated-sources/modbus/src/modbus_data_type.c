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

#include "modbus_data_type.h"
#include <string.h>


// Create an empty NULL-struct
static const plc4c_modbus_read_write_modbus_data_type plc4c_modbus_read_write_modbus_data_type_null_const;

plc4c_modbus_read_write_modbus_data_type plc4c_modbus_read_write_modbus_data_type_null() {
  return plc4c_modbus_read_write_modbus_data_type_null_const;
}

plc4c_modbus_read_write_modbus_data_type plc4c_modbus_read_write_modbus_data_type_value_of(char* value_string) {
    if(strcmp(value_string, "BOOL") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_BOOL;
    }
    if(strcmp(value_string, "BYTE") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_BYTE;
    }
    if(strcmp(value_string, "WORD") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_WORD;
    }
    if(strcmp(value_string, "DWORD") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_DWORD;
    }
    if(strcmp(value_string, "LWORD") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LWORD;
    }
    if(strcmp(value_string, "SINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_SINT;
    }
    if(strcmp(value_string, "INT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_INT;
    }
    if(strcmp(value_string, "DINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_DINT;
    }
    if(strcmp(value_string, "LINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LINT;
    }
    if(strcmp(value_string, "USINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_USINT;
    }
    if(strcmp(value_string, "UINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_UINT;
    }
    if(strcmp(value_string, "UDINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_UDINT;
    }
    if(strcmp(value_string, "ULINT") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_ULINT;
    }
    if(strcmp(value_string, "REAL") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_REAL;
    }
    if(strcmp(value_string, "LREAL") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LREAL;
    }
    if(strcmp(value_string, "TIME") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_TIME;
    }
    if(strcmp(value_string, "LTIME") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LTIME;
    }
    if(strcmp(value_string, "DATE") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_DATE;
    }
    if(strcmp(value_string, "LDATE") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LDATE;
    }
    if(strcmp(value_string, "TIME_OF_DAY") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_TIME_OF_DAY;
    }
    if(strcmp(value_string, "LTIME_OF_DAY") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LTIME_OF_DAY;
    }
    if(strcmp(value_string, "DATE_AND_TIME") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_DATE_AND_TIME;
    }
    if(strcmp(value_string, "LDATE_AND_TIME") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_LDATE_AND_TIME;
    }
    if(strcmp(value_string, "CHAR") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_CHAR;
    }
    if(strcmp(value_string, "WCHAR") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_WCHAR;
    }
    if(strcmp(value_string, "STRING") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_STRING;
    }
    if(strcmp(value_string, "WSTRING") == 0) {
        return plc4c_modbus_read_write_modbus_data_type_WSTRING;
    }
    return -1;
}

int plc4c_modbus_read_write_modbus_data_type_num_values() {
  return 27;
}

plc4c_modbus_read_write_modbus_data_type plc4c_modbus_read_write_modbus_data_type_value_for_index(int index) {
    switch(index) {
      case 0: {
        return plc4c_modbus_read_write_modbus_data_type_BOOL;
      }
      case 1: {
        return plc4c_modbus_read_write_modbus_data_type_BYTE;
      }
      case 2: {
        return plc4c_modbus_read_write_modbus_data_type_WORD;
      }
      case 3: {
        return plc4c_modbus_read_write_modbus_data_type_DWORD;
      }
      case 4: {
        return plc4c_modbus_read_write_modbus_data_type_LWORD;
      }
      case 5: {
        return plc4c_modbus_read_write_modbus_data_type_SINT;
      }
      case 6: {
        return plc4c_modbus_read_write_modbus_data_type_INT;
      }
      case 7: {
        return plc4c_modbus_read_write_modbus_data_type_DINT;
      }
      case 8: {
        return plc4c_modbus_read_write_modbus_data_type_LINT;
      }
      case 9: {
        return plc4c_modbus_read_write_modbus_data_type_USINT;
      }
      case 10: {
        return plc4c_modbus_read_write_modbus_data_type_UINT;
      }
      case 11: {
        return plc4c_modbus_read_write_modbus_data_type_UDINT;
      }
      case 12: {
        return plc4c_modbus_read_write_modbus_data_type_ULINT;
      }
      case 13: {
        return plc4c_modbus_read_write_modbus_data_type_REAL;
      }
      case 14: {
        return plc4c_modbus_read_write_modbus_data_type_LREAL;
      }
      case 15: {
        return plc4c_modbus_read_write_modbus_data_type_TIME;
      }
      case 16: {
        return plc4c_modbus_read_write_modbus_data_type_LTIME;
      }
      case 17: {
        return plc4c_modbus_read_write_modbus_data_type_DATE;
      }
      case 18: {
        return plc4c_modbus_read_write_modbus_data_type_LDATE;
      }
      case 19: {
        return plc4c_modbus_read_write_modbus_data_type_TIME_OF_DAY;
      }
      case 20: {
        return plc4c_modbus_read_write_modbus_data_type_LTIME_OF_DAY;
      }
      case 21: {
        return plc4c_modbus_read_write_modbus_data_type_DATE_AND_TIME;
      }
      case 22: {
        return plc4c_modbus_read_write_modbus_data_type_LDATE_AND_TIME;
      }
      case 23: {
        return plc4c_modbus_read_write_modbus_data_type_CHAR;
      }
      case 24: {
        return plc4c_modbus_read_write_modbus_data_type_WCHAR;
      }
      case 25: {
        return plc4c_modbus_read_write_modbus_data_type_STRING;
      }
      case 26: {
        return plc4c_modbus_read_write_modbus_data_type_WSTRING;
      }
      default: {
        return -1;
      }
    }
}

uint8_t plc4c_modbus_read_write_modbus_data_type_get_data_type_size(plc4c_modbus_read_write_modbus_data_type value) {
  switch(value) {
    case plc4c_modbus_read_write_modbus_data_type_BOOL: { /* '1' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_USINT: { /* '10' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_UINT: { /* '11' */
      return 2;
    }
    case plc4c_modbus_read_write_modbus_data_type_UDINT: { /* '12' */
      return 4;
    }
    case plc4c_modbus_read_write_modbus_data_type_ULINT: { /* '13' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_REAL: { /* '14' */
      return 4;
    }
    case plc4c_modbus_read_write_modbus_data_type_LREAL: { /* '15' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_TIME: { /* '16' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_LTIME: { /* '17' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_DATE: { /* '18' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_LDATE: { /* '19' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_BYTE: { /* '2' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_TIME_OF_DAY: { /* '20' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_LTIME_OF_DAY: { /* '21' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_DATE_AND_TIME: { /* '22' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_LDATE_AND_TIME: { /* '23' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_CHAR: { /* '24' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_WCHAR: { /* '25' */
      return 2;
    }
    case plc4c_modbus_read_write_modbus_data_type_STRING: { /* '26' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_WSTRING: { /* '27' */
      return 2;
    }
    case plc4c_modbus_read_write_modbus_data_type_WORD: { /* '3' */
      return 2;
    }
    case plc4c_modbus_read_write_modbus_data_type_DWORD: { /* '4' */
      return 4;
    }
    case plc4c_modbus_read_write_modbus_data_type_LWORD: { /* '5' */
      return 8;
    }
    case plc4c_modbus_read_write_modbus_data_type_SINT: { /* '6' */
      return 1;
    }
    case plc4c_modbus_read_write_modbus_data_type_INT: { /* '7' */
      return 2;
    }
    case plc4c_modbus_read_write_modbus_data_type_DINT: { /* '8' */
      return 4;
    }
    case plc4c_modbus_read_write_modbus_data_type_LINT: { /* '9' */
      return 8;
    }
    default: {
      return 0;
    }
  }
}

plc4c_modbus_read_write_modbus_data_type plc4c_modbus_read_write_modbus_data_type_get_first_enum_for_field_data_type_size(uint8_t value) {
    switch(value) {
        case 1: {
            return plc4c_modbus_read_write_modbus_data_type_BOOL;
        }
        case 2: {
            return plc4c_modbus_read_write_modbus_data_type_WORD;
        }
        case 4: {
            return plc4c_modbus_read_write_modbus_data_type_DWORD;
        }
        case 8: {
            return plc4c_modbus_read_write_modbus_data_type_LWORD;
        }
        default: {
            return -1;
        }
    }
}
