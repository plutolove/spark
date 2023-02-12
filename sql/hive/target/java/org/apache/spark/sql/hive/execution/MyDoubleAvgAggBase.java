package org.apache.spark.sql.hive.execution;
public  class MyDoubleAvgAggBase extends org.apache.spark.sql.expressions.Aggregator<java.lang.Double, scala.Tuple2<java.lang.Object, java.lang.Object>, java.lang.Double> {
  // not preceding
  public   MyDoubleAvgAggBase ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<scala.Tuple2<java.lang.Object, java.lang.Object>> bufferEncoder ()  { throw new RuntimeException(); }
  public  java.lang.Double finish (scala.Tuple2<java.lang.Object, java.lang.Object> r)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> merge (scala.Tuple2<java.lang.Object, java.lang.Object> b1, scala.Tuple2<java.lang.Object, java.lang.Object> b2)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Encoder<java.lang.Double> outputEncoder ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, java.lang.Object> reduce (scala.Tuple2<java.lang.Object, java.lang.Object> b, java.lang.Double a)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Tuple2<java.lang.Object, java.lang.Object> zero ()  { throw new RuntimeException(); }
}
