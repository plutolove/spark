package org.apache.spark.serializer;
public  class UnserializableClass {
  // not preceding
  public   UnserializableClass ()  { throw new RuntimeException(); }
  // not preceding
  public <T extends java.lang.Object> java.lang.String op (T x)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> boolean pred (T x)  { throw new RuntimeException(); }
}
