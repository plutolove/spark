package org.apache.spark.sql.execution.exchange;
/**
 * Determines whether records must be defensively copied before being sent to the shuffle.
 * Several of Spark's shuffle components will buffer deserialized Java objects in memory. The
 * shuffle code assumes that objects are immutable and hence does not perform its own defensive
 * copying. In Spark SQL, however, operators' iterators return the same mutable <code>Row</code> object. In
 * order to properly shuffle the output of these operators, we need to perform our own copying
 * prior to sending records to the shuffle. This copying is expensive, so we try to avoid it
 * whenever possible. This method encapsulates the logic for choosing when to copy.
 * <p>
 * In the long run, we might want to push this logic into core's shuffle APIs so that we don't
 * have to rely on knowledge of core internals here in SQL.
 * <p>
 * See SPARK-2967, SPARK-4479, and SPARK-7375 for more discussion of this issue.
 * <p>
 * param:  partitioner the partitioner for the shuffle
 * @return true if rows should be copied before being shuffled, false otherwise
 */
// not preceding
public  class ShuffleExchangeExec$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShuffleExchangeExec$ MODULE$ = null;
  public   ShuffleExchangeExec$ ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link ShuffleDependency} that will partition rows of its child based on
   * the partitioning scheme defined in <code>newPartitioning</code>. Those partitions of
   * the returned ShuffleDependency will be the input of shuffle.
   * @param rdd (undocumented)
   * @param outputAttributes (undocumented)
   * @param newPartitioning (undocumented)
   * @param serializer (undocumented)
   * @param writeMetrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ShuffleDependency<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> prepareShuffleDependency (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> rdd, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputAttributes, org.apache.spark.sql.catalyst.plans.physical.Partitioning newPartitioning, org.apache.spark.serializer.Serializer serializer, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> writeMetrics)  { throw new RuntimeException(); }
  /**
   * Create a customized {@link ShuffleWriteProcessor} for SQL which wrap the default metrics reporter
   * with {@link SQLShuffleWriteMetricsReporter} as new reporter for {@link ShuffleWriteProcessor}.
   * @param metrics (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.shuffle.ShuffleWriteProcessor createShuffleWriteProcessor (scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics)  { throw new RuntimeException(); }
}