package org.apache.spark.sql.execution.streaming;
/** Needed to serialize type T into JSON when using Jackson */
public  class HDFSMetadataLog<T extends java.lang.Object> implements org.apache.spark.sql.execution.streaming.MetadataLog<T>, org.apache.spark.internal.Logging {
  // not preceding
  static public  void verifyBatchIds (scala.collection.Seq<java.lang.Object> batchIds, scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  // not preceding
  public   HDFSMetadataLog (org.apache.spark.sql.SparkSession sparkSession, java.lang.String path, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.Path metadataPath ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.streaming.CheckpointFileManager fileManager ()  { throw new RuntimeException(); }
  /**
   * A <code>PathFilter</code> to filter only batch files
   * @return (undocumented)
   */
  protected  java.lang.Object batchFilesFilter ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.fs.Path batchIdToPath (long batchId)  { throw new RuntimeException(); }
  protected  long pathToBatchId (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  protected  boolean isBatchFile (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Serialize the metadata and write to the output stream. If this method is overridden in a
   * subclass, the overriding method should not close the given output stream, as it will be closed
   * in the caller.
   * @param metadata (undocumented)
   * @param out (undocumented)
   */
  protected  void serialize (T metadata, java.io.OutputStream out)  { throw new RuntimeException(); }
  /**
   * Read and deserialize the metadata from input stream. If this method is overridden in a
   * subclass, the overriding method should not close the given input stream, as it will be closed
   * in the caller.
   * @param in (undocumented)
   * @return (undocumented)
   */
  protected  T deserialize (java.io.InputStream in)  { throw new RuntimeException(); }
  /**
   * Store the metadata for the specified batchId and return <code>true</code> if successful. If the batchId's
   * metadata has already been stored, this method will return <code>false</code>.
   * @param batchId (undocumented)
   * @param metadata (undocumented)
   * @return (undocumented)
   */
  public  boolean add (long batchId, T metadata)  { throw new RuntimeException(); }
  public  scala.Option<T> get (long batchId)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.Object, T>[] get (scala.Option<java.lang.Object> startId, scala.Option<java.lang.Object> endId)  { throw new RuntimeException(); }
  public  scala.Option<scala.Tuple2<java.lang.Object, T>> getLatest ()  { throw new RuntimeException(); }
  /**
   * Get an array of [FileStatus] referencing batch files.
   * The array is sorted by most recent batch file first to
   * oldest batch file.
   * @return (undocumented)
   */
  public  org.apache.hadoop.fs.FileStatus[] getOrderedBatchFiles ()  { throw new RuntimeException(); }
  /**
   * Removes all the log entry earlier than thresholdBatchId (exclusive).
   * @param thresholdBatchId (undocumented)
   */
  public  void purge (long thresholdBatchId)  { throw new RuntimeException(); }
  /**
   * Removes all log entries later than thresholdBatchId (exclusive).
   * @param thresholdBatchId (undocumented)
   */
  public  void purgeAfter (long thresholdBatchId)  { throw new RuntimeException(); }
  /**
   * Parse the log version from the given <code>text</code> -- will throw exception when the parsed version
   * exceeds <code>maxSupportedVersion</code>, or when <code>text</code> is malformed (such as "xyz", "v", "v-1",
   * "v123xyz" etc.)
   * @param text (undocumented)
   * @param maxSupportedVersion (undocumented)
   * @return (undocumented)
   */
    int validateVersion (java.lang.String text, int maxSupportedVersion)  { throw new RuntimeException(); }
}
