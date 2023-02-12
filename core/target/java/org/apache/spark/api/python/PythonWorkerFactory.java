package org.apache.spark.api.python;
/**
 * Connect to a worker launched through pyspark/daemon.py (by default), which forks python
 * processes itself to avoid the high cost of forking from Java. This currently only works
 * on UNIX-based systems.
 */
  class PythonWorkerFactory implements org.apache.spark.internal.Logging {
  // not preceding
  static public  int PROCESS_WAIT_TIMEOUT_MS ()  { throw new RuntimeException(); }
  static public  long IDLE_WORKER_TIMEOUT_NS ()  { throw new RuntimeException(); }
  // not preceding
  public   PythonWorkerFactory (java.lang.String pythonExec, scala.collection.immutable.Map<java.lang.String, java.lang.String> envVars)  { throw new RuntimeException(); }
  public  java.net.InetAddress daemonHost ()  { throw new RuntimeException(); }
  public  java.net.Socket create ()  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  void stopWorker (java.net.Socket worker)  { throw new RuntimeException(); }
  public  void releaseWorker (java.net.Socket worker)  { throw new RuntimeException(); }
}
