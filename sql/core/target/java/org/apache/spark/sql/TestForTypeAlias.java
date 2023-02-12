package org.apache.spark.sql;
// not preceding
public  class TestForTypeAlias {
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> tupleTypeAlias ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Object> nestedTupleTypeAlias ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> seqOfTupleTypeAlias ()  { throw new RuntimeException(); }
}
