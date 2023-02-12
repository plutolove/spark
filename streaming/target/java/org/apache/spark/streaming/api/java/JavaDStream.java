package org.apache.spark.streaming.api.java;
/** Return a new DStream containing only the elements that satisfy a predicate. */
public  class JavaDStream<T extends java.lang.Object> extends org.apache.spark.streaming.api.java.AbstractJavaDStreamLike<T, org.apache.spark.streaming.api.java.JavaDStream<T>, org.apache.spark.api.java.JavaRDD<T>> {
  // not preceding
  static public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> fromDStream (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<T> dstream ()  { throw new RuntimeException(); }
  public  scala.reflect.ClassTag<T> classTag ()  { throw new RuntimeException(); }
  // not preceding
  public   JavaDStream (org.apache.spark.streaming.dstream.DStream<T> dstream, scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.api.java.JavaRDD<T> wrapRDD (org.apache.spark.rdd.RDD<T> rdd)  { throw new RuntimeException(); }
  /** Return a new DStream containing only the elements that satisfy a predicate. */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> filter (org.apache.spark.api.java.function.Function<T, java.lang.Boolean> f)  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> cache ()  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> persist ()  { throw new RuntimeException(); }
  /** Persist the RDDs of this DStream with the given storage level */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> persist (org.apache.spark.storage.StorageLevel storageLevel)  { throw new RuntimeException(); }
  /** Generate an RDD for the given duration */
  public  org.apache.spark.api.java.JavaRDD<T> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains all the elements in seen in a
   * sliding window of time over this DStream. The new DStream generates RDDs with
   * the same interval as this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's interval.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains all the elements in seen in a
   * sliding window of time over this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by unifying data of another DStream with this DStream.
   * @param that Another DStream having the same interval (i.e., slideDuration) as this DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> union (org.apache.spark.streaming.api.java.JavaDStream<T> that)  { throw new RuntimeException(); }
  /**
   * Return a new DStream with an increased or decreased level of parallelism. Each RDD in the
   * returned DStream has exactly numPartitions partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<T> repartition (int numPartitions)  { throw new RuntimeException(); }
}
