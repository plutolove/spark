package org.apache.spark.sql.hive.execution;
public  class MockUDAFBuffer extends org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AbstractAggregationBuffer {
  // not preceding
  public   MockUDAFBuffer (long nonNullCount, long nullCount)  { throw new RuntimeException(); }
  // not preceding
  public  int estimate ()  { throw new RuntimeException(); }
  // not preceding
  public  long nonNullCount ()  { throw new RuntimeException(); }
  public  long nullCount ()  { throw new RuntimeException(); }
}
