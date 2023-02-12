package org.apache.spark.deploy.master;
/**
 * Schedule executors to be launched on the workers.
 * Returns an array containing number of cores assigned to each worker.
 * <p>
 * There are two modes of launching executors. The first attempts to spread out an application's
 * executors on as many workers as possible, while the second does the opposite (i.e. launch them
 * on as few workers as possible). The former is usually better for data locality purposes and is
 * the default.
 * <p>
 * The number of cores assigned to each executor is configurable. When this is explicitly set,
 * multiple executors from the same application may be launched on the same worker if the worker
 * has enough cores and memory. Otherwise, each executor grabs all the cores available on the
 * worker by default, in which case only one executor per application may be launched on each
 * worker during one single schedule iteration.
 * Note that when <code>spark.executor.cores</code> is not set, we may still launch multiple executors from
 * the same application on the same worker. Consider appA and appB both have one executor running
 * on worker1, and appA.coresLeft > 0, then appB is finished and release all its cores on worker1,
 * thus for the next schedule iteration, appA launches a new executor that grabs all the free
 * cores on worker1, therefore we get multiple executors from appA running on worker1.
 * <p>
 * It is important to allocate coresPerExecutor on each worker at a time (instead of 1 core
 * at a time). Consider the following example: cluster has 4 workers with 16 cores each.
 * User requests 3 executors (spark.cores.max = 48, spark.executor.cores = 16). If 1 core is
 * allocated at a time, 12 cores from each worker would be assigned to each executor.
 * Since 12 < 16, no executors would launch [SPARK-8881].
 */
  class Master implements org.apache.spark.rpc.ThreadSafeRpcEndpoint, org.apache.spark.internal.Logging, org.apache.spark.deploy.master.LeaderElectable {
  // not preceding
  static public  java.lang.String SYSTEM_NAME ()  { throw new RuntimeException(); }
  static public  java.lang.String ENDPOINT_NAME ()  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] argStrings)  { throw new RuntimeException(); }
  /**
   * Start the Master and return a three tuple of:
   *   (1) The Master RpcEnv
   *   (2) The web UI bound port
   *   (3) The REST server bound port, if any
   * @param host (undocumented)
   * @param port (undocumented)
   * @param webUiPort (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Tuple3<org.apache.spark.rpc.RpcEnv, java.lang.Object, scala.Option<java.lang.Object>> startRpcEnvAndEndpoint (java.lang.String host, int port, int webUiPort, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  org.apache.spark.rpc.RpcEnv rpcEnv ()  { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   Master (org.apache.spark.rpc.RpcEnv rpcEnv, org.apache.spark.rpc.RpcAddress address, int webUiPort, org.apache.spark.SecurityManager securityMgr, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.WorkerInfo> workers ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.master.ApplicationInfo> idToApp ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<org.apache.spark.deploy.master.ApplicationInfo> apps ()  { throw new RuntimeException(); }
  public  boolean reverseProxy ()  { throw new RuntimeException(); }
  public  void onStart ()  { throw new RuntimeException(); }
  public  void onStop ()  { throw new RuntimeException(); }
  public  void electedLeader ()  { throw new RuntimeException(); }
  public  void revokedLeadership ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive ()  { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveAndReply (org.apache.spark.rpc.RpcCallContext context)  { throw new RuntimeException(); }
  public  void onDisconnected (org.apache.spark.rpc.RpcAddress address)  { throw new RuntimeException(); }
  public  void removeApplication (org.apache.spark.deploy.master.ApplicationInfo app, scala.Enumeration.Value state)  { throw new RuntimeException(); }
}
