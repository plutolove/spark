package org.apache.spark.rpc.netty;
/**
 * Similar to <code>currentEnv</code>, this variable references the client instance associated with an
 * RPC, in case it's needed to find out the remote address during deserialization.
 */
  class NettyRpcEnvFactory implements org.apache.spark.rpc.RpcEnvFactory, org.apache.spark.internal.Logging {
  // not preceding
  public   NettyRpcEnvFactory ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rpc.RpcEnv create (org.apache.spark.rpc.RpcEnvConfig config)  { throw new RuntimeException(); }
}
