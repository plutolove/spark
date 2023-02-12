package org.apache.spark.sql.catalyst.encoders;
public  class RepeatedData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.Object, java.lang.Object> mapField ()  { throw new RuntimeException(); }
  public  scala.collection.Map<java.lang.Object, java.lang.Long> mapFieldNull ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.PrimitiveData structField ()  { throw new RuntimeException(); }
  // not preceding
  public   RepeatedData (scala.collection.Seq<java.lang.Object> arrayField, scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull, scala.collection.Map<java.lang.Object, java.lang.Object> mapField, scala.collection.Map<java.lang.Object, java.lang.Long> mapFieldNull, org.apache.spark.sql.catalyst.PrimitiveData structField)  { throw new RuntimeException(); }
}
