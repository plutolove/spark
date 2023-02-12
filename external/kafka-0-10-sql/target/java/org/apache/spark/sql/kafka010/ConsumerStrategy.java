package org.apache.spark.sql.kafka010;
/** Create a {@link KafkaConsumer} and subscribe to topics according to a desired strategy */
public  interface ConsumerStrategy {
  /** Create a {@link KafkaConsumer} and subscribe to topics according to a desired strategy */
  public  org.apache.kafka.clients.consumer.Consumer<byte[], byte[]> createConsumer (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  ;
  /**
   * Updates the parameters with security if needed.
   * Added a function to hide internals and reduce code duplications because all strategy uses it.
   * @param kafkaParams (undocumented)
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, java.lang.Object> setAuthenticationConfigIfNeeded (java.util.Map<java.lang.String, java.lang.Object> kafkaParams)  ;
}
