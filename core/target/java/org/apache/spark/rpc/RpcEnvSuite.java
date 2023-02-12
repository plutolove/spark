package org.apache.spark.rpc;
/**
 * Setup an {@link RpcEndpoint} to collect all network events.
 * <p>
 * @return the {@link RpcEndpointRef} and a <code>ConcurrentLinkedQueue</code> that contains network events.
 */
public abstract class RpcEnvSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   RpcEnvSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.rpc.RpcEnv createRpcEnv (org.apache.spark.SparkConf conf, java.lang.String name, int port, boolean clientMode)  ;
  // not preceding
  public  org.apache.spark.rpc.RpcEnv env ()  { throw new RuntimeException(); }
}
