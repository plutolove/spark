package org.apache.spark.sql.hive.execution;
// not preceding
public  class LongProductSumAgg$ extends org.apache.spark.sql.expressions.Aggregator<scala.Tuple2<java.lang.Long, java.lang.Long>, java.lang.Object, java.lang.Long> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LongProductSumAgg$ MODULE$ = null;
  public   LongProductSumAgg$ ()  { throw new RuntimeException(); }
  // not preceding
  public  long zero ()  { throw new RuntimeException(); }
  public  long reduce (long b, scala.Tuple2<java.lang.Long, java.lang.Long> a)  { throw new RuntimeException(); }
  public  long merge (long b1, long b2)  { throw new RuntimeException(); }
  public  java.lang.Long finish (long r)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Object> bufferEncoder ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Long> outputEncoder ()  { throw new RuntimeException(); }
}
