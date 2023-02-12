package org.apache.spark.sql;
public  class Foo implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.String> bar ()  { throw new RuntimeException(); }
  // not preceding
  public   Foo (scala.Option<java.lang.String> bar)  { throw new RuntimeException(); }
}
