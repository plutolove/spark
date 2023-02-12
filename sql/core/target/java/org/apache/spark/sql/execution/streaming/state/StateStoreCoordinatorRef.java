package org.apache.spark.sql.execution.streaming.state;
/** Verify whether the given executor has the active instance of a state store */
public  class StateStoreCoordinatorRef {
  /**
   * Create a reference to a {@link StateStoreCoordinator}
   * @param env (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef forDriver (org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.execution.streaming.state.StateStoreCoordinatorRef forExecutor (org.apache.spark.SparkEnv env)  { throw new RuntimeException(); }
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
  // not preceding
    void reportActiveInstance (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId stateStoreProviderId, java.lang.String host, java.lang.String executorId)  { throw new RuntimeException(); }
  /** Verify whether the given executor has the active instance of a state store */
    boolean verifyIfInstanceActive (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId stateStoreProviderId, java.lang.String executorId)  { throw new RuntimeException(); }
  /** Get the location of the state store */
    scala.Option<java.lang.String> getLocation (org.apache.spark.sql.execution.streaming.state.StateStoreProviderId stateStoreProviderId)  { throw new RuntimeException(); }
  /** Deactivate instances related to a query */
    void deactivateInstances (java.util.UUID runId)  { throw new RuntimeException(); }
    void stop ()  { throw new RuntimeException(); }
}
