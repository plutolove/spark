package org.apache.spark.sql.test;
public  class MessageCapturingCommitProtocol extends org.apache.spark.internal.io.HadoopMapReduceCommitProtocol {
  // not preceding
  static public  java.util.concurrent.ConcurrentLinkedQueue<org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage> commitMessages ()  { throw new RuntimeException(); }
  // not preceding
  public   MessageCapturingCommitProtocol (java.lang.String jobId, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  void onTaskCommit (org.apache.spark.internal.io.FileCommitProtocol.TaskCommitMessage msg)  { throw new RuntimeException(); }
}
