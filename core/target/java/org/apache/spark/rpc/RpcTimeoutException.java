package org.apache.spark.rpc;
/**
 * An exception thrown if RpcTimeout modifies a <code>TimeoutException</code>.
 */
  class RpcTimeoutException extends java.util.concurrent.TimeoutException {
  // not preceding
  public   RpcTimeoutException (java.lang.String message, java.util.concurrent.TimeoutException cause)  { throw new RuntimeException(); }
}
