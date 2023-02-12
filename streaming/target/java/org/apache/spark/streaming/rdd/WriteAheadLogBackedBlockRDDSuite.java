package org.apache.spark.streaming.rdd;
/**
 * Test the WriteAheadLogBackedRDD, by writing some partitions of the data to block manager
 * and the rest to a write ahead log, and then reading it all back using the RDD.
 * It can also test if the partitions that were read from the log were again stored in
 * block manager.
 * <p>
 * param:  numPartitions Number of partitions in RDD
 * param:  numPartitionsInBM Number of partitions to write to the BlockManager.
 *                          Partitions 0 to (numPartitionsInBM-1) will be written to BlockManager
 * param:  numPartitionsInWAL Number of partitions to write to the Write Ahead Log.
 *                           Partitions (numPartitions - 1 - numPartitionsInWAL) to
 *                           (numPartitions - 1) will be written to WAL
 * param:  testIsBlockValid Test whether setting isBlockValid to false skips block fetching
 * param:  testBlockRemove Test whether calling rdd.removeBlock() makes the RDD still usable with
 *                        reads falling back to the WAL
 * param:  testStoreInBM   Test whether blocks read from log are stored back into block manager
 * <p>
 * Example with numPartitions = 5, numPartitionsInBM = 3, and numPartitionsInWAL = 4
 * <p>
 *   numPartitionsInBM = 3
 *   |------------------|
 *   |                  |
 *    0       1       2       3       4
 *           |                         |
 *           |-------------------------|
 *              numPartitionsInWAL = 4
 */
public  class WriteAheadLogBackedBlockRDDSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterAll, org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   WriteAheadLogBackedBlockRDDSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  public  void beforeEach ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManager blockManager ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  public  java.io.File dir ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  public  org.apache.spark.serializer.SerializerManager serializerManager ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
}
