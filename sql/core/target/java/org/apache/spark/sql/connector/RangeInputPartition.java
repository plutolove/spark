package org.apache.spark.sql.connector;
public  class RangeInputPartition implements org.apache.spark.sql.connector.read.InputPartition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int start ()  { throw new RuntimeException(); }
  public  int end ()  { throw new RuntimeException(); }
  // not preceding
  public   RangeInputPartition (int start, int end)  { throw new RuntimeException(); }
}
