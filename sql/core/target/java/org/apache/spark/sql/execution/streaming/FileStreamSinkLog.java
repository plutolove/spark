package org.apache.spark.sql.execution.streaming;
/**
 * A special log for {@link FileStreamSink}. It will write one log file for each batch. The first line
 * of the log file is the version number, and there are multiple JSON lines following. Each JSON
 * line is a JSON format of {@link SinkFileStatus}.
 * <p>
 * As reading from many small files is usually pretty slow, {@link FileStreamSinkLog} will compact log
 * files every "spark.sql.sink.file.log.compactLen" batches into a big file. When doing a
 * compaction, it will read all old log files and merge them with the new batch. During the
 * compaction, it will also delete the files that are deleted (marked by {@link SinkFileStatus.action}).
 * When the reader uses <code>allFiles</code> to list all files, this method only returns the visible files
 * (drops the deleted files).
 */
public  class FileStreamSinkLog extends org.apache.spark.sql.execution.streaming.CompactibleFileStreamLog<org.apache.spark.sql.execution.streaming.SinkFileStatus> {
  // not preceding
  static public  int VERSION ()  { throw new RuntimeException(); }
  static public  java.lang.String DELETE_ACTION ()  { throw new RuntimeException(); }
  static public  java.lang.String ADD_ACTION ()  { throw new RuntimeException(); }
  // not preceding
  public   FileStreamSinkLog (int metadataLogVersion, org.apache.spark.sql.SparkSession sparkSession, java.lang.String path)  { throw new RuntimeException(); }
  protected  long fileCleanupDelayMs ()  { throw new RuntimeException(); }
  protected  boolean isDeletingExpiredLog ()  { throw new RuntimeException(); }
  protected  int defaultCompactInterval ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.SinkFileStatus> compactLogs (scala.collection.Seq<org.apache.spark.sql.execution.streaming.SinkFileStatus> logs)  { throw new RuntimeException(); }
}
