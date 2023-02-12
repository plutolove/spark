package org.apache.spark.util;
public  class TestCreateNullValue {
  // not preceding
  public   TestCreateNullValue ()  { throw new RuntimeException(); }
  public  int getX ()  { throw new RuntimeException(); }
  public  void run ()  { throw new RuntimeException(); }
  // not preceding
  public  int x ()  { throw new RuntimeException(); }
}
