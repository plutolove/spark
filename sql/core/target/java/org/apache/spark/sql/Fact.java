package org.apache.spark.sql;
public  class Fact implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int date ()  { throw new RuntimeException(); }
  public  int hour ()  { throw new RuntimeException(); }
  public  int minute ()  { throw new RuntimeException(); }
  public  java.lang.String room_name ()  { throw new RuntimeException(); }
  public  double temp ()  { throw new RuntimeException(); }
  // not preceding
  public   Fact (int date, int hour, int minute, java.lang.String room_name, double temp)  { throw new RuntimeException(); }
}
