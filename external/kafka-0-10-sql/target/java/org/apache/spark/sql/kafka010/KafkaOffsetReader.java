package org.apache.spark.sql.kafka010;
/**
 * Used to ensure execute fetch operations execute in an UninterruptibleThread
 */
  class KafkaOffsetReader implements org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaOffsetReader (org.apache.spark.sql.kafka010.ConsumerStrategy consumerStrategy, java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> readerOptions, java.lang.String driverGroupIdPrefix)  { throw new RuntimeException(); }
  /**
   * A KafkaConsumer used in the driver to query the latest Kafka offsets. This only queries the
   * offsets and never commits them.
   * @return (undocumented)
   */
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> _consumer ()  { throw new RuntimeException(); }
  /**
   * Closes the connection to Kafka, and cleans up state.
   */
  public  void close ()  { throw new RuntimeException(); }
  protected  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> consumer ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> driverKafkaParams ()  { throw new RuntimeException(); }
  public  scala.concurrent.ExecutionContextExecutorService execContext ()  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy}.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets ()  { throw new RuntimeException(); }
  /**
   * Fetch the earliest offsets for specific topic partitions.
   * The return result may not contain some partitions if they are deleted.
   * @param newPartitions (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchEarliestOffsets (scala.collection.Seq<org.apache.kafka.common.TopicPartition> newPartitions)  { throw new RuntimeException(); }
  /**
   * Compare <code>knownOffsets</code> and <code>partitionOffsets</code>. Returns all partitions that have incorrect
   * latest offset (offset in <code>knownOffsets</code> is great than the one in <code>partitionOffsets</code>).
   * @param knownOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchLatestOffsets (scala.Option<scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object>> knownOffsets)  { throw new RuntimeException(); }
  /**
   * Fetch the partition offsets for the topic partitions that are indicated
   * in the {@link ConsumerStrategy} and {@link KafkaOffsetRangeLimit}.
   * @param offsetRangeLimit (undocumented)
   * @param isStartingOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fetchPartitionOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit offsetRangeLimit, boolean isStartingOffsets)  { throw new RuntimeException(); }
  /**
   * Resolves the specific offsets based on Kafka seek positions.
   * This method resolves offset value -1 to the latest and -2 to the
   * earliest Kafka seek position.
   * <p>
   * @param partitionOffsets the specific offsets to resolve
   * @param reportDataLoss callback to either report or log data loss depending on setting
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.kafka010.KafkaSourceOffset fetchSpecificTimestampBasedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> partitionTimestamps, boolean failsOnNoMatchingOffset)  { throw new RuntimeException(); }
  /**
   * @return The Set of TopicPartitions for a given topic
   */
  public  scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> fetchTopicPartitions ()  { throw new RuntimeException(); }
  /**
   * Return the offset ranges for a Kafka streaming batch. If <code>minPartitions</code> is set, this method
   * may split partitions to respect it. If any data lost issue is detected, <code>reportDataLoss</code> will
   * be called.
   * @param fromPartitionOffsets (undocumented)
   * @param untilPartitionOffsets (undocumented)
   * @param reportDataLoss (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromResolvedOffsets (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> fromPartitionOffsets, scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> untilPartitionOffsets, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> reportDataLoss)  { throw new RuntimeException(); }
  /**
   * Return the offset ranges for a Kafka batch query. If <code>minPartitions</code> is set, this method may
   * split partitions to respect it. Since offsets can be early and late binding which are evaluated
   * on the executors, in order to divvy up the partitions we need to perform some substitutions. We
   * don't want to send exact offsets to the executors, because data may age out before we can
   * consume the data. This method makes some approximate splitting, and replaces the special offset
   * values in the final output.
   * @param startingOffsets (undocumented)
   * @param endingOffsets (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getOffsetRangesFromUnresolvedOffsets (org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit endingOffsets)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.concurrent.ExecutorService kafkaReaderThread ()  { throw new RuntimeException(); }
    int maxOffsetFetchAttempts ()  { throw new RuntimeException(); }
    long offsetFetchAttemptIntervalMs ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
