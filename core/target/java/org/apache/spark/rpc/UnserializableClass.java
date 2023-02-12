package org.apache.spark.rpc;
/**
 * Setup an {@link RpcEndpoint} to collect all network events.
 * <p>
 * @return the {@link RpcEndpointRef} and a <code>ConcurrentLinkedQueue</code> that contains network events.
 */
public  class UnserializableClass {
  // not preceding
  public   UnserializableClass ()  { throw new RuntimeException(); }
}
