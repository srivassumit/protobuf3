# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: simple.proto

import sys
_b=sys.version_info[0]<3 and (lambda x:x) or (lambda x:x.encode('latin1'))
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='simple.proto',
  package='example.simple',
  syntax='proto3',
  serialized_options=None,
  serialized_pb=_b('\n\x0csimple.proto\x12\x0e\x65xample.simple\"Q\n\rSimpleMessage\x12\n\n\x02id\x18\x01 \x01(\x05\x12\x11\n\tis_simple\x18\x02 \x01(\x08\x12\x0c\n\x04name\x18\x03 \x01(\t\x12\x13\n\x0bsample_list\x18\x04 \x03(\x05\x62\x06proto3')
)




_SIMPLEMESSAGE = _descriptor.Descriptor(
  name='SimpleMessage',
  full_name='example.simple.SimpleMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='example.simple.SimpleMessage.id', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='is_simple', full_name='example.simple.SimpleMessage.is_simple', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='name', full_name='example.simple.SimpleMessage.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=_b("").decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='sample_list', full_name='example.simple.SimpleMessage.sample_list', index=3,
      number=4, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=32,
  serialized_end=113,
)

DESCRIPTOR.message_types_by_name['SimpleMessage'] = _SIMPLEMESSAGE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SimpleMessage = _reflection.GeneratedProtocolMessageType('SimpleMessage', (_message.Message,), {
  'DESCRIPTOR' : _SIMPLEMESSAGE,
  '__module__' : 'simple_pb2'
  # @@protoc_insertion_point(class_scope:example.simple.SimpleMessage)
  })
_sym_db.RegisterMessage(SimpleMessage)


# @@protoc_insertion_point(module_scope)
