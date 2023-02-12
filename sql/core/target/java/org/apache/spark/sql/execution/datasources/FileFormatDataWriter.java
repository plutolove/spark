package org.apache.spark.sql.execution.datasources;
/**
 * Max number of files a single task writes out due to file size. In most cases the number of
 * files written should be very small. This is just a safe guard to protect some really bad
 * settings, e.g. maxRecordsPerFile = 1.
 */
public abstract class FileFormatDataWriter implements org.apache.spark.sql.connector.write.DataWriter<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   FileFormatDataWriter (org.apache.spark.sql.execution.datasources.WriteJobDescription description, org.apache.hadoop.mapreduce.TaskAttemptContext taskAttemptContext, org.apache.spark.internal.io.FileCommitProtocol committer)  { throw new RuntimeException(); }
  // not preceding
  protected  int MAX_FILE_COUNTER ()  { throw new RuntimeException(); }
  public  void abort ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /**
   * Returns the summary of relative information which
   * includes the list of partition strings written out. The list of partitions is sent back
   * to the driver and used to update the catalog. Other information will be sent back to the
   * driver too and used to e.g. update the metrics in UI.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.datasources.WriteTaskResult commit ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.OutputWriter currentWriter ()  { throw new RuntimeException(); }
  protected  void releaseResources ()  { throw new RuntimeException(); }
  /** Trackers for computing various statistics on the data as it's being written out. */
  protected  scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStatsTracker> statsTrackers ()  { throw new RuntimeException(); }
  protected  scala.collection.mutable.Set<java.lang.String> updatedPartitions ()  { throw new RuntimeException(); }
  /** Writes a record */
  public abstract  void write (org.apache.spark.sql.catalyst.InternalRow record)  ;
}
