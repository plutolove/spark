package org.apache.spark.sql.kafka010;
/**
 * Use a regex to specify topics of interest.
 */
  class SubscribePatternStrategy implements org.apache.spark.sql.kafka010.ConsumerStrategy, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  // not preceding
  public  java.lang.String topicPattern ()  { throw new RuntimeException(); }
  // not preceding
  public   SubscribePatternStrategy (java.lang.String topicPattern)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
