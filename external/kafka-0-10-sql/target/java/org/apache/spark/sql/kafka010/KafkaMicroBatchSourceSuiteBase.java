package org.apache.spark.sql.kafka010;
/**
 * Run <code>func</code> to write some Kafka messages and wait until the latest offset of the given
 * <code>TopicPartition</code> is not less than <code>expectedOffset</code>.
 */
public abstract class KafkaMicroBatchSourceSuiteBase extends org.apache.spark.sql.kafka010.KafkaSourceSuiteBase {
  // not preceding
  public   KafkaMicroBatchSourceSuiteBase ()  { throw new RuntimeException(); }
}
