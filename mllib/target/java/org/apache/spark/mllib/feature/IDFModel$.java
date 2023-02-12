package org.apache.spark.mllib.feature;
/**
 * Transforms a term frequency (TF) vector to a TF-IDF vector with a IDF vector
 * <p>
 * param:  idf an IDF vector
 * param:  v a term frequency vector
 * @return a TF-IDF vector
 */
// not preceding
public  class IDFModel$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final IDFModel$ MODULE$ = null;
  public   IDFModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.linalg.Vector transform (org.apache.spark.mllib.linalg.Vector idf, org.apache.spark.mllib.linalg.Vector v)  { throw new RuntimeException(); }
    double[] transformDense (org.apache.spark.mllib.linalg.Vector idf, double[] values)  { throw new RuntimeException(); }
    scala.Tuple2<int[], double[]> transformSparse (org.apache.spark.mllib.linalg.Vector idf, int[] indices, double[] values)  { throw new RuntimeException(); }
}
