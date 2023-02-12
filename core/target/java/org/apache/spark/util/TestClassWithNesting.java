package org.apache.spark.util;
public  class TestClassWithNesting implements scala.Serializable {
  // not preceding
  public   TestClassWithNesting (int y)  { throw new RuntimeException(); }
  // not preceding
  public  int getY ()  { throw new RuntimeException(); }
  public  int run ()  { throw new RuntimeException(); }
  // not preceding
  public  int y ()  { throw new RuntimeException(); }
}
