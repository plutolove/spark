package org.apache.spark.sql.execution.streaming.state;
public  class StateStoreSuite extends org.apache.spark.sql.execution.streaming.state.StateStoreSuiteBase<org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider> implements org.scalatest.BeforeAndAfter, org.scalatest.PrivateMethodTester {
  public  org.scalatest.PrivateMethodTester.PrivateMethod$ PrivateMethod ()  { throw new RuntimeException(); }
  // not preceding
  public   StateStoreSuite ()  { throw new RuntimeException(); }
  public  void checkLoadedVersions (java.util.SortedMap<java.lang.Object, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> loadedMaps, int count, long earliestKey, long latestKey)  { throw new RuntimeException(); }
  public  void checkVersion (java.util.SortedMap<java.lang.Object, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> loadedMaps, long version, scala.collection.immutable.Map<java.lang.String, java.lang.Object> expectedData)  { throw new RuntimeException(); }
  public  void corruptFile (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version, boolean isSnapshot)  { throw new RuntimeException(); }
  public  void deleteFilesEarlierThanVersion (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version)  { throw new RuntimeException(); }
  public  boolean fileExists (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, long version, boolean isSnapshot)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> getData (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider provider, int version)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> getLatestData (org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider storeProvider)  { throw new RuntimeException(); }
  public  int incrementVersion (org.apache.spark.sql.execution.streaming.state.StateStoreProvider provider, int currentVersion)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType keySchema ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider newStoreProvider ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider newStoreProvider (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider newStoreProvider (long opId, int partition, java.lang.String dir, int minDeltasForSnapshot, int numOfVersToRetainInMemory, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  int updateVersionTo (org.apache.spark.sql.execution.streaming.state.StateStoreProvider provider, int currentVersion, int targetVersion)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType valueSchema ()  { throw new RuntimeException(); }
}
