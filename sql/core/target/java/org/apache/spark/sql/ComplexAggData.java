package org.apache.spark.sql;
public  class ComplexAggData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.AggData d1 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.AggData d2 ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexAggData (org.apache.spark.sql.AggData d1, org.apache.spark.sql.AggData d2)  { throw new RuntimeException(); }
}
