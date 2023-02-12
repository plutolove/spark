package org.apache.spark.ml.clustering;
/**
 * We store all cluster centers in a single row and use this class to store model data by
 * Spark 1.6 and earlier. A model can be loaded from such older data for backward compatibility.
 */
// not preceding
public  class KMeansModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.clustering.KMeansModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeansModel$ MODULE$ = null;
  public   KMeansModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.clustering.KMeansModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.KMeansModel load (java.lang.String path)  { throw new RuntimeException(); }
}
