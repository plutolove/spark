package org.apache.spark.ml.feature;
/**
 * Calculate the number of partitions to use in saving the model.
 * [SPARK-11994] - We want to partition the model in partitions smaller than
 * spark.kryoserializer.buffer.max
 * param:  bufferSizeInBytes  Set to spark.kryoserializer.buffer.max
 * param:  numWords  Vocab size
 * param:  vectorSize  Vector length for each word
 */
// not preceding
public  class Word2VecModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.feature.Word2VecModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Word2VecModel$ MODULE$ = null;
  public   Word2VecModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.Word2VecModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.Word2VecModel load (java.lang.String path)  { throw new RuntimeException(); }
}
