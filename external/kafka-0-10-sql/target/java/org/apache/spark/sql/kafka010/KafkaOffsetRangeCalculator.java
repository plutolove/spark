package org.apache.spark.sql.kafka010;
/**
 * Calculate the offset ranges that we are going to process this batch. If <code>minPartitions</code>
 * is not set or is set less than or equal the number of <code>topicPartitions</code> that we're going to
 * consume, then we fall back to a 1-1 mapping of Spark tasks to Kafka partitions. If
 * <code>numPartitions</code> is set higher than the number of our <code>topicPartitions</code>, then we will split up
 * the read tasks of the skewed partitions to multiple Spark tasks.
 * The number of Spark tasks will be *approximately* <code>numPartitions</code>. It can be less or more
 * depending on rounding errors or Kafka partitions that didn't receive any new data.
 * <p>
 * Empty ranges (<code>KafkaOffsetRange.size <= 0</code>) will be dropped.
 */
  class KafkaOffsetRangeCalculator {
  // not preceding
  static public  org.apache.spark.sql.kafka010.KafkaOffsetRangeCalculator apply (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.lang.Object> minPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   KafkaOffsetRangeCalculator (scala.Option<java.lang.Object> minPartitions)  { throw new RuntimeException(); }
  /**
   * Calculate the offset ranges that we are going to process this batch. If <code>minPartitions</code>
   * is not set or is set less than or equal the number of <code>topicPartitions</code> that we're going to
   * consume, then we fall back to a 1-1 mapping of Spark tasks to Kafka partitions. If
   * <code>numPartitions</code> is set higher than the number of our <code>topicPartitions</code>, then we will split up
   * the read tasks of the skewed partitions to multiple Spark tasks.
   * The number of Spark tasks will be *approximately* <code>numPartitions</code>. It can be less or more
   * depending on rounding errors or Kafka partitions that didn't receive any new data.
   * <p>
   * Empty ranges (<code>KafkaOffsetRange.size <= 0</code>) will be dropped.
   * @param ranges (undocumented)
   * @param executorLocations (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> getRanges (scala.collection.Seq<org.apache.spark.sql.kafka010.KafkaOffsetRange> ranges, scala.collection.Seq<java.lang.String> executorLocations)  { throw new RuntimeException(); }
}