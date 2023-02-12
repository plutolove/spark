package org.apache.spark.mllib.optimization;
/**
 * Solve the provided convex optimization problem.
 */
public  interface Optimizer extends scala.Serializable {
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector optimize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, org.apache.spark.mllib.linalg.Vector initialWeights)  ;
}
