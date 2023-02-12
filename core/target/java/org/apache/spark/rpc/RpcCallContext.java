package org.apache.spark.rpc;
/**
 * Reply a message to the sender. If the sender is {@link RpcEndpoint}, its <code>RpcEndpoint.receive</code>
 * will be called.
 */
public  interface RpcCallContext {
  // not preceding
  public  void reply (Object response)  ;
  /**
   * Report a failure to the sender.
   * @param e (undocumented)
   */
  public  void sendFailure (java.lang.Throwable e)  ;
  /**
   * The sender of this message.
   * @return (undocumented)
   */
  public  org.apache.spark.rpc.RpcAddress senderAddress ()  ;
}
