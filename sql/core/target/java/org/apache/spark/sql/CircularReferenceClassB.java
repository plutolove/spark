package org.apache.spark.sql;
public  class CircularReferenceClassB implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.CircularReferenceClassA cls ()  { throw new RuntimeException(); }
  // not preceding
  public   CircularReferenceClassB (org.apache.spark.sql.CircularReferenceClassA cls)  { throw new RuntimeException(); }
}
