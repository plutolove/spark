package org.apache.spark.sql.execution.streaming;
public  class FileStreamSourceLog extends org.apache.spark.sql.execution.streaming.CompactibleFileStreamLog<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> {
  // not preceding
  static public  int VERSION ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSourceLog (int metadataLogVersion, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  protected  int defaultCompactInterval ()  { throw new RuntimeException(); }
  protected  long fileCleanupDelayMs ()  { throw new RuntimeException(); }
  protected  boolean isDeletingExpiredLog ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> compactLogs (scala.collection.Seq<org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry> logs)  { throw new RuntimeException(); }
  public  boolean add (long batchId, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry[] logs)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, org.apache.spark.sql.execution.streaming.FileStreamSource.FileEntry[]>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
}
