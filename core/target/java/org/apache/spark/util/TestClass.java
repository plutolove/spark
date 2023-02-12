package org.apache.spark.util;
public  class TestClass implements scala.Serializable {
  // not preceding
  public   TestClass ()  { throw new RuntimeException(); }
  public  int getX ()  { throw new RuntimeException(); }
  public  int run ()  { throw new RuntimeException(); }
  // not preceding
  public  int x ()  { throw new RuntimeException(); }
}
