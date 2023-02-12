package org.apache.spark.sql.kafka010.consumer;
/**
 * Closes the keyed object pool. Once the pool is closed,
 * borrowObject will fail with {@link IllegalStateException}, but returnObject and invalidateObject
 * will continue to work, with returned objects destroyed on return.
 * <p>
 * Also destroys idle instances in the pool.
 */
// not preceding
public  class InternalKafkaConsumerPool$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final InternalKafkaConsumerPool$ MODULE$ = null;
  public   InternalKafkaConsumerPool$ ()  { throw new RuntimeException(); }
}
