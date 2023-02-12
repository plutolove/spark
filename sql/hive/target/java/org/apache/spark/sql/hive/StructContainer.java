package org.apache.spark.sql.hive;
public  class StructContainer implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int intStructField ()  { throw new RuntimeException(); }
  public  java.lang.String stringStructField ()  { throw new RuntimeException(); }
  // not preceding
  public   StructContainer (int intStructField, java.lang.String stringStructField)  { throw new RuntimeException(); }
}
