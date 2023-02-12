package org.apache.spark.sql;
public  class CircularReferenceClassC implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.CircularReferenceClassC[] ar ()  { throw new RuntimeException(); }
  // not preceding
  public   CircularReferenceClassC (org.apache.spark.sql.CircularReferenceClassC[] ar)  { throw new RuntimeException(); }
}
