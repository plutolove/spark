package org.apache.spark.serializer;
public  class SerializableClassWithWriteObject implements java.io.Serializable {
  // not preceding
  public   SerializableClassWithWriteObject (java.lang.Object objectField)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Object objectField ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.serializer.SerializableClass1 serializableObjectField ()  { throw new RuntimeException(); }
}
