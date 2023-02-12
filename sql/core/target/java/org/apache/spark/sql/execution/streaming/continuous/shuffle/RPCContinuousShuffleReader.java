package org.apache.spark.sql.execution.streaming.continuous.shuffle;
/**
 * In each call to getNext(), we pull the next row available in the completion queue, and then
 * submit another task to read the next row from the writer which returned it.
 * <p>
 * When a writer sends an epoch marker, we note that it's finished and don't submit another
 * task for it in this epoch. The iterator is over once all writers have sent an epoch marker.
 */
  class RPCContinuousShuffleReader implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.sql.execution.streaming.continuous.shuffle.ContinuousShuffleReader, org.apache.spark.internal.Logging {
  // not preceding
  public   RPCContinuousShuffleReader (int queueSize, int numShuffleWriters, long epochIntervalMs, org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  /**
   * In each call to getNext(), we pull the next row available in the completion queue, and then
   * submit another task to read the next row from the writer which returned it.
   * <p>
   * When a writer sends an epoch marker, we note that it's finished and don't submit another
   * task for it in this epoch. The iterator is over once all writers have sent an epoch marker.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> read ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
    java.util.concurrent.atomic.AtomicBoolean stopped ()  { throw new RuntimeException(); }
}
