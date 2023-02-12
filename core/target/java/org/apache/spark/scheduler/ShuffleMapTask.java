package org.apache.spark.scheduler;
/** A constructor used only in test suites. This does not require passing in an RDD. */
  class ShuffleMapTask extends org.apache.spark.scheduler.Task<org.apache.spark.scheduler.MapStatus> implements org.apache.spark.internal.Logging {
  // not preceding
  public   ShuffleMapTask (int stageId, int stageAttemptId, org.apache.spark.broadcast.Broadcast<byte[]> taskBinary, org.apache.spark.Partition partition, scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> locs, java.util.Properties localProperties, byte[] serializedTaskMetrics, scala.Option<java.lang.Object> jobId, scala.Option<java.lang.String> appId, scala.Option<java.lang.String> appAttemptId, boolean isBarrier)  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleMapTask (int partitionId)  { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus runTask (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.scheduler.TaskLocation> preferredLocations ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
