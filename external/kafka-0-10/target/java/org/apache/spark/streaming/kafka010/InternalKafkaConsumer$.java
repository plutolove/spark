package org.apache.spark.streaming.kafka010;
/**
 * Get a cached consumer for groupId, assigned to topic and partition.
 * If matching consumer doesn't already exist, will be created using kafkaParams.
 * The returned consumer must be released explicitly using {@link KafkaDataConsumer.release()}.
 * <p>
 * Note: This method guarantees that the consumer returned is not currently in use by anyone
 * else. Within this guarantee, this method will make a best effort attempt to re-use consumers by
 * caching them and tracking when they are in use.
 */
// not preceding
public  class InternalKafkaConsumer$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InternalKafkaConsumer$ MODULE$ = null;
  public   InternalKafkaConsumer$ ()  { throw new RuntimeException(); }
}
