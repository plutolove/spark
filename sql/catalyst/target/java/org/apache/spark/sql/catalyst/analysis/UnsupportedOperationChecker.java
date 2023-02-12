package org.apache.spark.sql.catalyst.analysis;
/** Collect all the streaming aggregates in a sub plan */
// not preceding
public  class UnsupportedOperationChecker {
  // not preceding
  static public  void checkForBatch (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  static public  void checkStreamingQueryGlobalWatermarkLimit (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode, boolean failWhenDetected)  { throw new RuntimeException(); }
  /** Collect all the streaming aggregates in a sub plan */
  static public  void checkForStreaming (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Whether the subplan will contain complete data or incremental data in every incremental
   * execution. Some operations may be allowed only when the child logical plan gives complete
   * data.
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   */
  static public  void checkForContinuous (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
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
}
