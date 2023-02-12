package org.apache.spark.sql.catalyst.expressions.aggregate;
/** Create a HLL++ instance and an input and output buffer. */
public  class HyperLogLogPlusPlusSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   HyperLogLogPlusPlusSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow createBuffer (org.apache.spark.sql.catalyst.expressions.aggregate.HyperLogLogPlusPlus hll)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Tuple3<org.apache.spark.sql.catalyst.expressions.aggregate.HyperLogLogPlusPlus, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> createEstimator (double rsd, org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /** Evaluate the estimate. It should be within 3*SD's of the given true rsd. */
  public  void evaluateEstimate (org.apache.spark.sql.catalyst.expressions.aggregate.HyperLogLogPlusPlus hll, org.apache.spark.sql.catalyst.InternalRow buffer, int cardinality)  { throw new RuntimeException(); }
  public  void testCardinalityEstimates (scala.collection.Seq<java.lang.Object> rsds, scala.collection.Seq<java.lang.Object> ns, scala.Function1<java.lang.Object, java.lang.Object> f, scala.Function1<java.lang.Object, java.lang.Object> c)  { throw new RuntimeException(); }
}
