package org.apache.spark.sql.streaming;
public  class PendingCommitFilesTrackingManifestFileCommitProtocol extends org.apache.spark.sql.execution.streaming.ManifestFileCommitProtocol {
  // not preceding
  static public  scala.collection.mutable.ArrayBuffer<java.lang.String> tracking ()  { throw new RuntimeException(); }
  static public  void cleanPendingCommitFiles ()  { throw new RuntimeException(); }
  static public  void addPendingCommitFiles (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  // not preceding
  public   PendingCommitFilesTrackingManifestFileCommitProtocol (java.lang.String jobId, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  void setupJob (org.apache.hadoop.mapreduce.JobContext jobContext)  { throw new RuntimeException(); }
  public  void onTaskCommit (org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage taskCommit)  { throw new RuntimeException(); }
}
