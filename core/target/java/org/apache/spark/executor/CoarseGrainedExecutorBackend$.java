package org.apache.spark.executor;
/**
 * This function can be overloaded by other child classes to handle
 * executor exits differently. For e.g. when an executor goes down,
 * back-end may not want to take the parent process down.
 */
// not preceding
public  class CoarseGrainedExecutorBackend$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CoarseGrainedExecutorBackend$ MODULE$ = null;
  public   CoarseGrainedExecutorBackend$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  public  void run (org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments arguments, scala.Function4<org.apache.spark.rpc.RpcEnv, org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments, org.apache.spark.SparkEnv, org.apache.spark.resource.ResourceProfile, org.apache.spark.executor.CoarseGrainedExecutorBackend> backendCreateFn)  { throw new RuntimeException(); }
  public  org.apache.spark.executor.CoarseGrainedExecutorBackend.Arguments parseArguments (java.lang.String[] args, java.lang.String classNameForEntry)  { throw new RuntimeException(); }
}
