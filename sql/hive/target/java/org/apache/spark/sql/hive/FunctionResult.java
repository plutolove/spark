package org.apache.spark.sql.hive;
public  class FunctionResult implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String f1 ()  { throw new RuntimeException(); }
  public  java.lang.String f2 ()  { throw new RuntimeException(); }
  // not preceding
  public   FunctionResult (java.lang.String f1, java.lang.String f2)  { throw new RuntimeException(); }
}
