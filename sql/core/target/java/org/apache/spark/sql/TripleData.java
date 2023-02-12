package org.apache.spark.sql;
public  class TripleData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int id ()  { throw new RuntimeException(); }
  public  java.lang.String val1 ()  { throw new RuntimeException(); }
  public  long val2 ()  { throw new RuntimeException(); }
  // not preceding
  public   TripleData (int id, java.lang.String val1, long val2)  { throw new RuntimeException(); }
}
