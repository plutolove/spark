package org.apache.spark.serializer;
public  class ExternalizableClass implements java.io.Externalizable {
  // not preceding
  public   ExternalizableClass (java.lang.Object objectField)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.serializer.SerializableClass1 serializableObjectField ()  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}
