//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//
package model

import (
            "errors"
            "github.com/apache/plc4x/plc4go/internal/plc4go/spi/values"
            "github.com/apache/plc4x/plc4go/internal/plc4go/spi/utils"
            api "github.com/apache/plc4x/plc4go/pkg/plc4go/values"
            "time"
)

func DataItemParse(io *utils.ReadBuffer, dataProtocolId string, stringLength int32) (api.PlcValue, error) {
    switch {
        case dataProtocolId == "IEC61131_BOOL": // BOOL

            // Reserved Field (Just skip the bytes)
            if _, _err := io.ReadUint8(7); _err != nil {
                return nil, errors.New("Error parsing reserved field " + _err.Error())
            }

            // Simple Field (value)
            value, _valueErr := io.ReadBit()
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcBOOL(value), nil
        case dataProtocolId == "IEC61131_BYTE": // List

            // Array Field (value)
            var value []api.PlcValue
            for i := 0; i < int((8)); i++ {
                _item, _itemErr := io.ReadBit()
                if _itemErr != nil {
                    return nil, errors.New("Error parsing 'value' field " + _itemErr.Error())
                }
                value = append(value, values.NewPlcBOOL(_item))
            }
            return values.NewPlcList(value), nil
        case dataProtocolId == "IEC61131_WORD": // List

            // Array Field (value)
            var value []api.PlcValue
            for i := 0; i < int((16)); i++ {
                _item, _itemErr := io.ReadBit()
                if _itemErr != nil {
                    return nil, errors.New("Error parsing 'value' field " + _itemErr.Error())
                }
                value = append(value, values.NewPlcBOOL(_item))
            }
            return values.NewPlcList(value), nil
        case dataProtocolId == "IEC61131_DWORD": // List

            // Array Field (value)
            var value []api.PlcValue
            for i := 0; i < int((32)); i++ {
                _item, _itemErr := io.ReadBit()
                if _itemErr != nil {
                    return nil, errors.New("Error parsing 'value' field " + _itemErr.Error())
                }
                value = append(value, values.NewPlcBOOL(_item))
            }
            return values.NewPlcList(value), nil
        case dataProtocolId == "IEC61131_LWORD": // List

            // Array Field (value)
            var value []api.PlcValue
            for i := 0; i < int((64)); i++ {
                _item, _itemErr := io.ReadBit()
                if _itemErr != nil {
                    return nil, errors.New("Error parsing 'value' field " + _itemErr.Error())
                }
                value = append(value, values.NewPlcBOOL(_item))
            }
            return values.NewPlcList(value), nil
        case dataProtocolId == "IEC61131_SINT": // SINT

            // Simple Field (value)
            value, _valueErr := io.ReadInt8(8)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcSINT(value), nil
        case dataProtocolId == "IEC61131_USINT": // USINT

            // Simple Field (value)
            value, _valueErr := io.ReadUint8(8)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcUSINT(value), nil
        case dataProtocolId == "IEC61131_INT": // INT

            // Simple Field (value)
            value, _valueErr := io.ReadInt16(16)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcINT(value), nil
        case dataProtocolId == "IEC61131_UINT": // UINT

            // Simple Field (value)
            value, _valueErr := io.ReadUint16(16)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcUINT(value), nil
        case dataProtocolId == "IEC61131_DINT": // DINT

            // Simple Field (value)
            value, _valueErr := io.ReadInt32(32)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcDINT(value), nil
        case dataProtocolId == "IEC61131_UDINT": // UDINT

            // Simple Field (value)
            value, _valueErr := io.ReadUint32(32)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcUDINT(value), nil
        case dataProtocolId == "IEC61131_LINT": // LINT

            // Simple Field (value)
            value, _valueErr := io.ReadInt64(64)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcLINT(value), nil
        case dataProtocolId == "IEC61131_ULINT": // ULINT

            // Simple Field (value)
            value, _valueErr := io.ReadUint64(64)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcULINT(value), nil
        case dataProtocolId == "IEC61131_REAL": // REAL

            // Simple Field (value)
            value, _valueErr := io.ReadFloat32(true, 8, 23)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcREAL(value), nil
        case dataProtocolId == "IEC61131_LREAL": // LREAL

            // Simple Field (value)
            value, _valueErr := io.ReadFloat64(true, 11, 52)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcLREAL(value), nil
        case dataProtocolId == "IEC61131_CHAR": // CHAR

            // Manual Field (value)
            value, _valueErr := StaticHelperParseS7Char(io, "UTF-8")
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcCHAR(value), nil
        case dataProtocolId == "IEC61131_WCHAR": // CHAR

            // Manual Field (value)
            value, _valueErr := StaticHelperParseS7Char(io, "UTF-16")
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcCHAR(value), nil
        case dataProtocolId == "IEC61131_STRING": // STRING

            // Manual Field (value)
            value, _valueErr := StaticHelperParseS7String(io, stringLength, "UTF-8")
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcSTRING(value), nil
        case dataProtocolId == "IEC61131_WSTRING": // STRING

            // Manual Field (value)
            value, _valueErr := StaticHelperParseS7String(io, stringLength, "UTF-16")
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcSTRING(value), nil
        case dataProtocolId == "IEC61131_TIME": // TIME

            // Simple Field (value)
            value, _valueErr := io.ReadUint32(32)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcTIME(value), nil
        case dataProtocolId == "IEC61131_LTIME": // LTIME

            // Simple Field (value)
            value, _valueErr := io.ReadUint64(64)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcLTIME(value), nil
        case dataProtocolId == "IEC61131_DATE": // DATE

            // Simple Field (value)
            value, _valueErr := io.ReadUint16(16)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcDATE(value), nil
        case dataProtocolId == "IEC61131_TIME_OF_DAY": // TIME_OF_DAY

            // Simple Field (value)
            value, _valueErr := io.ReadUint32(32)
            if _valueErr != nil {
                return nil, errors.New("Error parsing 'value' field " + _valueErr.Error())
            }
            return values.NewPlcTIME_OF_DAY(value), nil
        case dataProtocolId == "IEC61131_DATE_AND_TIME": // DATE_AND_TIME

            // Simple Field (year)
            year, _yearErr := io.ReadUint16(16)
            if _yearErr != nil {
                return nil, errors.New("Error parsing 'year' field " + _yearErr.Error())
            }

            // Simple Field (month)
            month, _monthErr := io.ReadUint8(8)
            if _monthErr != nil {
                return nil, errors.New("Error parsing 'month' field " + _monthErr.Error())
            }

            // Simple Field (day)
            day, _dayErr := io.ReadUint8(8)
            if _dayErr != nil {
                return nil, errors.New("Error parsing 'day' field " + _dayErr.Error())
            }

            // Simple Field (dayOfWeek)
            _, _dayOfWeekErr := io.ReadUint8(8)
            if _dayOfWeekErr != nil {
                return nil, errors.New("Error parsing 'dayOfWeek' field " + _dayOfWeekErr.Error())
            }

            // Simple Field (hour)
            hour, _hourErr := io.ReadUint8(8)
            if _hourErr != nil {
                return nil, errors.New("Error parsing 'hour' field " + _hourErr.Error())
            }

            // Simple Field (minutes)
            minutes, _minutesErr := io.ReadUint8(8)
            if _minutesErr != nil {
                return nil, errors.New("Error parsing 'minutes' field " + _minutesErr.Error())
            }

            // Simple Field (seconds)
            seconds, _secondsErr := io.ReadUint8(8)
            if _secondsErr != nil {
                return nil, errors.New("Error parsing 'seconds' field " + _secondsErr.Error())
            }

            // Simple Field (nanos)
            _, _nanosErr := io.ReadUint32(32)
            if _nanosErr != nil {
                return nil, errors.New("Error parsing 'nanos' field " + _nanosErr.Error())
            }
            value := time.Date(int(year), time.Month(month), int(day), int(hour), int(minutes), int(seconds), 0, nil)
            return values.NewPlcDATE_AND_TIME(value), nil
    }
    return nil, errors.New("unsupported type")
}

