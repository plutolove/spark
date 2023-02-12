package org.apache.spark.sql.catalyst;
public  class ComplexData implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.Object> arrayField ()  { throw new RuntimeException(); }
  public  int[] arrayField1 ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<java.lang.Object> arrayField2 ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.Object, java.lang.Long> mapFieldValueContainsNull ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.PrimitiveData structField ()  { throw new RuntimeException(); }
  public  int[][] nestedArrayField ()  { throw new RuntimeException(); }
  // not preceding
  public   ComplexData (scala.collection.Seq<java.lang.Object> arrayField, int[] arrayField1, scala.collection.immutable.List<java.lang.Object> arrayField2, scala.collection.Seq<java.lang.Integer> arrayFieldContainsNull, scala.collection.immutable.Map<java.lang.Object, java.lang.Object> mapField, scala.collection.immutable.Map<java.lang.Object, java.lang.Long> mapFieldValueContainsNull, org.apache.spark.sql.catalyst.PrimitiveData structField, int[][] nestedArrayField)  { throw new RuntimeException(); }
}
