package org.apache.spark.sql.execution.streaming.sources;
public  class KV implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int key ()  { throw new RuntimeException(); }
  public  long value ()  { throw new RuntimeException(); }
  // not preceding
  public   KV (int key, long value)  { throw new RuntimeException(); }
}
