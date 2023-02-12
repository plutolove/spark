package org.apache.spark.sql;
public  class NestedData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int id ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.InnerData> param ()  { throw new RuntimeException(); }
  // not preceding
  public   NestedData (int id, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.InnerData> param)  { throw new RuntimeException(); }
}
