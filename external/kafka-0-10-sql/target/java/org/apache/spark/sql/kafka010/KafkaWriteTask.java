package org.apache.spark.sql.kafka010;
/**
 * Writes key value data out to topics.
 */
  class KafkaWriteTask extends org.apache.spark.sql.kafka010.KafkaRowWriter {
  // not preceding
  public   KafkaWriteTask (java.util.Map<java.lang.String, java.lang.Object> producerConfiguration, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema, scala.Option<java.lang.String> topic)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Writes key value data out to topics.
   * @param iterator (undocumented)
   */
  public  void execute (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> iterator)  { throw new RuntimeException(); }
}
