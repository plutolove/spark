package org.apache.spark.sql;
public  class CircularReferenceClassA implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.CircularReferenceClassB cls ()  { throw new RuntimeException(); }
  // not preceding
  public   CircularReferenceClassA (org.apache.spark.sql.CircularReferenceClassB cls)  { throw new RuntimeException(); }
}
