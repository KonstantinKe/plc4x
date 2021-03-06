/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

#include <assert.h>
#include <plc4c/data.h>
#include <plc4c/spi/types_private.h>
#include <stdbool.h>
#include <stdint.h>
#include <stdio.h>

plc4c_data *plc4c_data_create_bool_data(bool b) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_BOOL;
  data->size = sizeof(bool);
  data->data.boolean_value = b;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_int8_t_data(int8_t c) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_CHAR;
  data->size = sizeof(char);
  data->data.char_value = c;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_uint8_t_data(uint8_t uc) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_UCHAR;
  data->size = sizeof(unsigned char);
  data->data.uchar_value = uc;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_int16_t_data(int16_t s) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_SHORT;
  data->size = sizeof(short);
  data->data.short_value = s;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_uint16_t_data(uint16_t us) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_USHORT;
  data->size = sizeof(unsigned short);
  data->data.ushort_value = us;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_int32_t_data(int32_t i) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_INT;
  data->size = sizeof(int);
  data->data.int_value = i;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_uint32_t_data(uint32_t ui) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_UINT;
  data->size = sizeof(unsigned int);
  data->data.uint_value = ui;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_int64_t_data(int64_t i) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_LINT;
  data->size = sizeof(int);
  data->data.lint_value = i;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_uint64_t_data(uint64_t ui) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_ULINT;
  data->size = sizeof(unsigned int);
  data->data.ulint_value = ui;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_float_data(float f) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_FLOAT;
  data->size = sizeof(float);
  data->data.float_value = f;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_double_data(double d) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_DOUBLE;
  data->size = sizeof(float);
  data->data.double_value = d;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_string_data(unsigned int size, char *s) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_STRING_POINTER;
  data->size = size;
  data->data.pstring_value = s;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_constant_string_data(unsigned int size, char *s) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_CONSTANT_STRING;
  data->size = size;
  data->data.const_string_value = s;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_char_data(char* s) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_CONSTANT_STRING;
  data->size = 1;
  data->data.const_string_value = s;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_list_data(plc4c_list list) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_LIST;
  // TODO: Perhaps the list size makes more sense here
  data->size = 1;
  data->data.list_value = list;
  // TODO: Add a destroy function for lists
  data->custom_destroy = NULL;
  // TODO: Add a print function for lists
  data->custom_printf = NULL;
  return data;
}

plc4c_data *plc4c_data_create_void_pointer_data(void *v) {
  plc4c_data *data = malloc(sizeof(plc4c_data));
  data->data_type = PLC4C_VOID_POINTER;
  data->size = 0;
  data->data.pvoid_value = v;
  data->custom_destroy = NULL;
  data->custom_printf = NULL;
  return data;
}

void plc4c_data_printf(plc4c_data *data) {
  if (data == NULL) {
    printf("NULL");
    return;
  }
  switch (data->data_type) {
    case PLC4C_BOOL:
      printf("%s", data->data.boolean_value ? "true" : "false");
      break;
    case PLC4C_CHAR:
      printf("%d", data->data.char_value);
      break;
    case PLC4C_UCHAR:
      printf("%u", data->data.uchar_value);
      break;
    case PLC4C_SHORT:
      printf("%d", data->data.short_value);
      break;
    case PLC4C_USHORT:
      printf("%u", data->data.ushort_value);
      break;
    case PLC4C_INT:
      printf("%d", data->data.int_value);
      break;
    case PLC4C_UINT:
      printf("%u", data->data.uint_value);
      break;
    case PLC4C_LINT:
      printf("%I64d", data->data.lint_value);
      break;
    case PLC4C_ULINT:
      printf("%I64u", data->data.ulint_value);
      break;
    case PLC4C_FLOAT:
      printf("%f", data->data.float_value);
      break;
    case PLC4C_STRING_POINTER:
      printf("%s", data->data.pstring_value);
      break;
    case PLC4C_CONSTANT_STRING:
      printf("%s", data->data.const_string_value);
      break;
    case PLC4C_LIST:
      printf("[");
      plc4c_list_element *cur_element =
          plc4c_utils_list_tail(&data->data.list_value);
      while (cur_element != NULL) {
        plc4c_data *data_item = cur_element->value;
        plc4c_data_printf(data_item);
        cur_element = cur_element->next;
        if (cur_element != NULL) {
          printf(", ");
        }
      }
      printf("]");
      break;
    case PLC4C_VOID_POINTER:
      if (data->custom_printf != NULL) {
        data->custom_printf(data);
      } else {
        printf("%p", data->data.pvoid_value);
      }
      break;
    default:
      break;
  }
}

void plc4c_data_set_custom_destroy(
    plc4c_data *data, plc4c_data_custom_destroy data_custom_destroy) {
  data->custom_destroy = data_custom_destroy;
}

void plc4c_data_set_custom_printf(plc4c_data *data,
                                  plc4c_data_custom_printf data_custom_printf) {
  data->custom_printf = data_custom_printf;
}

void plc4c_data_destroy(plc4c_data *data) {
  assert(data != NULL);
  if (data->custom_destroy != NULL) {
    data->custom_destroy(data);
  } else {
    switch (data->data_type) {
      case PLC4C_VOID_POINTER:
        free(data->data.pvoid_value);
        break;
      case PLC4C_STRING_POINTER:
        free(data->data.pstring_value);
        break;
      default:
        break;
    }
  }
  free(data);
}
