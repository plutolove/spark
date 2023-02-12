package org.apache.spark.sql;
public  class ExampleBaseClass implements org.apache.spark.sql.IExampleBaseType {
  // not preceding
  public   ExampleBaseClass (int field)  { throw new RuntimeException(); }
  // not preceding
  public  int field ()  { throw new RuntimeException(); }
}
