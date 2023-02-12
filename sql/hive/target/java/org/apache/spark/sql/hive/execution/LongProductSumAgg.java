package org.apache.spark.sql.hive.execution;
// not preceding
public  class LongProductSumAgg {
  // not preceding
  static public  long zero ()  { throw new RuntimeException(); }
  static public  long reduce (long b, scala.Tuple2<java.lang.Long, java.lang.Long> a)  { throw new RuntimeException(); }
  static public  long merge (long b1, long b2)  { throw new RuntimeException(); }
  static public  java.lang.Long finish (long r)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<java.lang.Object> bufferEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.Encoder<java.lang.Long> outputEncoder ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.TypedColumn<IN, OUT> toColumn ()  { throw new RuntimeException(); }
}
