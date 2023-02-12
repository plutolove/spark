package org.apache.spark.executor;
/** DiskStore failed to create a local temporary directory after many attempts. */
// not preceding
public  class ExecutorExitCode$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExecutorExitCode$ MODULE$ = null;
  public   ExecutorExitCode$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int DISK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to initialize after many attempts. */
  public  int EXTERNAL_BLOCK_STORE_FAILED_TO_INITIALIZE ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to create a local temporary directory after many attempts. */
  public  int EXTERNAL_BLOCK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /**
   * Executor is unable to send heartbeats to the driver more than
   * "spark.executor.heartbeat.maxFailures" times.
   * @return (undocumented)
   */
  public  int HEARTBEAT_FAILURE ()  { throw new RuntimeException(); }
  public  java.lang.String explainExitCode (int exitCode)  { throw new RuntimeException(); }
}
