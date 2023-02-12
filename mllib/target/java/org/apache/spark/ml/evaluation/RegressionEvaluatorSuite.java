package org.apache.spark.ml.evaluation;
/**
 * Here is the instruction describing how to export the test data into CSV format
 * so we can validate the metrics compared with R's mmetric package.
 * <p>
 * import org.apache.spark.mllib.util.LinearDataGenerator
 * val data = sc.parallelize(LinearDataGenerator.generateLinearInput(6.3,
 *   Array(4.7, 7.2), Array(0.9, -1.3), Array(0.7, 1.2), 100, 42, 0.1))
 * data.map(x=&gt; x.label + ", " + x.features(0) + ", " + x.features(1))
 *   .saveAsTextFile("path")
 */
public  class RegressionEvaluatorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.MLlibTestSparkContext, org.apache.spark.ml.util.DefaultReadWriteTest {
  // not preceding
  public   RegressionEvaluatorSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.util.MLlibTestSparkContext.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
}
