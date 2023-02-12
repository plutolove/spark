package org.apache.spark.sql.kafka010;
/**
 * Represents the desire to bind to earliest offset which timestamp for the offset is equal or
 * greater than specific timestamp.
 */
  class SpecificTimestampRangeLimit implements org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> topicTimestamps ()  { throw new RuntimeException(); }
  // not preceding
  public   SpecificTimestampRangeLimit (scala.collection.immutable.Map<org.apache.kafka.common.TopicPartition, java.lang.Object> topicTimestamps)  { throw new RuntimeException(); }
}
