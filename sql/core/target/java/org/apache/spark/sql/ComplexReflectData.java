package org.apache.spark.sql;
public  class ComplexReflectData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Option<java.lang.Object>> arrayFieldContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapFieldContainsNull ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Data dataField ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexReflectData (scala.collection.Seq<java.lang.Object> arrayField, scala.collection.Seq<scala.Option<java.lang.Object>> arrayFieldContainsNull, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField, scala.collection.immutable.Map<java.lang.Object, scala.Option<java.lang.Object>> mapFieldContainsNull, org.apache.spark.sql.Data dataField)  { throw new RuntimeException(); }
}
