package org.apache.spark.util;
/**
 * Retrieve a <code>RpcEndpointRef</code> which is located in the driver via its name.
 */
// not preceding
public  class RpcUtils {
  // not preceding
  static public  org.apache.spark.rpc.RpcEndpointRef makeDriverRef (java.lang.String name, org.apache.spark.SparkConf conf, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  /** Returns the configured number of times to retry connecting */
  static public  int numRetries (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Returns the configured number of milliseconds to wait on each retry */
  static public  long retryWaitMs (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Returns the default Spark timeout to use for RPC ask operations. */
  static public  org.apache.spark.rpc.RpcTimeout askRpcTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Returns the default Spark timeout to use for RPC remote endpoint lookup. */
  static public  org.apache.spark.rpc.RpcTimeout lookupRpcTimeout (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  /** Returns the configured max message size for messages in bytes. */
  static public  int maxMessageSizeBytes (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
