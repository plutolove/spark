package org.apache.spark.sql;
public  class TestDataPoint implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int x ()  { throw new RuntimeException(); }
  public  double y ()  { throw new RuntimeException(); }
  public  java.lang.String s ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.TestDataPoint2 t ()  { throw new RuntimeException(); }
  // not preceding
  public   TestDataPoint (int x, double y, java.lang.String s, org.apache.spark.sql.TestDataPoint2 t)  { throw new RuntimeException(); }
}
