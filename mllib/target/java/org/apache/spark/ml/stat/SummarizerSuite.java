package org.apache.spark.ml.stat;
/**
 * The input is expected to be either a sparse vector, a dense vector.
 * <p>
 * The tests take an list of input vectors, and compare results with
 * <code>mllib.stat.MultivariateOnlineSummarizer</code>. They currently test against some fixed subset
 * of the metrics, but should be made fuzzy in the future.
 */
public  class SummarizerSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext {
  // not preceding
  public   SummarizerSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector singleElem ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
}
