package org.apache.spark.mllib.regression;
/** The model to be updated and used for prediction. */
public abstract class StreamingLinearAlgorithm<M extends org.apache.spark.mllib.regression.GeneralizedLinearModel, A extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<M>> implements org.apache.spark.internal.Logging {
  // not preceding
  public   StreamingLinearAlgorithm ()  { throw new RuntimeException(); }
  /** The algorithm to use for updating. */
  protected abstract  A algorithm ()  ;
  /**
   * Return the latest model.
   * <p>
   * @return (undocumented)
   */
  public  M latestModel ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  scala.Option<M> model ()  ;
  /**
   * Use the model to make predictions on batches of data from a DStream
   * <p>
   * @param data DStream containing feature vectors
   * @return DStream containing predictions
   * <p>
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> predictOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOn</code>.
   * <p>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.Double> predictOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Use the model to make predictions on the values of a DStream and carry over its keys.
   * @param data DStream containing feature vectors
   * @tparam K key type
   * @return DStream containing the input keys and the predictions as values
   * <p>
   * @param evidence$1 (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, java.lang.Object>> predictOnValues (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, org.apache.spark.mllib.linalg.Vector>> data, scala.reflect.ClassTag<K> evidence$1)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>predictOnValues</code>.
   * <p>
   * @param data (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, java.lang.Double> predictOnValues (org.apache.spark.streaming.api.java.JavaPairDStream<K, org.apache.spark.mllib.linalg.Vector> data)  { throw new RuntimeException(); }
  /**
   * Update the model by training on batches of data from a DStream.
   * This operation registers a DStream for training the model,
   * and updates the model based on every subsequent
   * batch of data from the stream.
   * <p>
   * @param data DStream containing labeled data
   */
  public  void trainOn (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>trainOn</code>.
   * @param data (undocumented)
   */
  public  void trainOn (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.regression.LabeledPoint> data)  { throw new RuntimeException(); }
}
