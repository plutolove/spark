package org.apache.spark.sql.kafka010.producer;
/**
 * This class is used as metadata of producer pool, and shouldn't be exposed to the public.
 * This class assumes thread-safety is guaranteed by the caller.
 */
// not preceding
public  class InternalKafkaProducerPool$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InternalKafkaProducerPool$ MODULE$ = null;
  public   InternalKafkaProducerPool$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.kafka010.producer.CachedKafkaProducer acquire (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  { throw new RuntimeException(); }
  public  void release (org.apache.spark.sql.kafka010.producer.CachedKafkaProducer producer)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
