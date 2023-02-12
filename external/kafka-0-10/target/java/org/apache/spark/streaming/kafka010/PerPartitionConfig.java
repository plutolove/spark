package org.apache.spark.streaming.kafka010;
/**
 *  Maximum rate (number of records per second) at which data will be read
 *  from each Kafka partition.
 */
public abstract class PerPartitionConfig implements scala.Serializable {
  // not preceding
  public   PerPartitionConfig ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  long maxRatePerPartition (org.apache.kafka.common.TopicPartition topicPartition)  ;
  public  long minRatePerPartition (org.apache.kafka.common.TopicPartition topicPartition)  { throw new RuntimeException(); }
}
