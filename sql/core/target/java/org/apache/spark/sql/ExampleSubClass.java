package org.apache.spark.sql;
public  class ExampleSubClass extends org.apache.spark.sql.ExampleBaseClass implements org.apache.spark.sql.IExampleSubType {
  // not preceding
  public   ExampleSubClass (int field)  { throw new RuntimeException(); }
  // not preceding
  public  int field ()  { throw new RuntimeException(); }
}
