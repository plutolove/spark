package org.apache.spark.sql.catalyst;
public  class FooWithAnnotation implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String f1 ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> f2 ()  { throw new RuntimeException(); }
  // not preceding
  public   FooWithAnnotation (java.lang.String f1, scala.Option<java.lang.String> f2)  { throw new RuntimeException(); }
}
