package org.apache.spark.sql.kafka010;
public  class TestKafkaPartitioner extends org.apache.kafka.clients.producer.internals.DefaultPartitioner {
  // not preceding
  public   TestKafkaPartitioner ()  { throw new RuntimeException(); }
  // not preceding
  public  int partition (java.lang.String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, org.apache.kafka.common.Cluster cluster)  { throw new RuntimeException(); }
}