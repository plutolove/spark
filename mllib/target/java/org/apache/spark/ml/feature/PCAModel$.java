package org.apache.spark.ml.feature;
/**
 * Loads a {@link PCAModel} from data located at the input path. Note that the model includes an
 * <code>explainedVariance</code> member that is not recorded by Spark 1.6 and earlier. A model
 * can be loaded from such older data but will have an empty vector for
 * <code>explainedVariance</code>.
 * <p>
 * param:  path path to serialized model data
 * @return a {@link PCAModel}
 */
// not preceding
public  class PCAModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.feature.PCAModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PCAModel$ MODULE$ = null;
  public   PCAModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.PCAModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.PCAModel load (java.lang.String path)  { throw new RuntimeException(); }
}
