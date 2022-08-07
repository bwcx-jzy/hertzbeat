/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.usthe.common.entity.message;

@SuppressWarnings("PMD")
public final class CollectRep {
  private CollectRep() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code com.usthe.common.entity.message.Code}
   */
  public enum Code
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * 采集成功
     * </pre>
     *
     * <code>SUCCESS = 0;</code>
     */
    SUCCESS(0),
    /**
     * <pre>
     * 采集器不可用
     * </pre>
     *
     * <code>UN_AVAILABLE = 1;</code>
     */
    UN_AVAILABLE(1),
    /**
     * <pre>
     * 对端不可达(网络层icmp)
     * </pre>
     *
     * <code>UN_REACHABLE = 2;</code>
     */
    UN_REACHABLE(2),
    /**
     * <pre>
     * 对端连接失败(传输层tcp,udp)
     * </pre>
     *
     * <code>UN_CONNECTABLE = 3;</code>
     */
    UN_CONNECTABLE(3),
    /**
     * <pre>
     * 数据采集失败(应用层http,ssh,snmp)
     * </pre>
     *
     * <code>FAIL = 4;</code>
     */
    FAIL(4),
    /**
     * <pre>
     * 采集超时
     * </pre>
     *
     * <code>TIMEOUT = 5;</code>
     */
    TIMEOUT(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * 采集成功
     * </pre>
     *
     * <code>SUCCESS = 0;</code>
     */
    public static final int SUCCESS_VALUE = 0;
    /**
     * <pre>
     * 采集器不可用
     * </pre>
     *
     * <code>UN_AVAILABLE = 1;</code>
     */
    public static final int UN_AVAILABLE_VALUE = 1;
    /**
     * <pre>
     * 对端不可达(网络层icmp)
     * </pre>
     *
     * <code>UN_REACHABLE = 2;</code>
     */
    public static final int UN_REACHABLE_VALUE = 2;
    /**
     * <pre>
     * 对端连接失败(传输层tcp,udp)
     * </pre>
     *
     * <code>UN_CONNECTABLE = 3;</code>
     */
    public static final int UN_CONNECTABLE_VALUE = 3;
    /**
     * <pre>
     * 数据采集失败(应用层http,ssh,snmp)
     * </pre>
     *
     * <code>FAIL = 4;</code>
     */
    public static final int FAIL_VALUE = 4;
    /**
     * <pre>
     * 采集超时
     * </pre>
     *
     * <code>TIMEOUT = 5;</code>
     */
    public static final int TIMEOUT_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Code forNumber(int value) {
      switch (value) {
        case 0: return SUCCESS;
        case 1: return UN_AVAILABLE;
        case 2: return UN_REACHABLE;
        case 3: return UN_CONNECTABLE;
        case 4: return FAIL;
        case 5: return TIMEOUT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Code> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Code>() {
            public Code findValueByNumber(int number) {
              return Code.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.usthe.common.entity.message.CollectRep.getDescriptor().getEnumTypes().get(0);
    }

    private static final Code[] VALUES = values();

    public static Code valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.usthe.common.entity.message.Code)
  }

  public interface MetricsDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.usthe.common.entity.message.MetricsData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 监控的ID
     * </pre>
     *
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    long getId();

    /**
     * <pre>
     * 监控的类型 eg: linux | mysql | jvm
     * </pre>
     *
     * <code>string app = 2;</code>
     * @return The app.
     */
    java.lang.String getApp();
    /**
     * <pre>
     * 监控的类型 eg: linux | mysql | jvm
     * </pre>
     *
     * <code>string app = 2;</code>
     * @return The bytes for app.
     */
    com.google.protobuf.ByteString
        getAppBytes();

    /**
     * <pre>
     * 监控采集的指标集合 eg: cpu | memory | health
     * </pre>
     *
     * <code>string metrics = 3;</code>
     * @return The metrics.
     */
    java.lang.String getMetrics();
    /**
     * <pre>
     * 监控采集的指标集合 eg: cpu | memory | health
     * </pre>
     *
     * <code>string metrics = 3;</code>
     * @return The bytes for metrics.
     */
    com.google.protobuf.ByteString
        getMetricsBytes();

    /**
     * <pre>
     * 监控采集指标集合的采集优先级&gt;=0
     * </pre>
     *
     * <code>uint32 priority = 4;</code>
     * @return The priority.
     */
    int getPriority();

    /**
     * <pre>
     * 采集时间
     * </pre>
     *
     * <code>uint64 time = 5;</code>
     * @return The time.
     */
    long getTime();

    /**
     * <pre>
     * 采集响应码
     * </pre>
     *
     * <code>.com.usthe.common.entity.message.Code code = 6;</code>
     * @return The enum numeric value on the wire for code.
     */
    int getCodeValue();
    /**
     * <pre>
     * 采集响应码
     * </pre>
     *
     * <code>.com.usthe.common.entity.message.Code code = 6;</code>
     * @return The code.
     */
    com.usthe.common.entity.message.CollectRep.Code getCode();

    /**
     * <pre>
     * 采集响应信息
     * </pre>
     *
     * <code>string msg = 7;</code>
     * @return The msg.
     */
    java.lang.String getMsg();
    /**
     * <pre>
     * 采集响应信息
     * </pre>
     *
     * <code>string msg = 7;</code>
     * @return The bytes for msg.
     */
    com.google.protobuf.ByteString
        getMsgBytes();

    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    java.util.List<com.usthe.common.entity.message.CollectRep.Field> 
        getFieldsList();
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    com.usthe.common.entity.message.CollectRep.Field getFields(int index);
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    int getFieldsCount();
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    java.util.List<? extends com.usthe.common.entity.message.CollectRep.FieldOrBuilder> 
        getFieldsOrBuilderList();
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    com.usthe.common.entity.message.CollectRep.FieldOrBuilder getFieldsOrBuilder(
        int index);

    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow> 
        getValuesList();
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    com.usthe.common.entity.message.CollectRep.ValueRow getValues(int index);
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    int getValuesCount();
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    java.util.List<? extends com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder> 
        getValuesOrBuilderList();
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder getValuesOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code com.usthe.common.entity.message.MetricsData}
   */
  public static final class MetricsData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.usthe.common.entity.message.MetricsData)
      MetricsDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MetricsData.newBuilder() to construct.
    private MetricsData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MetricsData() {
      app_ = "";
      metrics_ = "";
      code_ = 0;
      msg_ = "";
      fields_ = java.util.Collections.emptyList();
      values_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MetricsData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MetricsData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              id_ = input.readUInt64();
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              app_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              metrics_ = s;
              break;
            }
            case 32: {

              priority_ = input.readUInt32();
              break;
            }
            case 40: {

              time_ = input.readUInt64();
              break;
            }
            case 48: {
              int rawValue = input.readEnum();

              code_ = rawValue;
              break;
            }
            case 58: {
              java.lang.String s = input.readStringRequireUtf8();

              msg_ = s;
              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                fields_ = new java.util.ArrayList<com.usthe.common.entity.message.CollectRep.Field>();
                mutable_bitField0_ |= 0x00000001;
              }
              fields_.add(
                  input.readMessage(com.usthe.common.entity.message.CollectRep.Field.parser(), extensionRegistry));
              break;
            }
            case 74: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                values_ = new java.util.ArrayList<com.usthe.common.entity.message.CollectRep.ValueRow>();
                mutable_bitField0_ |= 0x00000002;
              }
              values_.add(
                  input.readMessage(com.usthe.common.entity.message.CollectRep.ValueRow.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          fields_ = java.util.Collections.unmodifiableList(fields_);
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          values_ = java.util.Collections.unmodifiableList(values_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_MetricsData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_MetricsData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.usthe.common.entity.message.CollectRep.MetricsData.class, com.usthe.common.entity.message.CollectRep.MetricsData.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private long id_;
    /**
     * <pre>
     * 监控的ID
     * </pre>
     *
     * <code>uint64 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    public static final int APP_FIELD_NUMBER = 2;
    private volatile java.lang.Object app_;
    /**
     * <pre>
     * 监控的类型 eg: linux | mysql | jvm
     * </pre>
     *
     * <code>string app = 2;</code>
     * @return The app.
     */
    @java.lang.Override
    public java.lang.String getApp() {
      java.lang.Object ref = app_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        app_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 监控的类型 eg: linux | mysql | jvm
     * </pre>
     *
     * <code>string app = 2;</code>
     * @return The bytes for app.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAppBytes() {
      java.lang.Object ref = app_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        app_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int METRICS_FIELD_NUMBER = 3;
    private volatile java.lang.Object metrics_;
    /**
     * <pre>
     * 监控采集的指标集合 eg: cpu | memory | health
     * </pre>
     *
     * <code>string metrics = 3;</code>
     * @return The metrics.
     */
    @java.lang.Override
    public java.lang.String getMetrics() {
      java.lang.Object ref = metrics_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        metrics_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 监控采集的指标集合 eg: cpu | memory | health
     * </pre>
     *
     * <code>string metrics = 3;</code>
     * @return The bytes for metrics.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMetricsBytes() {
      java.lang.Object ref = metrics_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        metrics_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PRIORITY_FIELD_NUMBER = 4;
    private int priority_;
    /**
     * <pre>
     * 监控采集指标集合的采集优先级&gt;=0
     * </pre>
     *
     * <code>uint32 priority = 4;</code>
     * @return The priority.
     */
    @java.lang.Override
    public int getPriority() {
      return priority_;
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private long time_;
    /**
     * <pre>
     * 采集时间
     * </pre>
     *
     * <code>uint64 time = 5;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }

    public static final int CODE_FIELD_NUMBER = 6;
    private int code_;
    /**
     * <pre>
     * 采集响应码
     * </pre>
     *
     * <code>.com.usthe.common.entity.message.Code code = 6;</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <pre>
     * 采集响应码
     * </pre>
     *
     * <code>.com.usthe.common.entity.message.Code code = 6;</code>
     * @return The code.
     */
    @java.lang.Override public com.usthe.common.entity.message.CollectRep.Code getCode() {
      @SuppressWarnings("deprecation")
      com.usthe.common.entity.message.CollectRep.Code result = com.usthe.common.entity.message.CollectRep.Code.valueOf(code_);
      return result == null ? com.usthe.common.entity.message.CollectRep.Code.UNRECOGNIZED : result;
    }

    public static final int MSG_FIELD_NUMBER = 7;
    private volatile java.lang.Object msg_;
    /**
     * <pre>
     * 采集响应信息
     * </pre>
     *
     * <code>string msg = 7;</code>
     * @return The msg.
     */
    @java.lang.Override
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 采集响应信息
     * </pre>
     *
     * <code>string msg = 7;</code>
     * @return The bytes for msg.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FIELDS_FIELD_NUMBER = 8;
    private java.util.List<com.usthe.common.entity.message.CollectRep.Field> fields_;
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    @java.lang.Override
    public java.util.List<com.usthe.common.entity.message.CollectRep.Field> getFieldsList() {
      return fields_;
    }
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.usthe.common.entity.message.CollectRep.FieldOrBuilder> 
        getFieldsOrBuilderList() {
      return fields_;
    }
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    @java.lang.Override
    public int getFieldsCount() {
      return fields_.size();
    }
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.Field getFields(int index) {
      return fields_.get(index);
    }
    /**
     * <pre>
     * 采集指标名
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
     */
    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.FieldOrBuilder getFieldsOrBuilder(
        int index) {
      return fields_.get(index);
    }

    public static final int VALUES_FIELD_NUMBER = 9;
    private java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow> values_;
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    @java.lang.Override
    public java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow> getValuesList() {
      return values_;
    }
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder> 
        getValuesOrBuilderList() {
      return values_;
    }
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    @java.lang.Override
    public int getValuesCount() {
      return values_.size();
    }
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.ValueRow getValues(int index) {
      return values_.get(index);
    }
    /**
     * <pre>
     * 采集指标值集合(fields作为字段名称与ValueRow映射)
     * </pre>
     *
     * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
     */
    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder getValuesOrBuilder(
        int index) {
      return values_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0L) {
        output.writeUInt64(1, id_);
      }
      if (!getAppBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, app_);
      }
      if (!getMetricsBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, metrics_);
      }
      if (priority_ != 0) {
        output.writeUInt32(4, priority_);
      }
      if (time_ != 0L) {
        output.writeUInt64(5, time_);
      }
      if (code_ != com.usthe.common.entity.message.CollectRep.Code.SUCCESS.getNumber()) {
        output.writeEnum(6, code_);
      }
      if (!getMsgBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 7, msg_);
      }
      for (int i = 0; i < fields_.size(); i++) {
        output.writeMessage(8, fields_.get(i));
      }
      for (int i = 0; i < values_.size(); i++) {
        output.writeMessage(9, values_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, id_);
      }
      if (!getAppBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, app_);
      }
      if (!getMetricsBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, metrics_);
      }
      if (priority_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, priority_);
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, time_);
      }
      if (code_ != com.usthe.common.entity.message.CollectRep.Code.SUCCESS.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(6, code_);
      }
      if (!getMsgBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, msg_);
      }
      for (int i = 0; i < fields_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, fields_.get(i));
      }
      for (int i = 0; i < values_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, values_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.usthe.common.entity.message.CollectRep.MetricsData)) {
        return super.equals(obj);
      }
      com.usthe.common.entity.message.CollectRep.MetricsData other = (com.usthe.common.entity.message.CollectRep.MetricsData) obj;

      if (getId()
          != other.getId()) return false;
      if (!getApp()
          .equals(other.getApp())) return false;
      if (!getMetrics()
          .equals(other.getMetrics())) return false;
      if (getPriority()
          != other.getPriority()) return false;
      if (getTime()
          != other.getTime()) return false;
      if (code_ != other.code_) return false;
      if (!getMsg()
          .equals(other.getMsg())) return false;
      if (!getFieldsList()
          .equals(other.getFieldsList())) return false;
      if (!getValuesList()
          .equals(other.getValuesList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (37 * hash) + APP_FIELD_NUMBER;
      hash = (53 * hash) + getApp().hashCode();
      hash = (37 * hash) + METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getMetrics().hashCode();
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + getPriority();
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + code_;
      hash = (37 * hash) + MSG_FIELD_NUMBER;
      hash = (53 * hash) + getMsg().hashCode();
      if (getFieldsCount() > 0) {
        hash = (37 * hash) + FIELDS_FIELD_NUMBER;
        hash = (53 * hash) + getFieldsList().hashCode();
      }
      if (getValuesCount() > 0) {
        hash = (37 * hash) + VALUES_FIELD_NUMBER;
        hash = (53 * hash) + getValuesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.MetricsData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.usthe.common.entity.message.CollectRep.MetricsData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.usthe.common.entity.message.MetricsData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.usthe.common.entity.message.MetricsData)
        com.usthe.common.entity.message.CollectRep.MetricsDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_MetricsData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_MetricsData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.usthe.common.entity.message.CollectRep.MetricsData.class, com.usthe.common.entity.message.CollectRep.MetricsData.Builder.class);
      }

      // Construct using com.usthe.common.entity.message.CollectRep.MetricsData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getFieldsFieldBuilder();
          getValuesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0L;

        app_ = "";

        metrics_ = "";

        priority_ = 0;

        time_ = 0L;

        code_ = 0;

        msg_ = "";

        if (fieldsBuilder_ == null) {
          fields_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          fieldsBuilder_.clear();
        }
        if (valuesBuilder_ == null) {
          values_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          valuesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_MetricsData_descriptor;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.MetricsData getDefaultInstanceForType() {
        return com.usthe.common.entity.message.CollectRep.MetricsData.getDefaultInstance();
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.MetricsData build() {
        com.usthe.common.entity.message.CollectRep.MetricsData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.MetricsData buildPartial() {
        com.usthe.common.entity.message.CollectRep.MetricsData result = new com.usthe.common.entity.message.CollectRep.MetricsData(this);
        int from_bitField0_ = bitField0_;
        result.id_ = id_;
        result.app_ = app_;
        result.metrics_ = metrics_;
        result.priority_ = priority_;
        result.time_ = time_;
        result.code_ = code_;
        result.msg_ = msg_;
        if (fieldsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            fields_ = java.util.Collections.unmodifiableList(fields_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.fields_ = fields_;
        } else {
          result.fields_ = fieldsBuilder_.build();
        }
        if (valuesBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0)) {
            values_ = java.util.Collections.unmodifiableList(values_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.values_ = values_;
        } else {
          result.values_ = valuesBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.usthe.common.entity.message.CollectRep.MetricsData) {
          return mergeFrom((com.usthe.common.entity.message.CollectRep.MetricsData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.usthe.common.entity.message.CollectRep.MetricsData other) {
        if (other == com.usthe.common.entity.message.CollectRep.MetricsData.getDefaultInstance()) return this;
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        if (!other.getApp().isEmpty()) {
          app_ = other.app_;
          onChanged();
        }
        if (!other.getMetrics().isEmpty()) {
          metrics_ = other.metrics_;
          onChanged();
        }
        if (other.getPriority() != 0) {
          setPriority(other.getPriority());
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        if (other.code_ != 0) {
          setCodeValue(other.getCodeValue());
        }
        if (!other.getMsg().isEmpty()) {
          msg_ = other.msg_;
          onChanged();
        }
        if (fieldsBuilder_ == null) {
          if (!other.fields_.isEmpty()) {
            if (fields_.isEmpty()) {
              fields_ = other.fields_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFieldsIsMutable();
              fields_.addAll(other.fields_);
            }
            onChanged();
          }
        } else {
          if (!other.fields_.isEmpty()) {
            if (fieldsBuilder_.isEmpty()) {
              fieldsBuilder_.dispose();
              fieldsBuilder_ = null;
              fields_ = other.fields_;
              bitField0_ = (bitField0_ & ~0x00000001);
              fieldsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFieldsFieldBuilder() : null;
            } else {
              fieldsBuilder_.addAllMessages(other.fields_);
            }
          }
        }
        if (valuesBuilder_ == null) {
          if (!other.values_.isEmpty()) {
            if (values_.isEmpty()) {
              values_ = other.values_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureValuesIsMutable();
              values_.addAll(other.values_);
            }
            onChanged();
          }
        } else {
          if (!other.values_.isEmpty()) {
            if (valuesBuilder_.isEmpty()) {
              valuesBuilder_.dispose();
              valuesBuilder_ = null;
              values_ = other.values_;
              bitField0_ = (bitField0_ & ~0x00000002);
              valuesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getValuesFieldBuilder() : null;
            } else {
              valuesBuilder_.addAllMessages(other.values_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.usthe.common.entity.message.CollectRep.MetricsData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.usthe.common.entity.message.CollectRep.MetricsData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long id_ ;
      /**
       * <pre>
       * 监控的ID
       * </pre>
       *
       * <code>uint64 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <pre>
       * 监控的ID
       * </pre>
       *
       * <code>uint64 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控的ID
       * </pre>
       *
       * <code>uint64 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object app_ = "";
      /**
       * <pre>
       * 监控的类型 eg: linux | mysql | jvm
       * </pre>
       *
       * <code>string app = 2;</code>
       * @return The app.
       */
      public java.lang.String getApp() {
        java.lang.Object ref = app_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          app_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 监控的类型 eg: linux | mysql | jvm
       * </pre>
       *
       * <code>string app = 2;</code>
       * @return The bytes for app.
       */
      public com.google.protobuf.ByteString
          getAppBytes() {
        java.lang.Object ref = app_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          app_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 监控的类型 eg: linux | mysql | jvm
       * </pre>
       *
       * <code>string app = 2;</code>
       * @param value The app to set.
       * @return This builder for chaining.
       */
      public Builder setApp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        app_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控的类型 eg: linux | mysql | jvm
       * </pre>
       *
       * <code>string app = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearApp() {
        
        app_ = getDefaultInstance().getApp();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控的类型 eg: linux | mysql | jvm
       * </pre>
       *
       * <code>string app = 2;</code>
       * @param value The bytes for app to set.
       * @return This builder for chaining.
       */
      public Builder setAppBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        app_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object metrics_ = "";
      /**
       * <pre>
       * 监控采集的指标集合 eg: cpu | memory | health
       * </pre>
       *
       * <code>string metrics = 3;</code>
       * @return The metrics.
       */
      public java.lang.String getMetrics() {
        java.lang.Object ref = metrics_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          metrics_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 监控采集的指标集合 eg: cpu | memory | health
       * </pre>
       *
       * <code>string metrics = 3;</code>
       * @return The bytes for metrics.
       */
      public com.google.protobuf.ByteString
          getMetricsBytes() {
        java.lang.Object ref = metrics_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          metrics_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 监控采集的指标集合 eg: cpu | memory | health
       * </pre>
       *
       * <code>string metrics = 3;</code>
       * @param value The metrics to set.
       * @return This builder for chaining.
       */
      public Builder setMetrics(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        metrics_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控采集的指标集合 eg: cpu | memory | health
       * </pre>
       *
       * <code>string metrics = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMetrics() {
        
        metrics_ = getDefaultInstance().getMetrics();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控采集的指标集合 eg: cpu | memory | health
       * </pre>
       *
       * <code>string metrics = 3;</code>
       * @param value The bytes for metrics to set.
       * @return This builder for chaining.
       */
      public Builder setMetricsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        metrics_ = value;
        onChanged();
        return this;
      }

      private int priority_ ;
      /**
       * <pre>
       * 监控采集指标集合的采集优先级&gt;=0
       * </pre>
       *
       * <code>uint32 priority = 4;</code>
       * @return The priority.
       */
      @java.lang.Override
      public int getPriority() {
        return priority_;
      }
      /**
       * <pre>
       * 监控采集指标集合的采集优先级&gt;=0
       * </pre>
       *
       * <code>uint32 priority = 4;</code>
       * @param value The priority to set.
       * @return This builder for chaining.
       */
      public Builder setPriority(int value) {
        
        priority_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 监控采集指标集合的采集优先级&gt;=0
       * </pre>
       *
       * <code>uint32 priority = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriority() {
        
        priority_ = 0;
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <pre>
       * 采集时间
       * </pre>
       *
       * <code>uint64 time = 5;</code>
       * @return The time.
       */
      @java.lang.Override
      public long getTime() {
        return time_;
      }
      /**
       * <pre>
       * 采集时间
       * </pre>
       *
       * <code>uint64 time = 5;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(long value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集时间
       * </pre>
       *
       * <code>uint64 time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0L;
        onChanged();
        return this;
      }

      private int code_ = 0;
      /**
       * <pre>
       * 采集响应码
       * </pre>
       *
       * <code>.com.usthe.common.entity.message.Code code = 6;</code>
       * @return The enum numeric value on the wire for code.
       */
      @java.lang.Override public int getCodeValue() {
        return code_;
      }
      /**
       * <pre>
       * 采集响应码
       * </pre>
       *
       * <code>.com.usthe.common.entity.message.Code code = 6;</code>
       * @param value The enum numeric value on the wire for code to set.
       * @return This builder for chaining.
       */
      public Builder setCodeValue(int value) {
        
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集响应码
       * </pre>
       *
       * <code>.com.usthe.common.entity.message.Code code = 6;</code>
       * @return The code.
       */
      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.Code getCode() {
        @SuppressWarnings("deprecation")
        com.usthe.common.entity.message.CollectRep.Code result = com.usthe.common.entity.message.CollectRep.Code.valueOf(code_);
        return result == null ? com.usthe.common.entity.message.CollectRep.Code.UNRECOGNIZED : result;
      }
      /**
       * <pre>
       * 采集响应码
       * </pre>
       *
       * <code>.com.usthe.common.entity.message.Code code = 6;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(com.usthe.common.entity.message.CollectRep.Code value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        code_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集响应码
       * </pre>
       *
       * <code>.com.usthe.common.entity.message.Code code = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object msg_ = "";
      /**
       * <pre>
       * 采集响应信息
       * </pre>
       *
       * <code>string msg = 7;</code>
       * @return The msg.
       */
      public java.lang.String getMsg() {
        java.lang.Object ref = msg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          msg_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 采集响应信息
       * </pre>
       *
       * <code>string msg = 7;</code>
       * @return The bytes for msg.
       */
      public com.google.protobuf.ByteString
          getMsgBytes() {
        java.lang.Object ref = msg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          msg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 采集响应信息
       * </pre>
       *
       * <code>string msg = 7;</code>
       * @param value The msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        msg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集响应信息
       * </pre>
       *
       * <code>string msg = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearMsg() {
        
        msg_ = getDefaultInstance().getMsg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集响应信息
       * </pre>
       *
       * <code>string msg = 7;</code>
       * @param value The bytes for msg to set.
       * @return This builder for chaining.
       */
      public Builder setMsgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        msg_ = value;
        onChanged();
        return this;
      }

      private java.util.List<com.usthe.common.entity.message.CollectRep.Field> fields_ =
        java.util.Collections.emptyList();
      private void ensureFieldsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          fields_ = new java.util.ArrayList<com.usthe.common.entity.message.CollectRep.Field>(fields_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.usthe.common.entity.message.CollectRep.Field, com.usthe.common.entity.message.CollectRep.Field.Builder, com.usthe.common.entity.message.CollectRep.FieldOrBuilder> fieldsBuilder_;

      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public java.util.List<com.usthe.common.entity.message.CollectRep.Field> getFieldsList() {
        if (fieldsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(fields_);
        } else {
          return fieldsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public int getFieldsCount() {
        if (fieldsBuilder_ == null) {
          return fields_.size();
        } else {
          return fieldsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public com.usthe.common.entity.message.CollectRep.Field getFields(int index) {
        if (fieldsBuilder_ == null) {
          return fields_.get(index);
        } else {
          return fieldsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder setFields(
          int index, com.usthe.common.entity.message.CollectRep.Field value) {
        if (fieldsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldsIsMutable();
          fields_.set(index, value);
          onChanged();
        } else {
          fieldsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder setFields(
          int index, com.usthe.common.entity.message.CollectRep.Field.Builder builderForValue) {
        if (fieldsBuilder_ == null) {
          ensureFieldsIsMutable();
          fields_.set(index, builderForValue.build());
          onChanged();
        } else {
          fieldsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder addFields(com.usthe.common.entity.message.CollectRep.Field value) {
        if (fieldsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldsIsMutable();
          fields_.add(value);
          onChanged();
        } else {
          fieldsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder addFields(
          int index, com.usthe.common.entity.message.CollectRep.Field value) {
        if (fieldsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFieldsIsMutable();
          fields_.add(index, value);
          onChanged();
        } else {
          fieldsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder addFields(
          com.usthe.common.entity.message.CollectRep.Field.Builder builderForValue) {
        if (fieldsBuilder_ == null) {
          ensureFieldsIsMutable();
          fields_.add(builderForValue.build());
          onChanged();
        } else {
          fieldsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder addFields(
          int index, com.usthe.common.entity.message.CollectRep.Field.Builder builderForValue) {
        if (fieldsBuilder_ == null) {
          ensureFieldsIsMutable();
          fields_.add(index, builderForValue.build());
          onChanged();
        } else {
          fieldsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder addAllFields(
          java.lang.Iterable<? extends com.usthe.common.entity.message.CollectRep.Field> values) {
        if (fieldsBuilder_ == null) {
          ensureFieldsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, fields_);
          onChanged();
        } else {
          fieldsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder clearFields() {
        if (fieldsBuilder_ == null) {
          fields_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          fieldsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public Builder removeFields(int index) {
        if (fieldsBuilder_ == null) {
          ensureFieldsIsMutable();
          fields_.remove(index);
          onChanged();
        } else {
          fieldsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public com.usthe.common.entity.message.CollectRep.Field.Builder getFieldsBuilder(
          int index) {
        return getFieldsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public com.usthe.common.entity.message.CollectRep.FieldOrBuilder getFieldsOrBuilder(
          int index) {
        if (fieldsBuilder_ == null) {
          return fields_.get(index);  } else {
          return fieldsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public java.util.List<? extends com.usthe.common.entity.message.CollectRep.FieldOrBuilder> 
           getFieldsOrBuilderList() {
        if (fieldsBuilder_ != null) {
          return fieldsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(fields_);
        }
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public com.usthe.common.entity.message.CollectRep.Field.Builder addFieldsBuilder() {
        return getFieldsFieldBuilder().addBuilder(
            com.usthe.common.entity.message.CollectRep.Field.getDefaultInstance());
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public com.usthe.common.entity.message.CollectRep.Field.Builder addFieldsBuilder(
          int index) {
        return getFieldsFieldBuilder().addBuilder(
            index, com.usthe.common.entity.message.CollectRep.Field.getDefaultInstance());
      }
      /**
       * <pre>
       * 采集指标名
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.Field fields = 8;</code>
       */
      public java.util.List<com.usthe.common.entity.message.CollectRep.Field.Builder> 
           getFieldsBuilderList() {
        return getFieldsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.usthe.common.entity.message.CollectRep.Field, com.usthe.common.entity.message.CollectRep.Field.Builder, com.usthe.common.entity.message.CollectRep.FieldOrBuilder> 
          getFieldsFieldBuilder() {
        if (fieldsBuilder_ == null) {
          fieldsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.usthe.common.entity.message.CollectRep.Field, com.usthe.common.entity.message.CollectRep.Field.Builder, com.usthe.common.entity.message.CollectRep.FieldOrBuilder>(
                  fields_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          fields_ = null;
        }
        return fieldsBuilder_;
      }

      private java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow> values_ =
        java.util.Collections.emptyList();
      private void ensureValuesIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          values_ = new java.util.ArrayList<com.usthe.common.entity.message.CollectRep.ValueRow>(values_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.usthe.common.entity.message.CollectRep.ValueRow, com.usthe.common.entity.message.CollectRep.ValueRow.Builder, com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder> valuesBuilder_;

      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow> getValuesList() {
        if (valuesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(values_);
        } else {
          return valuesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public int getValuesCount() {
        if (valuesBuilder_ == null) {
          return values_.size();
        } else {
          return valuesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public com.usthe.common.entity.message.CollectRep.ValueRow getValues(int index) {
        if (valuesBuilder_ == null) {
          return values_.get(index);
        } else {
          return valuesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder setValues(
          int index, com.usthe.common.entity.message.CollectRep.ValueRow value) {
        if (valuesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValuesIsMutable();
          values_.set(index, value);
          onChanged();
        } else {
          valuesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder setValues(
          int index, com.usthe.common.entity.message.CollectRep.ValueRow.Builder builderForValue) {
        if (valuesBuilder_ == null) {
          ensureValuesIsMutable();
          values_.set(index, builderForValue.build());
          onChanged();
        } else {
          valuesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder addValues(com.usthe.common.entity.message.CollectRep.ValueRow value) {
        if (valuesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValuesIsMutable();
          values_.add(value);
          onChanged();
        } else {
          valuesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder addValues(
          int index, com.usthe.common.entity.message.CollectRep.ValueRow value) {
        if (valuesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureValuesIsMutable();
          values_.add(index, value);
          onChanged();
        } else {
          valuesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder addValues(
          com.usthe.common.entity.message.CollectRep.ValueRow.Builder builderForValue) {
        if (valuesBuilder_ == null) {
          ensureValuesIsMutable();
          values_.add(builderForValue.build());
          onChanged();
        } else {
          valuesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder addValues(
          int index, com.usthe.common.entity.message.CollectRep.ValueRow.Builder builderForValue) {
        if (valuesBuilder_ == null) {
          ensureValuesIsMutable();
          values_.add(index, builderForValue.build());
          onChanged();
        } else {
          valuesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder addAllValues(
          java.lang.Iterable<? extends com.usthe.common.entity.message.CollectRep.ValueRow> values) {
        if (valuesBuilder_ == null) {
          ensureValuesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, values_);
          onChanged();
        } else {
          valuesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder clearValues() {
        if (valuesBuilder_ == null) {
          values_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          valuesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public Builder removeValues(int index) {
        if (valuesBuilder_ == null) {
          ensureValuesIsMutable();
          values_.remove(index);
          onChanged();
        } else {
          valuesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public com.usthe.common.entity.message.CollectRep.ValueRow.Builder getValuesBuilder(
          int index) {
        return getValuesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder getValuesOrBuilder(
          int index) {
        if (valuesBuilder_ == null) {
          return values_.get(index);  } else {
          return valuesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public java.util.List<? extends com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder> 
           getValuesOrBuilderList() {
        if (valuesBuilder_ != null) {
          return valuesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(values_);
        }
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public com.usthe.common.entity.message.CollectRep.ValueRow.Builder addValuesBuilder() {
        return getValuesFieldBuilder().addBuilder(
            com.usthe.common.entity.message.CollectRep.ValueRow.getDefaultInstance());
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public com.usthe.common.entity.message.CollectRep.ValueRow.Builder addValuesBuilder(
          int index) {
        return getValuesFieldBuilder().addBuilder(
            index, com.usthe.common.entity.message.CollectRep.ValueRow.getDefaultInstance());
      }
      /**
       * <pre>
       * 采集指标值集合(fields作为字段名称与ValueRow映射)
       * </pre>
       *
       * <code>repeated .com.usthe.common.entity.message.ValueRow values = 9;</code>
       */
      public java.util.List<com.usthe.common.entity.message.CollectRep.ValueRow.Builder> 
           getValuesBuilderList() {
        return getValuesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.usthe.common.entity.message.CollectRep.ValueRow, com.usthe.common.entity.message.CollectRep.ValueRow.Builder, com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder> 
          getValuesFieldBuilder() {
        if (valuesBuilder_ == null) {
          valuesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.usthe.common.entity.message.CollectRep.ValueRow, com.usthe.common.entity.message.CollectRep.ValueRow.Builder, com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder>(
                  values_,
                  ((bitField0_ & 0x00000002) != 0),
                  getParentForChildren(),
                  isClean());
          values_ = null;
        }
        return valuesBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.usthe.common.entity.message.MetricsData)
    }

    // @@protoc_insertion_point(class_scope:com.usthe.common.entity.message.MetricsData)
    private static final com.usthe.common.entity.message.CollectRep.MetricsData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.usthe.common.entity.message.CollectRep.MetricsData();
    }

    public static com.usthe.common.entity.message.CollectRep.MetricsData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MetricsData>
        PARSER = new com.google.protobuf.AbstractParser<MetricsData>() {
      @java.lang.Override
      public MetricsData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MetricsData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MetricsData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MetricsData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.MetricsData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FieldOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.usthe.common.entity.message.Field)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 指标采集字符名称
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * 指标采集字符名称
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * 字段类型：0-number数字 1-string字符串
     * </pre>
     *
     * <code>uint32 type = 2;</code>
     * @return The type.
     */
    int getType();
  }
  /**
   * Protobuf type {@code com.usthe.common.entity.message.Field}
   */
  public static final class Field extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.usthe.common.entity.message.Field)
      FieldOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Field.newBuilder() to construct.
    private Field(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Field() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Field();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Field(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
            case 16: {

              type_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_Field_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_Field_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.usthe.common.entity.message.CollectRep.Field.class, com.usthe.common.entity.message.CollectRep.Field.Builder.class);
    }

    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * 指标采集字符名称
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 指标采集字符名称
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <pre>
     * 字段类型：0-number数字 1-string字符串
     * </pre>
     *
     * <code>uint32 type = 2;</code>
     * @return The type.
     */
    @java.lang.Override
    public int getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (type_ != 0) {
        output.writeUInt32(2, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.usthe.common.entity.message.CollectRep.Field)) {
        return super.equals(obj);
      }
      com.usthe.common.entity.message.CollectRep.Field other = (com.usthe.common.entity.message.CollectRep.Field) obj;

      if (!getName()
          .equals(other.getName())) return false;
      if (getType()
          != other.getType()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + NAME_FIELD_NUMBER;
      hash = (53 * hash) + getName().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.Field parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.usthe.common.entity.message.CollectRep.Field prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.usthe.common.entity.message.Field}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.usthe.common.entity.message.Field)
        com.usthe.common.entity.message.CollectRep.FieldOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_Field_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_Field_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.usthe.common.entity.message.CollectRep.Field.class, com.usthe.common.entity.message.CollectRep.Field.Builder.class);
      }

      // Construct using com.usthe.common.entity.message.CollectRep.Field.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";

        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_Field_descriptor;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.Field getDefaultInstanceForType() {
        return com.usthe.common.entity.message.CollectRep.Field.getDefaultInstance();
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.Field build() {
        com.usthe.common.entity.message.CollectRep.Field result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.Field buildPartial() {
        com.usthe.common.entity.message.CollectRep.Field result = new com.usthe.common.entity.message.CollectRep.Field(this);
        result.name_ = name_;
        result.type_ = type_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.usthe.common.entity.message.CollectRep.Field) {
          return mergeFrom((com.usthe.common.entity.message.CollectRep.Field)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.usthe.common.entity.message.CollectRep.Field other) {
        if (other == com.usthe.common.entity.message.CollectRep.Field.getDefaultInstance()) return this;
        if (!other.getName().isEmpty()) {
          name_ = other.name_;
          onChanged();
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.usthe.common.entity.message.CollectRep.Field parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.usthe.common.entity.message.CollectRep.Field) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * 指标采集字符名称
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 指标采集字符名称
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 指标采集字符名称
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 指标采集字符名称
       * </pre>
       *
       * <code>string name = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 指标采集字符名称
       * </pre>
       *
       * <code>string name = 1;</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        name_ = value;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       * 字段类型：0-number数字 1-string字符串
       * </pre>
       *
       * <code>uint32 type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       * 字段类型：0-number数字 1-string字符串
       * </pre>
       *
       * <code>uint32 type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 字段类型：0-number数字 1-string字符串
       * </pre>
       *
       * <code>uint32 type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.usthe.common.entity.message.Field)
    }

    // @@protoc_insertion_point(class_scope:com.usthe.common.entity.message.Field)
    private static final com.usthe.common.entity.message.CollectRep.Field DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.usthe.common.entity.message.CollectRep.Field();
    }

    public static com.usthe.common.entity.message.CollectRep.Field getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Field>
        PARSER = new com.google.protobuf.AbstractParser<Field>() {
      @java.lang.Override
      public Field parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Field(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Field> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Field> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.Field getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ValueRowOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.usthe.common.entity.message.ValueRow)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 主键实例，唯一标识这行数据
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @return The instance.
     */
    java.lang.String getInstance();
    /**
     * <pre>
     * 主键实例，唯一标识这行数据
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @return The bytes for instance.
     */
    com.google.protobuf.ByteString
        getInstanceBytes();

    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @return A list containing the columns.
     */
    java.util.List<java.lang.String>
        getColumnsList();
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @return The count of columns.
     */
    int getColumnsCount();
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @param index The index of the element to return.
     * @return The columns at the given index.
     */
    java.lang.String getColumns(int index);
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the columns at the given index.
     */
    com.google.protobuf.ByteString
        getColumnsBytes(int index);
  }
  /**
   * Protobuf type {@code com.usthe.common.entity.message.ValueRow}
   */
  public static final class ValueRow extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:com.usthe.common.entity.message.ValueRow)
      ValueRowOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ValueRow.newBuilder() to construct.
    private ValueRow(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ValueRow() {
      instance_ = "";
      columns_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ValueRow();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ValueRow(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              instance_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                columns_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000001;
              }
              columns_.add(s);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          columns_ = columns_.getUnmodifiableView();
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_ValueRow_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_ValueRow_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.usthe.common.entity.message.CollectRep.ValueRow.class, com.usthe.common.entity.message.CollectRep.ValueRow.Builder.class);
    }

    public static final int INSTANCE_FIELD_NUMBER = 1;
    private volatile java.lang.Object instance_;
    /**
     * <pre>
     * 主键实例，唯一标识这行数据
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @return The instance.
     */
    @java.lang.Override
    public java.lang.String getInstance() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        instance_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * 主键实例，唯一标识这行数据
     * </pre>
     *
     * <code>string instance = 1;</code>
     * @return The bytes for instance.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getInstanceBytes() {
      java.lang.Object ref = instance_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        instance_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int COLUMNS_FIELD_NUMBER = 2;
    private com.google.protobuf.LazyStringList columns_;
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @return A list containing the columns.
     */
    public com.google.protobuf.ProtocolStringList
        getColumnsList() {
      return columns_;
    }
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @return The count of columns.
     */
    public int getColumnsCount() {
      return columns_.size();
    }
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @param index The index of the element to return.
     * @return The columns at the given index.
     */
    public java.lang.String getColumns(int index) {
      return columns_.get(index);
    }
    /**
     * <pre>
     * 采集指标值
     * </pre>
     *
     * <code>repeated string columns = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the columns at the given index.
     */
    public com.google.protobuf.ByteString
        getColumnsBytes(int index) {
      return columns_.getByteString(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getInstanceBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, instance_);
      }
      for (int i = 0; i < columns_.size(); i++) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, columns_.getRaw(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getInstanceBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, instance_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < columns_.size(); i++) {
          dataSize += computeStringSizeNoTag(columns_.getRaw(i));
        }
        size += dataSize;
        size += 1 * getColumnsList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.usthe.common.entity.message.CollectRep.ValueRow)) {
        return super.equals(obj);
      }
      com.usthe.common.entity.message.CollectRep.ValueRow other = (com.usthe.common.entity.message.CollectRep.ValueRow) obj;

      if (!getInstance()
          .equals(other.getInstance())) return false;
      if (!getColumnsList()
          .equals(other.getColumnsList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + INSTANCE_FIELD_NUMBER;
      hash = (53 * hash) + getInstance().hashCode();
      if (getColumnsCount() > 0) {
        hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
        hash = (53 * hash) + getColumnsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.usthe.common.entity.message.CollectRep.ValueRow parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.usthe.common.entity.message.CollectRep.ValueRow prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.usthe.common.entity.message.ValueRow}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.usthe.common.entity.message.ValueRow)
        com.usthe.common.entity.message.CollectRep.ValueRowOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_ValueRow_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_ValueRow_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.usthe.common.entity.message.CollectRep.ValueRow.class, com.usthe.common.entity.message.CollectRep.ValueRow.Builder.class);
      }

      // Construct using com.usthe.common.entity.message.CollectRep.ValueRow.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        instance_ = "";

        columns_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.usthe.common.entity.message.CollectRep.internal_static_com_usthe_common_entity_message_ValueRow_descriptor;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.ValueRow getDefaultInstanceForType() {
        return com.usthe.common.entity.message.CollectRep.ValueRow.getDefaultInstance();
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.ValueRow build() {
        com.usthe.common.entity.message.CollectRep.ValueRow result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.usthe.common.entity.message.CollectRep.ValueRow buildPartial() {
        com.usthe.common.entity.message.CollectRep.ValueRow result = new com.usthe.common.entity.message.CollectRep.ValueRow(this);
        int from_bitField0_ = bitField0_;
        result.instance_ = instance_;
        if (((bitField0_ & 0x00000001) != 0)) {
          columns_ = columns_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columns_ = columns_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.usthe.common.entity.message.CollectRep.ValueRow) {
          return mergeFrom((com.usthe.common.entity.message.CollectRep.ValueRow)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.usthe.common.entity.message.CollectRep.ValueRow other) {
        if (other == com.usthe.common.entity.message.CollectRep.ValueRow.getDefaultInstance()) return this;
        if (!other.getInstance().isEmpty()) {
          instance_ = other.instance_;
          onChanged();
        }
        if (!other.columns_.isEmpty()) {
          if (columns_.isEmpty()) {
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnsIsMutable();
            columns_.addAll(other.columns_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.usthe.common.entity.message.CollectRep.ValueRow parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.usthe.common.entity.message.CollectRep.ValueRow) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object instance_ = "";
      /**
       * <pre>
       * 主键实例，唯一标识这行数据
       * </pre>
       *
       * <code>string instance = 1;</code>
       * @return The instance.
       */
      public java.lang.String getInstance() {
        java.lang.Object ref = instance_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          instance_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * 主键实例，唯一标识这行数据
       * </pre>
       *
       * <code>string instance = 1;</code>
       * @return The bytes for instance.
       */
      public com.google.protobuf.ByteString
          getInstanceBytes() {
        java.lang.Object ref = instance_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          instance_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * 主键实例，唯一标识这行数据
       * </pre>
       *
       * <code>string instance = 1;</code>
       * @param value The instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstance(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        instance_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 主键实例，唯一标识这行数据
       * </pre>
       *
       * <code>string instance = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearInstance() {
        
        instance_ = getDefaultInstance().getInstance();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 主键实例，唯一标识这行数据
       * </pre>
       *
       * <code>string instance = 1;</code>
       * @param value The bytes for instance to set.
       * @return This builder for chaining.
       */
      public Builder setInstanceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        instance_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList columns_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureColumnsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          columns_ = new com.google.protobuf.LazyStringArrayList(columns_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @return A list containing the columns.
       */
      public com.google.protobuf.ProtocolStringList
          getColumnsList() {
        return columns_.getUnmodifiableView();
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @return The count of columns.
       */
      public int getColumnsCount() {
        return columns_.size();
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param index The index of the element to return.
       * @return The columns at the given index.
       */
      public java.lang.String getColumns(int index) {
        return columns_.get(index);
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param index The index of the value to return.
       * @return The bytes of the columns at the given index.
       */
      public com.google.protobuf.ByteString
          getColumnsBytes(int index) {
        return columns_.getByteString(index);
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param index The index to set the value at.
       * @param value The columns to set.
       * @return This builder for chaining.
       */
      public Builder setColumns(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureColumnsIsMutable();
        columns_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param value The columns to add.
       * @return This builder for chaining.
       */
      public Builder addColumns(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param values The columns to add.
       * @return This builder for chaining.
       */
      public Builder addAllColumns(
          java.lang.Iterable<java.lang.String> values) {
        ensureColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columns_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearColumns() {
        columns_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * 采集指标值
       * </pre>
       *
       * <code>repeated string columns = 2;</code>
       * @param value The bytes of the columns to add.
       * @return This builder for chaining.
       */
      public Builder addColumnsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:com.usthe.common.entity.message.ValueRow)
    }

    // @@protoc_insertion_point(class_scope:com.usthe.common.entity.message.ValueRow)
    private static final com.usthe.common.entity.message.CollectRep.ValueRow DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.usthe.common.entity.message.CollectRep.ValueRow();
    }

    public static com.usthe.common.entity.message.CollectRep.ValueRow getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ValueRow>
        PARSER = new com.google.protobuf.AbstractParser<ValueRow>() {
      @java.lang.Override
      public ValueRow parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ValueRow(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ValueRow> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ValueRow> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.usthe.common.entity.message.CollectRep.ValueRow getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_usthe_common_entity_message_MetricsData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_usthe_common_entity_message_MetricsData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_usthe_common_entity_message_Field_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_usthe_common_entity_message_Field_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_usthe_common_entity_message_ValueRow_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_usthe_common_entity_message_ValueRow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021collect_rep.proto\022\037com.usthe.common.en" +
      "tity.message\"\214\002\n\013MetricsData\022\n\n\002id\030\001 \001(\004" +
      "\022\013\n\003app\030\002 \001(\t\022\017\n\007metrics\030\003 \001(\t\022\020\n\010priori" +
      "ty\030\004 \001(\r\022\014\n\004time\030\005 \001(\004\0223\n\004code\030\006 \001(\0162%.c" +
      "om.usthe.common.entity.message.Code\022\013\n\003m" +
      "sg\030\007 \001(\t\0226\n\006fields\030\010 \003(\0132&.com.usthe.com" +
      "mon.entity.message.Field\0229\n\006values\030\t \003(\013" +
      "2).com.usthe.common.entity.message.Value" +
      "Row\"#\n\005Field\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\r" +
      "\"-\n\010ValueRow\022\020\n\010instance\030\001 \001(\t\022\017\n\007column" +
      "s\030\002 \003(\t*b\n\004Code\022\013\n\007SUCCESS\020\000\022\020\n\014UN_AVAIL" +
      "ABLE\020\001\022\020\n\014UN_REACHABLE\020\002\022\022\n\016UN_CONNECTAB" +
      "LE\020\003\022\010\n\004FAIL\020\004\022\013\n\007TIMEOUT\020\005b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_usthe_common_entity_message_MetricsData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_usthe_common_entity_message_MetricsData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_usthe_common_entity_message_MetricsData_descriptor,
        new java.lang.String[] { "Id", "App", "Metrics", "Priority", "Time", "Code", "Msg", "Fields", "Values", });
    internal_static_com_usthe_common_entity_message_Field_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_usthe_common_entity_message_Field_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_usthe_common_entity_message_Field_descriptor,
        new java.lang.String[] { "Name", "Type", });
    internal_static_com_usthe_common_entity_message_ValueRow_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_usthe_common_entity_message_ValueRow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_usthe_common_entity_message_ValueRow_descriptor,
        new java.lang.String[] { "Instance", "Columns", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
