package org.apache.spark.sql.kafka010;
/**
 * Lazily initialize <code>initialPartitionOffsets</code> to make sure that <code>KafkaConsumer.poll</code> is only
 * called in StreamExecutionThread. Otherwise, interrupting a thread while running
 * <code>KafkaConsumer.poll</code> may hang forever (KAFKA-1894).
 */
  class KafkaSource implements org.apache.spark.sql.connector.read.streaming.SupportsAdmissionControl, org.apache.spark.sql.execution.streaming.Source, org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String[] getSortedExecutorList (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  // not preceding
  public   KafkaSource (org.apache.spark.sql.SQLContext sqlContext, org.apache.spark.sql.kafka010.KafkaOffsetReader kafkaReader, java.util.Map<java.lang.String, java.lang.Object> executorKafkaParams, org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> sourceOptions, java.lang.String metadataPath, org.apache.spark.sql.kafka010.KafkaOffsetRangeLimit startingOffsets, boolean failOnDataLoss)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.ReadLimit getDefaultReadLimit ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Returns the maximum available offset for this source. */
  public  scala.Option<org.apache.spark.sql.execution.streaming.Offset> getOffset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.read.streaming.Offset latestOffset (org.apache.spark.sql.connector.read.streaming.Offset startOffset, org.apache.spark.sql.connector.read.streaming.ReadLimit limit)  { throw new RuntimeException(); }
  /**
   * Returns the data that is between the offsets
   * [<code>start.get.partitionToOffsets</code>, <code>end.partitionToOffsets</code>), i.e. end.partitionToOffsets is
   * exclusive.
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> getBatch (scala.Option<org.apache.spark.sql.execution.streaming.Offset> start, org.apache.spark.sql.execution.streaming.Offset end)  { throw new RuntimeException(); }
  /** Stop this source and free any resources it has allocated. */
  public  void stop ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
