package org.apache.spark.util;
public  class TestClassWithoutDefaultConstructor implements scala.Serializable {
  // not preceding
  public   TestClassWithoutDefaultConstructor (int x)  { throw new RuntimeException(); }
  // not preceding
  public  int getX ()  { throw new RuntimeException(); }
  public  int run ()  { throw new RuntimeException(); }
}
