package org.apache.spark.storage;
/**
 * Return true if the driver knows about the given block manager. Otherwise, return false,
 * indicating that the block manager should re-register.
 */
  class BlockManagerMasterHeartbeatEndpoint implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging {
  // not preceding
  public   BlockManagerMasterHeartbeatEndpoint (org.apache.spark.rpc.RpcEnv rpcEnv, boolean isLocal, scala.collection.mutable.Map<org.apache.spark.storage.BlockManagerId, org.apache.spark.storage.BlockManagerInfo> blockManagerInfo)  { throw new RuntimeException(); }
  // not preceding
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
}
