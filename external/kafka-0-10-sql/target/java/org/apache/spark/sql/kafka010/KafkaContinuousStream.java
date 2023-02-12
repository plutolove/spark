package org.apache.spark.sql.kafka010;
/** Stop this source and free any resources it has allocated. */
public  class KafkaContinuousStream implements org.apache.spark.sql.connector.read.streaming.ContinuousStream, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaContinuousStream (org.apache.spark.sql.kafka010.KafkaOffsetReader offsetReader, java.util.Map<java.lang.String, java.lang.Object> kafkaParams, org.apache.spark.sql.util.CaseInsensitiveStringMap options, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit initialOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ContinuousPartitionReaderFactory createContinuousReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
    scala.collection.immutable.Set<org.apache.kafka.common.TopicPartition> knownPartitions ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset mergeOffsets (org.apache.spark.sql.connector.read.streaming.PartitionOffset[] offsets)  { throw new RuntimeException(); }
  public  boolean needsReconfiguration ()  { throw new RuntimeException(); }
    org.apache.spark.sql.kafka010.KafkaOffsetReader offsetReader ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start)  { throw new RuntimeException(); }
  // not preceding
    long pollTimeoutMs ()  { throw new RuntimeException(); }
  /** Stop this source and free any resources it has allocated. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
