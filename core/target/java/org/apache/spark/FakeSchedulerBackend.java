package org.apache.spark;
/**
 * Dummy scheduler backend to simulate executor allocation requests to the cluster manager.
 */
public  class FakeSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  // not preceding
  public   FakeSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcEndpointRef clusterManagerEndpoint)  { throw new RuntimeException(); }
  protected  scala.concurrent.Future<java.lang.Object> doKillExecutors (scala.collection.Seq<java.lang.String> executorIds)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.concurrent.Future<java.lang.Object> doRequestTotalExecutors (int requestedTotal)  { throw new RuntimeException(); }
}
