package org.apache.spark.sql.execution.streaming.state;
public  class NestedStruct implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int i ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.Struct nested ()  { throw new RuntimeException(); }
  // not preceding
  public   NestedStruct (int i, org.apache.spark.sql.execution.streaming.state.Struct nested)  { throw new RuntimeException(); }
}
