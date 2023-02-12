package org.apache.spark.util.random;
/**
 * Count the number of items instantly accepted and generate the waitlist for each stratum.
 * <p>
 * This is only invoked when exact sample size is required.
 */
// not preceding
public  class StratifiedSamplingUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StratifiedSamplingUtils$ MODULE$ = null;
  public   StratifiedSamplingUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public <K extends java.lang.Object, V extends java.lang.Object> scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult> getAcceptanceResults (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, boolean withReplacement, scala.collection.Map<K, java.lang.Object> fractions, scala.Option<scala.collection.Map<K, java.lang.Object>> counts, long seed)  { throw new RuntimeException(); }
  /**
   * Returns the function used by aggregate to collect sampling statistics for each partition.
   * @param withReplacement (undocumented)
   * @param fractions (undocumented)
   * @param rng (undocumented)
   * @param counts (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> scala.Function2<scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult>, scala.Tuple2<K, V>, scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult>> getSeqOp (boolean withReplacement, scala.collection.Map<K, java.lang.Object> fractions, org.apache.spark.util.random.StratifiedSamplingUtils.RandomDataGenerator rng, scala.Option<scala.collection.Map<K, java.lang.Object>> counts)  { throw new RuntimeException(); }
  /**
   * Returns the function used combine results returned by seqOp from different partitions.
   * @return (undocumented)
   */
  public <K extends java.lang.Object> scala.Function2<scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult>, scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult>, scala.collection.mutable.Map<K, org.apache.spark.util.random.AcceptanceResult>> getCombOp ()  { throw new RuntimeException(); }
  /**
   * Given the result returned by getCounts, determine the threshold for accepting items to
   * generate exact sample size.
   * <p>
   * To do so, we compute sampleSize = math.ceil(size * samplingRate) for each stratum and compare
   * it to the number of items that were accepted instantly and the number of items in the waitlist
   * for that stratum.
   * <p>
   * Most of the time,
   * <pre><code>
   * numAccepted &lt;= sampleSize &lt;= (numAccepted + numWaitlisted)
   * </code></pre>
   * which means we need to sort the elements in the waitlist by their associated values in order
   * to find the value T s.t.
   * <pre><code>
   * |{elements in the stratum whose associated values &lt;= T}| = sampleSize
   * </code></pre>.
   * Note that all elements in the waitlist have values greater than or equal to bound for instant
   * accept, so a T value in the waitlist range would allow all elements that were instantly
   * accepted on the first pass to be included in the sample.
   * @param finalResult (undocumented)
   * @param fractions (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object> scala.collection.Map<K, java.lang.Object> computeThresholdByKey (scala.collection.Map<K, org.apache.spark.util.random.AcceptanceResult> finalResult, scala.collection.Map<K, java.lang.Object> fractions)  { throw new RuntimeException(); }
  /**
   * Return the per partition sampling function used for sampling without replacement.
   * <p>
   * When exact sample size is required, we make an additional pass over the RDD to determine the
   * exact sampling rate that guarantees sample size with high confidence.
   * <p>
   * The sampling function has a unique seed per partition.
   * @param rdd (undocumented)
   * @param fractions (undocumented)
   * @param exact (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> scala.Function2<java.lang.Object, scala.collection.Iterator<scala.Tuple2<K, V>>, scala.collection.Iterator<scala.Tuple2<K, V>>> getBernoulliSamplingFunction (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.collection.Map<K, java.lang.Object> fractions, boolean exact, long seed)  { throw new RuntimeException(); }
  /**
   * Return the per partition sampling function used for sampling with replacement.
   * <p>
   * When exact sample size is required, we make two additional passed over the RDD to determine
   * the exact sampling rate that guarantees sample size with high confidence. The first pass
   * counts the number of items in each stratum (group of items with the same key) in the RDD, and
   * the second pass uses the counts to determine exact sampling rates.
   * <p>
   * The sampling function has a unique seed per partition.
   * @param rdd (undocumented)
   * @param fractions (undocumented)
   * @param exact (undocumented)
   * @param seed (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <K extends java.lang.Object, V extends java.lang.Object> scala.Function2<java.lang.Object, scala.collection.Iterator<scala.Tuple2<K, V>>, scala.collection.Iterator<scala.Tuple2<K, V>>> getPoissonSamplingFunction (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.collection.Map<K, java.lang.Object> fractions, boolean exact, long seed, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2)  { throw new RuntimeException(); }
}
