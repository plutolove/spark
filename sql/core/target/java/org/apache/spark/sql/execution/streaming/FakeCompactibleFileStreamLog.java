package org.apache.spark.sql.execution.streaming;
public  class FakeCompactibleFileStreamLog extends org.apache.spark.sql.execution.streaming.CompactibleFileStreamLog<java.lang.String> {
  // not preceding
  static public  int VERSION ()  { throw new RuntimeException(); }
  // not preceding
  public   FakeCompactibleFileStreamLog (int metadataLogVersion, long _fileCleanupDelayMs, int _defaultCompactInterval, int _defaultMinBatchesToRetain, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  protected  long fileCleanupDelayMs ()  { throw new RuntimeException(); }
  protected  boolean isDeletingExpiredLog ()  { throw new RuntimeException(); }
  protected  int defaultCompactInterval ()  { throw new RuntimeException(); }
  protected  int minBatchesToRetain ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> compactLogs (scala.collection.Seq<java.lang.String> logs)  { throw new RuntimeException(); }
}
