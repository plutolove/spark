package org.apache.spark.deploy.client;
/**
 *  Register with all masters asynchronously and returns an array <code>Future</code>s for cancellation.
 */
  class StandaloneAppClient implements org.apache.spark.internal.Logging {
  // not preceding
  public   StandaloneAppClient (org.apache.spark.rpc.RpcEnv rpcEnv, java.lang.String[] masterUrls, org.apache.spark.deploy.ApplicationDescription appDescription, org.apache.spark.deploy.client.StandaloneAppClientListener listener, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the Master.
   * @return whether the kill request is acknowledged.
   * @param executorIds (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> killExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  /**
   * Request executors from the Master by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * @return whether the request is acknowledged.
   * @param requestedTotal (undocumented)
   */
  public  scala.concurrent.Future<java.lang.Object> requestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
  // not preceding
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
}
