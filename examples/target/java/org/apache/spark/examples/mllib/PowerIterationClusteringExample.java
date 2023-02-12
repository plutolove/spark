package org.apache.spark.examples.mllib;
/**
 * Gaussian Similarity:  http://en.wikipedia.org/wiki/Radial_basis_function_kernel
 */
// not preceding
public  class PowerIterationClusteringExample {
  // not preceding
  static public  class Params extends org.apache.spark.examples.mllib.AbstractParams<org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params> implements scala.Product, scala.Serializable {
    // not preceding
    public  int k ()  { throw new RuntimeException(); }
    public  int numPoints ()  { throw new RuntimeException(); }
    public  int maxIterations ()  { throw new RuntimeException(); }
    // not preceding
    public   Params (int k, int numPoints, int maxIterations)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Params$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Params$ MODULE$ = null;
    public   Params$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void run (org.apache.spark.examples.mllib.PowerIterationClusteringExample.Params params)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<scala.Tuple2<java.lang.Object, java.lang.Object>> generateCircle (double radius, int n)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> generateCirclesRdd (org.apache.spark.SparkContext sc, int nCircles, int nPoints)  { throw new RuntimeException(); }
  /**
   * Gaussian Similarity:  http://en.wikipedia.org/wiki/Radial_basis_function_kernel
   * @param p1 (undocumented)
   * @param p2 (undocumented)
   * @return (undocumented)
   */
  static public  double gaussianSimilarity (scala.Tuple2<java.lang.Object, java.lang.Object> p1, scala.Tuple2<java.lang.Object, java.lang.Object> p2)  { throw new RuntimeException(); }
}
