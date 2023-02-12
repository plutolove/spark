package org.apache.spark.sql.kafka010;
/**
 * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
 * called in StreamExecutionThread. Otherwise, interrupting a thread while running
 * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
 */
  class KafkaMicroBatchStream implements org.apache.spark.sql.connector.read.streaming.SupportsAdmissionControl, org.apache.spark.sql.connector.read.streaming.MicroBatchStream, org.apache.spark.internal.Logging {
  // not preceding
  public   KafkaMicroBatchStream (org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.util.CaseInsensitiveStringMap options, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  void commit (org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.PartitionReaderFactory createReaderFactory ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset deserializeOffset (java.lang.String json)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  /**
   * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
   * called in StreamExecutionThread. Otherwise, interrupting a thread while running
   * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
   * @return (undocumented)
   */
  public  org.apache.spark.sql.connector.read.streaming.Offset initialOffset ()  { throw new RuntimeException(); }
  // not preceding
    org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaOffsetReader ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.ReadLimit readLimit)  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> maxOffsetsPerTrigger ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.InputPartition[] planInputPartitions (org.apache.spark.sql.connector.read.streaming.Offset start, org.apache.spark.sql.connector.read.streaming.Offset end)  { throw new RuntimeException(); }
  // not preceding
    long pollTimeoutMs ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
