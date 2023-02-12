package org.apache.spark.ml.feature;
/**
 * Helper class for tracking unique values for each feature.
 * <p>
 * TODO: Track which features are known to be continuous already; do not update counts for them.
 * <p>
 * param:  numFeatures  This class fails if it encounters a Vector whose length is not numFeatures.
 * param:  maxCategories  This class caps the number of unique values collected at maxCategories.
 */
// not preceding
public  class VectorIndexer$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.VectorIndexer>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final VectorIndexer$ MODULE$ = null;
  public   VectorIndexer$ ()  { throw new RuntimeException(); }
  // not preceding
    java.lang.String SKIP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String ERROR_INVALID ()  { throw new RuntimeException(); }
    java.lang.String KEEP_INVALID ()  { throw new RuntimeException(); }
    java.lang.String[] supportedHandleInvalids ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorIndexer load (java.lang.String path)  { throw new RuntimeException(); }
}
