package org.apache.spark.mllib.optimization;
/**
 * For the first run, we set the convergenceTol to 0.0, so that the algorithm will
 * run up to the numIterations which is 8 here.
 */
public  class LBFGSClusterSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.mllib.util.LocalClusterSparkContext {
  // not preceding
  public   LBFGSClusterSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
