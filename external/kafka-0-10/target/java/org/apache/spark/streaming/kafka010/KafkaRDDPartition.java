package org.apache.spark.streaming.kafka010;
/** Number of messages this partition refers to */
  class KafkaRDDPartition implements org.apache.spark.Partition {
  // not preceding
  public   KafkaRDDPartition (int index, java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  // not preceding
  public  long count ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  /** Kafka TopicPartition object, for convenience */
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
}
