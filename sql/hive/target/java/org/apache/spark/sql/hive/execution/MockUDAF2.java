package org.apache.spark.sql.hive.execution;
public  class MockUDAF2 extends org.apache.hadoop.hive.ql.udf.generic.AbstractGenericUDAFResolver {
  // not preceding
  public   MockUDAF2 ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator getEvaluator (org.apache.hadoop.hive.serde2.typeinfo.TypeInfo[] info)  { throw new RuntimeException(); }
}
