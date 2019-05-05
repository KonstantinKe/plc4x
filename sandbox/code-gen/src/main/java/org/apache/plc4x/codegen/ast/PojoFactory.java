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
package org.apache.plc4x.codegen.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.plc4x.codegen.ast.EnumFactory.getGetterDefinition;
import static org.apache.plc4x.codegen.ast.EnumFactory.getSetterDefinition;

public class PojoFactory {

    private TypeNode BUFFER_TYPE;

    private Method readByte = new Method(BUFFER_TYPE, "readByte", Primitive.BYTE, Collections.emptyList(), Collections.emptyList());

    public ClassDefinition create(PojoDescription desc) {
        // Create all Fields first
        final List<FieldDeclaration> fields = desc.fields.stream()
            .map(field -> new FieldDeclaration(field.getType(), field.getName()))
            .collect(Collectors.toList());

        // Create the Getters
        final List<MethodDefinition> getters = desc.fields.stream()
            .map(field -> getGetterDefinition(field.getName(), field.getType()))
            .collect(Collectors.toList());

        // Create the Setters
        final List<MethodDefinition> setters = desc.fields.stream()
            .map(field -> getSetterDefinition(field.getName(), field.getType()))
            .collect(Collectors.toList());

        final List<MethodDefinition> methods = new ArrayList<>();

        methods.addAll(getters);
        methods.addAll(setters);

        // Encode Method
        methods.add(new MethodDefinition("encode", Primitive.VOID, Collections.singletonList(
            new ParameterExpression(new TypeNode("org.apache.plc4x.api.Buffer"), "buffer")
        ), new Block()));

        // Decode Method
        BUFFER_TYPE = new TypeNode("org.apache.plc4x.api.Buffer");
        final ParameterExpression buffer = new ParameterExpression(BUFFER_TYPE, "buffer");
        final TypeNode clazz = new TypeNode(desc.getName());
        final ParameterExpression instance = new ParameterExpression(clazz, "instance");
        methods.add(new MethodDefinition(Collections.singleton(Modifier.STATIC), "decode", clazz, Collections.singletonList(
            buffer
        ), new Block(
            new AssignementExpression(instance, new NewExpression(clazz)),
            new CallExpression(readByte, buffer),
            new ReturnStatement(instance)
        )));


        return new ClassDefinition("", desc.getName(), fields, Arrays.asList(new ConstructorDeclaration(Collections.emptyList(), new Block())), methods, null);
    }

    public static class PojoDescription {

        private final String name;
        private final List<Field> fields;

        public PojoDescription(String name, Field... fields) {
            this.name = name;
            this.fields = Arrays.asList(fields);
        }

        public PojoDescription(String name, List<Field> fields) {
            this.name = name;
            this.fields = fields;
        }

        public String getName() {
            return name;
        }

        public List<Field> getFields() {
            return fields;
        }
    }

    public static class Field {

        private final TypeNode type;
        private final String name;

        public Field(TypeNode type, String name) {
            this.type = type;
            this.name = name;
        }

        public TypeNode getType() {
            return type;
        }

        public String getName() {
            return name;
        }
    }

}