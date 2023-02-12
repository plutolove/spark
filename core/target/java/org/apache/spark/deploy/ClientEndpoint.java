package org.apache.spark.deploy;
/**
 * Send the message to master and forward the reply to self asynchronously.
 */
public  class ClientEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   ClientEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.deploy.ClientArguments driverArgs, scala.collection.Seq<org.apache.spark.rpc.RpcEndpointRef> masterEndpoints, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onError (java.lang.Throwable cause)  { throw new RuntimeException(); }
  public  void onNetworkError (java.lang.Throwable cause, org.apache.spark.rpc.RpcAddress remoteAddress)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void pollAndReportStatus (java.lang.String driverId)  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
