package org.apache.spark.sql.kafka010.consumer;
/**
 * Poll messages from Kafka starting from <code>offset</code> and returns a pair of "list of consumer record"
 * and "offset after poll". The list of consumer record may be empty if the Kafka consumer fetches
 * some messages but all of them are not visible messages (either transaction messages,
 * or aborted messages when <code>isolation.level</code> is <code>read_committed</code>).
 * <p>
 * @throws OffsetOutOfRangeException if <code>offset</code> is out of range.
 * @throws TimeoutException if the consumer position is not changed after polling. It means the
 *                          consumer polls nothing before timeout.
 */
  class InternalKafkaConsumer implements java.io.Closeable, org.apache.spark.internal.Logging {
  // not preceding
  public   InternalKafkaConsumer (org.apache.kafka.common.TopicPartition topicPartition, java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
    scala.Option<org.apache.spark.kafka010.KafkaTokenClusterConf> clusterConfig ()  { throw new RuntimeException(); }
  /**
   * Poll messages from Kafka starting from <code>offset</code> and returns a pair of "list of consumer record"
   * and "offset after poll". The list of consumer record may be empty if the Kafka consumer fetches
   * some messages but all of them are not visible messages (either transaction messages,
   * or aborted messages when <code>isolation.level</code> is <code>read_committed</code>).
   * <p>
   * @throws OffsetOutOfRangeException if <code>offset</code> is out of range.
   * @throws TimeoutException if the consumer position is not changed after polling. It means the
   *                          consumer polls nothing before timeout.
   * @param offset (undocumented)
   * @param pollTimeoutMs (undocumented)
   * @return (undocumented)
   */
  public  scala.Tuple3<java.util.List<org.apache.kafka.clients.consumer.ConsumerRecord<byte[], byte[]>>, java.lang.Object, org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange> fetch (long offset, long pollTimeoutMs)  { throw new RuntimeException(); }
  /**
   * Return the available offset range of the current partition. It's a pair of the earliest offset
   * and the latest offset.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.kafka010.consumer.KafkaDataConsumer.AvailableOffsetRange getAvailableOffsetRange ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String groupId ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Object> kafkaParams ()  { throw new RuntimeException(); }
    java.util.Map<java.lang.String, java.lang.Object> kafkaParamsWithSecurity ()  { throw new RuntimeException(); }
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
}
