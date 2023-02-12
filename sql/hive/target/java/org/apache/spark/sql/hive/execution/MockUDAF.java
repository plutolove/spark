package org.apache.spark.sql.hive.execution;
/**
 * A testing Hive UDAF that computes the counts of both non-null values and nulls of a given column.
 */
public  class MockUDAF extends org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver {
  // not preceding
  public   MockUDAF ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator getEvaluator (org.apache.hadoop.hive.serde2.typeinfo.TypeInfo[] info)  { throw new RuntimeException(); }
}
