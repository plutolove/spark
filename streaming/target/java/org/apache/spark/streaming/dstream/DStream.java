package org.apache.spark.streaming.dstream;
/** Time interval after which the DStream generates an RDD */
public abstract class DStream<T extends java.lang.Object> implements scala.Serializable, org.apache.spark.internal.Logging {
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.PairDStreamFunctions<K, V> toPairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> stream, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  /** Filtering function that excludes non-user classes for a streaming application */
  static   org.apache.spark.util.CallSite getCreationSite ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public   DStream (org.apache.spark.streaming.StreamingContext ssc, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  /** Time interval after which the DStream generates an RDD */
  public abstract  org.apache.spark.streaming.Duration slideDuration ()  ;
  /** List of parent DStreams on which this DStream depends on */
  public abstract  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  ;
  /** Method that generates an RDD for the given time */
  public abstract  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  ;
    scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<T>> generatedRDDs ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Time zeroTime ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Duration rememberDuration ()  { throw new RuntimeException(); }
    org.apache.spark.storage.StorageLevel storageLevel ()  { throw new RuntimeException(); }
    boolean mustCheckpoint ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Duration checkpointDuration ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.dstream.DStreamCheckpointData<T> checkpointData ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.DStreamGraph graph ()  { throw new RuntimeException(); }
    boolean isInitialized ()  { throw new RuntimeException(); }
    org.apache.spark.streaming.Duration parentRememberDuration ()  { throw new RuntimeException(); }
  /** Return the StreamingContext associated with this DStream */
  public  org.apache.spark.streaming.StreamingContext context ()  { throw new RuntimeException(); }
    org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  /**
   * The base scope associated with the operation that created this DStream.
   * <p>
   * This is the medium through which we pass the DStream operation name (e.g. updatedStateByKey)
   * to the RDDs created by this DStream. Note that we never use this scope directly in RDDs.
   * Instead, we instantiate a new scope during each call to <code>compute</code> based on this one.
   * <p>
   * This is not defined if the DStream is created outside of one of the public DStream operations.
   * @return (undocumented)
   */
  protected  scala.Option<java.lang.String> baseScope ()  { throw new RuntimeException(); }
  /** Persist the RDDs of this DStream with the given storage level */
  public  org.apache.spark.streaming.dstream.DStream<T> persist (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.dstream.DStream<T> persist ()  { throw new RuntimeException(); }
  /** Persist RDDs of this DStream with the default storage level (MEMORY_ONLY_SER) */
  public  org.apache.spark.streaming.dstream.DStream<T> cache ()  { throw new RuntimeException(); }
  /**
   * Enable periodic checkpointing of RDDs of this DStream
   * @param interval Time interval after which generated RDD will be checkpointed
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> checkpoint (org.apache.spark.streaming.Duration interval)  { throw new RuntimeException(); }
  /**
   * Initialize the DStream by setting the "zero" time, based on which
   * the validity of future times is calculated. This method also recursively initializes
   * its parent DStreams.
   * @param time (undocumented)
   */
    void initialize (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    void validateAtStart ()  { throw new RuntimeException(); }
    void setContext (org.apache.spark.streaming.StreamingContext s)  { throw new RuntimeException(); }
    void setGraph (org.apache.spark.streaming.DStreamGraph g)  { throw new RuntimeException(); }
    void remember (org.apache.spark.streaming.Duration duration)  { throw new RuntimeException(); }
  /** Checks whether the 'time' is valid wrt slideDuration for generating RDD */
    boolean isTimeValid (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Get the RDD corresponding to the given time; either retrieve it from cache
   * or compute-and-cache it.
   * @param time (undocumented)
   * @return (undocumented)
   */
   final  scala.Option<org.apache.spark.rdd.RDD<T>> getOrCompute (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Wrap a body of code such that the call site and operation scope
   * information are passed to the RDDs created in this body properly.
   * @param body RDD creation code to execute with certain local properties.
   * @param time Current batch time that should be embedded in the scope names
   * @param displayInnerRDDOps Whether the detailed callsites and scopes of the inner RDDs generated
   *                           by <code>body</code> will be displayed in the UI; only the scope and callsite
   *                           of the DStream operation that generated <code>this</code> will be displayed.
   * @return (undocumented)
   */
  protected <U extends java.lang.Object> U createRDDWithLocalProperties (org.apache.spark.streaming.Time time, boolean displayInnerRDDOps, scala.Function0<U> body)  { throw new RuntimeException(); }
  /**
   * Generate a SparkStreaming job for the given time. This is an internal method that
   * should not be called directly. This default implementation creates a job
   * that materializes the corresponding RDD. Subclasses of DStream may override this
   * to generate their own jobs.
   * @param time (undocumented)
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.streaming.scheduler.Job> generateJob (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Clear metadata that are older than <code>rememberDuration</code> of this DStream.
   * This is an internal method that should not be called directly. This default
   * implementation clears the old generated RDDs. Subclasses of DStream may override
   * this to clear their own metadata along with the generated RDDs.
   * @param time (undocumented)
   */
    void clearMetadata (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Refresh the list of checkpointed RDDs that will be saved along with checkpoint of
   * this stream. This is an internal method that should not be called directly. This is
   * a default implementation that saves only the file names of the checkpointed RDDs to
   * checkpointData. Subclasses of DStream (especially those of InputDStream) may override
   * this method to save custom checkpoint data.
   * @param currentTime (undocumented)
   */
    void updateCheckpointData (org.apache.spark.streaming.Time currentTime)  { throw new RuntimeException(); }
    void clearCheckpointData (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  /**
   * Restore the RDDs in generatedRDDs from the checkpointData. This is an internal method
   * that should not be called directly. This is a default implementation that recreates RDDs
   * from the checkpoint file names stored in checkpointData. Subclasses of DStream that
   * override the updateCheckpointData() method would also need to override this method.
   */
    void restoreCheckpointData ()  { throw new RuntimeException(); }
  /** Return a new DStream by applying a function to all elements of this DStream. */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> map (scala.Function1<T, U> mapFunc, scala.reflect.ClassTag<U> evidence$2)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a function to all elements of this DStream,
   * and then flattening the results
   * @param flatMapFunc (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> flatMapFunc, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  /** Return a new DStream containing only the elements that satisfy a predicate. */
  public  org.apache.spark.streaming.dstream.DStream<T> filter (scala.Function1<T, java.lang.Object> filterFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying glom() to each RDD of
   * this DStream. Applying glom() to an RDD coalesces all elements within each partition into
   * an array.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> glom ()  { throw new RuntimeException(); }
  /**
   * Return a new DStream with an increased or decreased level of parallelism. Each RDD in the
   * returned DStream has exactly numPartitions partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> repartition (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying mapPartitions() to each RDDs
   * of this DStream. Applying mapPartitions() to an RDD applies a function to each partition
   * of the RDD.
   * @param mapPartFunc (undocumented)
   * @param preservePartitioning (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> mapPartFunc, boolean preservePartitioning, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD has a single element generated by reducing each RDD
   * of this DStream.
   * @param reduceFunc (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> reduce (scala.Function2<T, T, T> reduceFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD has a single element generated by counting each RDD
   * of this DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> count ()  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains the counts of each distinct value in
   * each RDD of this DStream. Hash partitioning is used to generate
   * the RDDs with <code>numPartitions</code> partitions (Spark's default number of partitions if
   * <code>numPartitions</code> not specified).
   * @param numPartitions (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<T, java.lang.Object>> countByValue (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Apply a function to each RDD in this DStream. This is an output operator, so
   * 'this' DStream will be registered as an output stream and therefore materialized.
   * @param foreachFunc (undocumented)
   */
  public  void foreachRDD (scala.Function1<org.apache.spark.rdd.RDD<T>, scala.runtime.BoxedUnit> foreachFunc)  { throw new RuntimeException(); }
  /**
   * Apply a function to each RDD in this DStream. This is an output operator, so
   * 'this' DStream will be registered as an output stream and therefore materialized.
   * @param foreachFunc (undocumented)
   */
  public  void foreachRDD (scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.streaming.Time, scala.runtime.BoxedUnit> foreachFunc)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying a function
   * on each RDD of 'this' DStream.
   * @param transformFunc (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> transform (scala.Function1<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying a function
   * on each RDD of 'this' DStream.
   * @param transformFunc (undocumented)
   * @param evidence$6 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<U> transform (scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying a function
   * on each RDD of 'this' DStream and 'other' DStream.
   * @param other (undocumented)
   * @param transformFunc (undocumented)
   * @param evidence$7 (undocumented)
   * @param evidence$8 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<V> transformWith (org.apache.spark.streaming.dstream.DStream<U> other, scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>, org.apache.spark.rdd.RDD<V>> transformFunc, scala.reflect.ClassTag<U> evidence$7, scala.reflect.ClassTag<V> evidence$8)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD is generated by applying a function
   * on each RDD of 'this' DStream and 'other' DStream.
   * @param other (undocumented)
   * @param transformFunc (undocumented)
   * @param evidence$9 (undocumented)
   * @param evidence$10 (undocumented)
   * @return (undocumented)
   */
  public <U extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<V> transformWith (org.apache.spark.streaming.dstream.DStream<U> other, scala.Function3<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<U>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<V>> transformFunc, scala.reflect.ClassTag<U> evidence$9, scala.reflect.ClassTag<V> evidence$10)  { throw new RuntimeException(); }
  /**
   * Print the first ten elements of each RDD generated in this DStream. This is an output
   * operator, so this DStream will be registered as an output stream and there materialized.
   */
  public  void print ()  { throw new RuntimeException(); }
  /**
   * Print the first num elements of each RDD generated in this DStream. This is an output
   * operator, so this DStream will be registered as an output stream and there materialized.
   * @param num (undocumented)
   */
  public  void print (int num)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains all the elements in seen in a
   * sliding window of time over this DStream. The new DStream generates RDDs with
   * the same interval as this DStream.
   * @param windowDuration width of the window; must be a multiple of this DStream's interval.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> window (org.apache.spark.streaming.Duration windowDuration)  { throw new RuntimeException(); }
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
  public  org.apache.spark.streaming.dstream.DStream<T> window (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD has a single element generated by reducing all
   * elements in a sliding window over this DStream.
   * @param reduceFunc associative and commutative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> reduceByWindow (scala.Function2<T, T, T> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD has a single element generated by reducing all
   * elements in a sliding window over this DStream. However, the reduction is done incrementally
   * using the old window's reduced value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   *  This is more efficient than reduceByWindow without "inverse reduce" function.
   *  However, it is applicable to only "invertible reduce functions".
   * @param reduceFunc associative and commutative reduce function
   * @param invReduceFunc inverse reduce function; such that for all y, invertible x:
   *                      <code>invReduceFunc(reduceFunc(x, y), x) = y</code>
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> reduceByWindow (scala.Function2<T, T, T> reduceFunc, scala.Function2<T, T, T> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD has a single element generated by counting the number
   * of elements in a sliding window over this DStream. Hash partitioning is used to generate
   * the RDDs with Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.Object> countByWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration)  { throw new RuntimeException(); }
  /**
   * Return a new DStream in which each RDD contains the count of distinct elements in
   * RDDs in a sliding window over this DStream. Hash partitioning is used to generate
   * the RDDs with <code>numPartitions</code> partitions (Spark's default number of partitions if
   * <code>numPartitions</code> not specified).
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  number of partitions of each RDD in the new DStream.
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<T, java.lang.Object>> countByValueAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  /**
   * Return a new DStream by unifying data of another DStream with this DStream.
   * @param that Another DStream having the same slideDuration as this DStream.
   * @return (undocumented)
   */
  public  org.apache.spark.streaming.dstream.DStream<T> union (org.apache.spark.streaming.dstream.DStream<T> that)  { throw new RuntimeException(); }
  /**
   * Return all the RDDs defined by the Interval object (both end times included)
   * @param interval (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<T>> slice (org.apache.spark.streaming.Interval interval)  { throw new RuntimeException(); }
  /**
   * Return all the RDDs between 'fromTime' to 'toTime' (both included)
   * @param fromTime (undocumented)
   * @param toTime (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<T>> slice (org.apache.spark.streaming.Time fromTime, org.apache.spark.streaming.Time toTime)  { throw new RuntimeException(); }
  /**
   * Save each RDD in this DStream as a Sequence file of serialized objects.
   * The file name at each batch interval is generated based on <code>prefix</code> and
   * <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   */
  public  void saveAsObjectFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  /**
   * Save each RDD in this DStream as at text file, using string representation
   * of elements. The file name at each batch interval is generated based on
   * <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   * @param prefix (undocumented)
   * @param suffix (undocumented)
   */
  public  void saveAsTextFiles (java.lang.String prefix, java.lang.String suffix)  { throw new RuntimeException(); }
  /**
   * Register this streaming as an output stream. This would ensure that RDDs of this
   * DStream will be generated.
   * @return (undocumented)
   */
    org.apache.spark.streaming.dstream.DStream<T> register ()  { throw new RuntimeException(); }
}