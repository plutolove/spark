package org.apache.spark.storage;
  class HostLocalDirManager implements org.apache.spark.internal.Logging {
  // not preceding
  public   HostLocalDirManager (scala.concurrent.ExecutionContext futureExecutionContext, int cacheSize, org.apache.spark.network.shuffle.ExternalBlockStoreClient externalBlockStoreClient, java.lang.String host, int externalShuffleServicePort)  { throw new RuntimeException(); }
    scala.collection.Map<java.lang.String, java.lang.String[]> getCachedHostLocalDirs ()  { throw new RuntimeException(); }
    void getHostLocalDirs (java.lang.String[] executorIds, scala.Function1<scala.util.Try<java.util.Map<java.lang.String, java.lang.String[]>>, scala.runtime.BoxedUnit> callback)  { throw new RuntimeException(); }
}
