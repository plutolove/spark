package org.apache.spark.sql.hive.execution;
public  class MockUDAFEvaluator2 extends org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator {
  // not preceding
  public   MockUDAFEvaluator2 ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer getNewAggregationBuffer ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector init (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.Mode mode, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector[] parameters)  { throw new RuntimeException(); }
  public  void iterate (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer agg, java.lang.Object[] parameters)  { throw new RuntimeException(); }
  public  void merge (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer agg, java.lang.Object partial)  { throw new RuntimeException(); }
  public  void reset (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer agg)  { throw new RuntimeException(); }
  public  java.lang.Object terminate (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer agg)  { throw new RuntimeException(); }
  public  java.lang.Object terminatePartial (org.apache.hadoop.hive.ql.udf.generic.GenericUDAFEvaluator.AggregationBuffer agg)  { throw new RuntimeException(); }
}