func DataItemSerialize(io *utils.WriteBuffer, value api.PlcValue, dataProtocolId string, stringLength int32) error {
    switch {
        case dataProtocolId == "IEC61131_BOOL": // BOOL

            // Reserved Field (Just skip the bytes)
            if _err := io.WriteUint8(7, uint8(0x00)); _err != nil {
                return errors.New("Error serializing reserved field " + _err.Error())
            }

            // Simple Field (value)
            if _err := io.WriteBit(value.GetBool()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_BYTE": // List

            // Array Field (value)
            for i := uint32(0); i < uint32((8)); i++ {
                _itemErr := io.WriteBit(value.GetIndex(i).GetBool())
                if _itemErr != nil {
                    return errors.New("Error serializing 'value' field " + _itemErr.Error())
                }
            }
        case dataProtocolId == "IEC61131_WORD": // List

            // Array Field (value)
            for i := uint32(0); i < uint32((16)); i++ {
                _itemErr := io.WriteBit(value.GetIndex(i).GetBool())
                if _itemErr != nil {
                    return errors.New("Error serializing 'value' field " + _itemErr.Error())
                }
            }
        case dataProtocolId == "IEC61131_DWORD": // List

            // Array Field (value)
            for i := uint32(0); i < uint32((32)); i++ {
                _itemErr := io.WriteBit(value.GetIndex(i).GetBool())
                if _itemErr != nil {
                    return errors.New("Error serializing 'value' field " + _itemErr.Error())
                }
            }
        case dataProtocolId == "IEC61131_LWORD": // List

            // Array Field (value)
            for i := uint32(0); i < uint32((64)); i++ {
                _itemErr := io.WriteBit(value.GetIndex(i).GetBool())
                if _itemErr != nil {
                    return errors.New("Error serializing 'value' field " + _itemErr.Error())
                }
            }
        case dataProtocolId == "IEC61131_SINT": // SINT

            // Simple Field (value)
            if _err := io.WriteInt8(8, value.GetInt8()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_USINT": // USINT

            // Simple Field (value)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_INT": // INT

            // Simple Field (value)
            if _err := io.WriteInt16(16, value.GetInt16()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_UINT": // UINT

            // Simple Field (value)
            if _err := io.WriteUint16(16, value.GetUint16()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_DINT": // DINT

            // Simple Field (value)
            if _err := io.WriteInt32(32, value.GetInt32()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_UDINT": // UDINT

            // Simple Field (value)
            if _err := io.WriteUint32(32, value.GetUint32()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_LINT": // LINT

            // Simple Field (value)
            if _err := io.WriteInt64(64, value.GetInt64()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_ULINT": // ULINT

            // Simple Field (value)
            if _err := io.WriteUint64(64, value.GetUint64()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_REAL": // REAL

            // Simple Field (value)
            if _err := io.WriteFloat32(32, value.GetFloat32()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_LREAL": // LREAL

            // Simple Field (value)
            if _err := io.WriteFloat64(64, value.GetFloat64()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_CHAR": // CHAR

            // Manual Field (value)
            _valueErr := StaticHelperSerializeS7Char(io, value, "UTF-8")
            if _valueErr != nil {
                return errors.New("Error serializing 'value' field " + _valueErr.Error())
            }
        case dataProtocolId == "IEC61131_WCHAR": // CHAR

            // Manual Field (value)
            _valueErr := StaticHelperSerializeS7Char(io, value, "UTF-16")
            if _valueErr != nil {
                return errors.New("Error serializing 'value' field " + _valueErr.Error())
            }
        case dataProtocolId == "IEC61131_STRING": // STRING

            // Manual Field (value)
            _valueErr := StaticHelperSerializeS7String(io, value, stringLength, "UTF-8")
            if _valueErr != nil {
                return errors.New("Error serializing 'value' field " + _valueErr.Error())
            }
        case dataProtocolId == "IEC61131_WSTRING": // STRING

            // Manual Field (value)
            _valueErr := StaticHelperSerializeS7String(io, value, stringLength, "UTF-16")
            if _valueErr != nil {
                return errors.New("Error serializing 'value' field " + _valueErr.Error())
            }
        case dataProtocolId == "IEC61131_TIME": // TIME

            // Simple Field (value)
            if _err := io.WriteUint32(32, value.GetUint32()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_LTIME": // LTIME

            // Simple Field (value)
            if _err := io.WriteUint64(64, value.GetUint64()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_DATE": // DATE

            // Simple Field (value)
            if _err := io.WriteUint16(16, value.GetUint16()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_TIME_OF_DAY": // TIME_OF_DAY

            // Simple Field (value)
            if _err := io.WriteUint32(32, value.GetUint32()); _err != nil {
                return errors.New("Error serializing 'value' field " + _err.Error())
            }
        case dataProtocolId == "IEC61131_DATE_AND_TIME": // DATE_AND_TIME

            // Simple Field (year)
            if _err := io.WriteUint16(16, value.GetUint16()); _err != nil {
                return errors.New("Error serializing 'year' field " + _err.Error())
            }

            // Simple Field (month)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'month' field " + _err.Error())
            }

            // Simple Field (day)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'day' field " + _err.Error())
            }

            // Simple Field (dayOfWeek)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'dayOfWeek' field " + _err.Error())
            }

            // Simple Field (hour)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'hour' field " + _err.Error())
            }

            // Simple Field (minutes)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'minutes' field " + _err.Error())
            }

            // Simple Field (seconds)
            if _err := io.WriteUint8(8, value.GetUint8()); _err != nil {
                return errors.New("Error serializing 'seconds' field " + _err.Error())
            }

            // Simple Field (nanos)
            if _err := io.WriteUint32(32, value.GetUint32()); _err != nil {
                return errors.New("Error serializing 'nanos' field " + _err.Error())
            }
        default:

            return errors.New("unsupported type")
    }
    return nil
}

