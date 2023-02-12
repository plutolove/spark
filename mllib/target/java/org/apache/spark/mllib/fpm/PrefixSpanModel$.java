package org.apache.spark.mllib.fpm;
/**
 * Save this model to the given path.
 * It only works for Item datatypes supported by DataFrames.
 * <p>
 * This saves:
 *  - human-readable (JSON) model metadata to path/metadata/
 *  - Parquet formatted data to path/data/
 * <p>
 * The model may be loaded using <code>PrefixSpanModel.load</code>.
 * <p>
 * param:  sc  Spark context used to save model data.
 * param:  path  Path specifying the directory in which to save this model.
 *              If the directory already exists, this method throws an exception.
 */
// not preceding
public  class PrefixSpanModel$ implements org.apache.spark.mllib.util.Loader<org.apache.spark.mllib.fpm.PrefixSpanModel<?>>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PrefixSpanModel$ MODULE$ = null;
  public   PrefixSpanModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.mllib.fpm.PrefixSpanModel<?> load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
