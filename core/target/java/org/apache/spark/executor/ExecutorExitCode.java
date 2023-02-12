package org.apache.spark.executor;
/** DiskStore failed to create a local temporary directory after many attempts. */
// not preceding
public  class ExecutorExitCode {
  // not preceding
  static public  int DISK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to initialize after many attempts. */
  static public  int EXTERNAL_BLOCK_STORE_FAILED_TO_INITIALIZE ()  { throw new RuntimeException(); }
  /** ExternalBlockStore failed to create a local temporary directory after many attempts. */
  static public  int EXTERNAL_BLOCK_STORE_FAILED_TO_CREATE_DIR ()  { throw new RuntimeException(); }
  /**
   * Executor is unable to send heartbeats to the driver more than
   * "spark.executor.heartbeat.maxFailures" times.
   * @return (undocumented)
   */
  static public  int HEARTBEAT_FAILURE ()  { throw new RuntimeException(); }
  static public  java.lang.String explainExitCode (int exitCode)  { throw new RuntimeException(); }
}
