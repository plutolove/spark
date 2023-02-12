package org.apache.spark.streaming.kafka010;
/** Kafka TopicPartition object, for convenience */
public final class OffsetRange implements scala.Serializable {
  // not preceding
  static public  org.apache.spark.streaming.kafka010.OffsetRange create (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange create (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange apply (java.lang.String topic, int partition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static public  org.apache.spark.streaming.kafka010.OffsetRange apply (org.apache.kafka.common.TopicPartition topicPartition, long fromOffset, long untilOffset)  { throw new RuntimeException(); }
  static   org.apache.spark.streaming.kafka010.OffsetRange apply (scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object> t)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String topic ()  { throw new RuntimeException(); }
  public  int partition ()  { throw new RuntimeException(); }
  public  long fromOffset ()  { throw new RuntimeException(); }
  public  long untilOffset ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.kafka.common.TopicPartition topicPartition ()  { throw new RuntimeException(); }
  /** Number of messages this OffsetRange refers to */
  public  long count ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
  /** this is to avoid ClassNotFoundException during checkpoint restore */
    scala.Tuple4<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object> toTuple ()  { throw new RuntimeException(); }
}
