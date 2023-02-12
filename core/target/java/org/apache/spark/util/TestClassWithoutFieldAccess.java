package org.apache.spark.util;
public  class TestClassWithoutFieldAccess {
  // not preceding
  public   TestClassWithoutFieldAccess ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.util.NonSerializable nonSer ()  { throw new RuntimeException(); }
  public  int run ()  { throw new RuntimeException(); }
}
