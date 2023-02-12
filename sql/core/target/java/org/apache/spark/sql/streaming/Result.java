package org.apache.spark.sql.streaming;
public  class Result implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  long key ()  { throw new RuntimeException(); }
  public  int count ()  { throw new RuntimeException(); }
  // not preceding
  public   Result (long key, int count)  { throw new RuntimeException(); }
}
