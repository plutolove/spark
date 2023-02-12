package org.apache.spark.sql.hive;
public  class ParquetDataWithComplexTypes implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int intField ()  { throw new RuntimeException(); }
  public  java.lang.String stringField ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.StructContainer structField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetDataWithComplexTypes (int intField, java.lang.String stringField, org.apache.spark.sql.hive.StructContainer structField, scala.collection.Seq<java.lang.Object> arrayField)  { throw new RuntimeException(); }
}
