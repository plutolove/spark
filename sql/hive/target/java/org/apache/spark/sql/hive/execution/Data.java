package org.apache.spark.sql.hive.execution;
public  class Data implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int a ()  { throw new RuntimeException(); }
  public  int B ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.Nested n ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.hive.execution.Nested> nestedArray ()  { throw new RuntimeException(); }
  // not preceding
  public   Data (int a, int B, org.apache.spark.sql.hive.execution.Nested n, scala.collection.Seq<org.apache.spark.sql.hive.execution.Nested> nestedArray)  { throw new RuntimeException(); }
}
