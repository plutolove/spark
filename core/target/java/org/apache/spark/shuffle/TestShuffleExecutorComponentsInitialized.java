package org.apache.spark.shuffle;
public  class TestShuffleExecutorComponentsInitialized implements org.apache.spark.shuffle.api.ShuffleExecutorComponents {
  // not preceding
  static public  java.util.concurrent.atomic.AtomicBoolean initialized ()  { throw new RuntimeException(); }
  // not preceding
  public   TestShuffleExecutorComponentsInitialized (org.apache.spark.shuffle.api.ShuffleExecutorComponents delegate)  { throw new RuntimeException(); }
  // not preceding
  public  void initializeExecutor (java.lang.String appId, java.lang.String execId, java.util.Map<java.lang.String, java.lang.String> extraConfigs)  { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.api.ShuffleMapOutputWriter createMapOutputWriter (int shuffleId, long mapTaskId, int numPartitions)  { throw new RuntimeException(); }
}
