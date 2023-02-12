package org.apache.spark.deploy.history;
/**
 * Stop logging events. The event log file will be renamed so that it loses the
 * ".inprogress" suffix.
 */
public  class SingleEventLogFileWriter extends org.apache.spark.deploy.history.EventLogFileWriter {
  // not preceding
  static public  java.lang.String getLogPath (java.net.URI logBaseDir, java.lang.String appId, scala.Option<java.lang.String> appAttemptId, scala.Option<java.lang.String> compressionCodecName)  { throw new RuntimeException(); }
  // not preceding
  public   SingleEventLogFileWriter (java.lang.String appId, scala.Option<java.lang.String> appAttemptId, java.net.URI logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String logPath ()  { throw new RuntimeException(); }
  protected  java.lang.String inProgressPath ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void writeEvent (java.lang.String eventJson, boolean flushLogger)  { throw new RuntimeException(); }
  /**
   * Stop logging events. The event log file will be renamed so that it loses the
   * ".inprogress" suffix.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
