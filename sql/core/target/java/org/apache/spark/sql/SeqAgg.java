package org.apache.spark.sql;
// not preceding
public  class SeqAgg {
  // not preceding
  static public  scala.collection.Seq<java.lang.Object> zero ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> reduce (scala.collection.Seq<java.lang.Object> b, org.apache.spark.sql.AggData a)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> merge (scala.collection.Seq<java.lang.Object> b1, scala.collection.Seq<java.lang.Object> b2)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> finish (scala.collection.Seq<java.lang.Object> r)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>>> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}
