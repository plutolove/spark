package org.apache.spark;
public  class NonSerializableUserException extends java.lang.RuntimeException {
  // not preceding
  public   NonSerializableUserException ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.util.NonSerializable nonSerializableInstanceVariable ()  { throw new RuntimeException(); }
}
