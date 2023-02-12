package org.apache.spark.sql;
public  class ComplexMapClass implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.MapClass map ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.LHMapClass lhmap ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexMapClass (org.apache.spark.sql.MapClass map, org.apache.spark.sql.LHMapClass lhmap)  { throw new RuntimeException(); }
}
