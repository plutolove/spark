package org.apache.spark.streaming;
/**
 * Create a block info for input to the ReceiverInputDStream.createBlockRDD
 * param:  withWALInfo Create block with WAL info in it
 * param:  createBlock Actually create the block in the BlockManager
 * @return
 */
public  class ReceiverInputDStreamSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.streaming.TestSuiteBase, org.apache.spark.streaming.LocalStreamingContext {
  // not preceding
  public   ReceiverInputDStreamSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String checkpointDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.PatienceConfiguration.Timeout eventuallyTimeout ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.streaming.StreamingContext ssc ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean stopSparkContext ()  { throw new RuntimeException(); }
}
