package org.apache.spark.sql;
public  class ComplexClass implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SeqClass seq ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.ListClass list ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.QueueClass queue ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexClass (org.apache.spark.sql.SeqClass seq, org.apache.spark.sql.ListClass list, org.apache.spark.sql.QueueClass queue)  { throw new RuntimeException(); }
}
