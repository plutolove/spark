package org.apache.spark.streaming.dstream;
/**
 * Minimum duration of remembering the information of selected files. Defaults to 60 seconds.
 * <p>
 * Files with mod times older than this "window" of remembering will be ignored. So if new
 * files are visible within this window, then the file will get selected in the next batch.
 */
  class FileInputDStream<K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> extends org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> {
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   */
    class FileInputDStreamCheckpointData extends org.apache.spark.streaming.dstream.DStreamCheckpointData<scala.Tuple2<K, V>> {
    // not preceding
    public   FileInputDStreamCheckpointData ()  { throw new RuntimeException(); }
    public  void cleanup (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
    public  void restore ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    public  void update (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
  }
  /**
   * A custom version of the DStreamCheckpointData that stores names of
   * Hadoop files as checkpoint data.
   * @param path (undocumented)
   * @return (undocumented)
   */
  static public  boolean defaultFilter (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last minRememberDurationS duration can be remembered.
   * @param batchDuration (undocumented)
   * @param minRememberDurationS (undocumented)
   * @return (undocumented)
   */
  static public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration, org.apache.spark.streaming.Duration minRememberDurationS)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Ident(org), org.apache), org.apache.hadoop), org.apache.hadoop.mapreduce), [org.apache.hadoop.mapreduce.InputFormat aka TypeName("NewInputFormat")]), List(TypeTree().setOriginal(Ident(TypeName("K"))), TypeTree().setOriginal(Ident(TypeName("V"))))))))
  public   FileInputDStream (org.apache.spark.streaming.StreamingContext _ssc, java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.Option<org.apache.hadoop.conf.Configuration> conf, scala.reflect.ClassTag<K> km, scala.reflect.ClassTag<V> vm, scala.reflect.ClassTag<F> fm)  { throw new RuntimeException(); }
  protected  org.apache.spark.streaming.dstream.FileInputDStream<K, V, F>.FileInputDStreamCheckpointData checkpointData ()  { throw new RuntimeException(); }
    scala.collection.mutable.HashMap<org.apache.spark.streaming.Time, java.lang.String[]> batchTimeToSelectedFiles ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  /**
   * Finds the files that were modified since the last time this method was called and makes
   * a union RDD out of them. Note that this maintains the list of files that were processed
   * in the latest modification time in the previous call to this method. This is because the
   * modification time returned by the FileStatus API seems to return times only at the
   * granularity of seconds in HDFS. And new files may have the same modification time as the
   * latest modification time in the previous call to this method yet was not reported in
   * the previous call.
   * @param validTime (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, V>>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
  /** Clear the old time-to-files mappings along with old RDDs */
  protected  void clearMetadata (org.apache.spark.streaming.Time time)  { throw new RuntimeException(); }
}
