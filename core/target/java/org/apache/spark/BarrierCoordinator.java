package org.apache.spark;
/**
 * Provide the current state of a barrier() call. A state is created when a new stage attempt
 * sends out a barrier() call, and recycled on stage completed.
 * <p>
 * param:  barrierId Identifier of the barrier stage that make a barrier() call.
 * param:  numTasks Number of tasks of the barrier stage, all barrier() calls from the stage shall
 *                 collect <code>numTasks</code> requests to succeed.
 */
  class BarrierCoordinator implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   BarrierCoordinator (long timeoutInSecs, org.apache.spark.scheduler.LiveListenerBus listenerBus, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
