package org.apache.spark.sql;
public  class Route implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String src ()  { throw new RuntimeException(); }
  public  java.lang.String dest ()  { throw new RuntimeException(); }
  public  int cost ()  { throw new RuntimeException(); }
  // not preceding
  public   Route (java.lang.String src, java.lang.String dest, int cost)  { throw new RuntimeException(); }
}