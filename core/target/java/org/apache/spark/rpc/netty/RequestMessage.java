package org.apache.spark.rpc.netty;
/** Manually serialize {@link RequestMessage} to minimize the size. */
  class RequestMessage {
  static public  org.apache.spark.rpc.netty.RequestMessage apply (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv, org.apache.spark.network.client.TransportClient client, java.nio.ByteBuffer bytes)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver ()  { throw new RuntimeException(); }
  public  Object content ()  { throw new RuntimeException(); }
  // not preceding
  public   RequestMessage (org.apache.spark.rpc.RpcAddress senderAddress, org.apache.spark.rpc.netty.NettyRpcEndpointRef receiver, Object content)  { throw new RuntimeException(); }
  // not preceding
  public  java.nio.ByteBuffer serialize (org.apache.spark.rpc.netty.NettyRpcEnv nettyEnv)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
