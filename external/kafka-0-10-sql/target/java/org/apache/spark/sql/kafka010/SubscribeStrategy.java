package org.apache.spark.sql.kafka010;
/**
 * Subscribe to a fixed collection of topics.
 */
  class SubscribeStrategy implements org.apache.spark.sql.kafka010.ConsumerStrategy, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  // not preceding
  public  scala.collection.Seq<java.lang.String> topics ()  { throw new RuntimeException(); }
  // not preceding
  public   SubscribeStrategy (scala.collection.Seq<java.lang.String> topics)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
