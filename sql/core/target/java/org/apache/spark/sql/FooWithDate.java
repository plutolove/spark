package org.apache.spark.sql;
  class FooWithDate implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.time.LocalDateTime date ()  { throw new RuntimeException(); }
  public  java.lang.String s ()  { throw new RuntimeException(); }
  public  int i ()  { throw new RuntimeException(); }
  // not preceding
  public   FooWithDate (java.time.LocalDateTime date, java.lang.String s, int i)  { throw new RuntimeException(); }
}
