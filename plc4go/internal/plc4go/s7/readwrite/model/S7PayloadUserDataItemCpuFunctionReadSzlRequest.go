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
    "encoding/xml"
    "github.com/apache/plc4x/plc4go/internal/plc4go/spi/utils"
    "io"
)

// The data-structure of this message
type S7PayloadUserDataItemCpuFunctionReadSzlRequest struct {
    Parent *S7PayloadUserDataItem
    IS7PayloadUserDataItemCpuFunctionReadSzlRequest
}

// The corresponding interface
type IS7PayloadUserDataItemCpuFunctionReadSzlRequest interface {
    LengthInBytes() uint16
    LengthInBits() uint16
    Serialize(io utils.WriteBuffer) error
    xml.Marshaler
}

///////////////////////////////////////////////////////////
// Accessors for discriminator values.
///////////////////////////////////////////////////////////
func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) CpuFunctionType() uint8 {
    return 0x04
}


func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) InitializeParent(parent *S7PayloadUserDataItem, returnCode DataTransportErrorCode, transportSize DataTransportSize, szlId *SzlId, szlIndex uint16) {
    m.Parent.ReturnCode = returnCode
    m.Parent.TransportSize = transportSize
    m.Parent.SzlId = szlId
    m.Parent.SzlIndex = szlIndex
}

func NewS7PayloadUserDataItemCpuFunctionReadSzlRequest(returnCode DataTransportErrorCode, transportSize DataTransportSize, szlId *SzlId, szlIndex uint16) *S7PayloadUserDataItem {
    child := &S7PayloadUserDataItemCpuFunctionReadSzlRequest{
        Parent: NewS7PayloadUserDataItem(returnCode, transportSize, szlId, szlIndex),
    }
    child.Parent.Child = child
    return child.Parent
}

func CastS7PayloadUserDataItemCpuFunctionReadSzlRequest(structType interface{}) *S7PayloadUserDataItemCpuFunctionReadSzlRequest {
    castFunc := func(typ interface{}) *S7PayloadUserDataItemCpuFunctionReadSzlRequest {
        if casted, ok := typ.(S7PayloadUserDataItemCpuFunctionReadSzlRequest); ok {
            return &casted
        }
        if casted, ok := typ.(*S7PayloadUserDataItemCpuFunctionReadSzlRequest); ok {
            return casted
        }
        if casted, ok := typ.(S7PayloadUserDataItem); ok {
            return CastS7PayloadUserDataItemCpuFunctionReadSzlRequest(casted.Child)
        }
        if casted, ok := typ.(*S7PayloadUserDataItem); ok {
            return CastS7PayloadUserDataItemCpuFunctionReadSzlRequest(casted.Child)
        }
        return nil
    }
    return castFunc(structType)
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) GetTypeName() string {
    return "S7PayloadUserDataItemCpuFunctionReadSzlRequest"
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) LengthInBits() uint16 {
    lengthInBits := uint16(0)

    return lengthInBits
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) LengthInBytes() uint16 {
    return m.LengthInBits() / 8
}

func S7PayloadUserDataItemCpuFunctionReadSzlRequestParse(io *utils.ReadBuffer) (*S7PayloadUserDataItem, error) {

    // Create a partially initialized instance
    _child := &S7PayloadUserDataItemCpuFunctionReadSzlRequest{
        Parent: &S7PayloadUserDataItem{},
    }
    _child.Parent.Child = _child
    return _child.Parent, nil
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) Serialize(io utils.WriteBuffer) error {
    ser := func() error {

        return nil
    }
    return m.Parent.SerializeParent(io, m, ser)
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) UnmarshalXML(d *xml.Decoder, start xml.StartElement) error {
    var token xml.Token
    var err error
    token = start
    for {
        switch token.(type) {
        case xml.StartElement:
            tok := token.(xml.StartElement)
            switch tok.Name.Local {
            }
        }
        token, err = d.Token()
        if err != nil {
            if err == io.EOF {
                return nil
            }
            return err
        }
    }
}

func (m *S7PayloadUserDataItemCpuFunctionReadSzlRequest) MarshalXML(e *xml.Encoder, start xml.StartElement) error {
    return nil
}

