package org.apache.spark.mllib.util;
/**
 * Load a model from the given path.
 * <p>
 * The model should have been saved by <code>Saveable.save</code>.
 * <p>
 * param:  sc  Spark context used for loading model files.
 * param:  path  Path specifying the directory to which the model was saved.
 * @return  Model instance
 */
public  interface Loader<M extends org.apache.spark.mllib.util.Saveable> {
  /**
   * Load a model from the given path.
   * <p>
   * The model should have been saved by <code>Saveable.save</code>.
   * <p>
   * @param sc  Spark context used for loading model files.
   * @param path  Path specifying the directory to which the model was saved.
   * @return  Model instance
   */
  public  M load (org.apache.spark.SparkContext sc, java.lang.String path)  ;
}
