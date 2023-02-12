package org.apache.spark.deploy.history;
/**
 * This should be called with "closed" event log file; No guarantee on reading event log file
 * which is being written, especially the file is compressed. SHS also does the best it can.
 */
public  class SingleEventLogFileWriterSuite extends org.apache.spark.deploy.history.EventLogFileWritersSuite {
  // not preceding
  public   SingleEventLogFileWriterSuite ()  { throw new RuntimeException(); }
  protected  org.apache.spark.deploy.history.EventLogFileWriter createWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  protected  void verifyWriteEventLogFile (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, scala.Option<java.lang.String> compressionCodecShortName, scala.collection.Seq<java.lang.String> expectedLines)  { throw new RuntimeException(); }
}
