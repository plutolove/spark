package org.apache.spark.executor;
/**
 * A pluggable interface used by the Executor to send updates to the cluster scheduler.
 */
public  interface ExecutorBackend {
  // not preceding
  public  void statusUpdate (long taskId, scala.Enumeration.Value state, java.nio.ByteBuffer data)  ;
}
