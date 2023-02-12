package org.apache.spark.util;
/** FIFO queue of past checkpointed Datasets */
 abstract class PeriodicCheckpointer<T extends java.lang.Object> implements org.apache.spark.internal.Logging {
  // not preceding
  static public  void removeCheckpointFile (java.lang.String checkpointFile, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
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
  public  int checkpointInterval ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public   PeriodicCheckpointer (int checkpointInterval, org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * Update with a new Dataset. Handle persistence and checkpointing as needed.
   * Since this handles persistence and checkpointing, this should be called before the Dataset
   * has been materialized.
   * <p>
   * @param newData  New Dataset created from previous Datasets in the lineage.
   */
  public  void update (T newData)  { throw new RuntimeException(); }
  /** Checkpoint the Dataset */
  protected abstract  void checkpoint (T data)  ;
  /** Return true iff the Dataset is checkpointed */
  protected abstract  boolean isCheckpointed (T data)  ;
  /**
   * Persist the Dataset.
   * Note: This should handle checking the current {@link StorageLevel} of the Dataset.
   * @param data (undocumented)
   */
  protected abstract  void persist (T data)  ;
  /** Unpersist the Dataset */
  protected abstract  void unpersist (T data)  ;
  /** Get list of checkpoint files for this given Dataset */
  protected abstract  scala.collection.Iterable<java.lang.String> getCheckpointFiles (T data)  ;
  /**
   * Call this to unpersist the Dataset.
   */
  public  void unpersistDataSet ()  { throw new RuntimeException(); }
  /**
   * Call this at the end to delete any remaining checkpoint files.
   */
  public  void deleteAllCheckpoints ()  { throw new RuntimeException(); }
  /**
   * Call this at the end to delete any remaining checkpoint files, except for the last checkpoint.
   * Note that there may not be any checkpoints at all.
   */
  public  void deleteAllCheckpointsButLast ()  { throw new RuntimeException(); }
  /**
   * Get all current checkpoint files.
   * This is useful in combination with {@link deleteAllCheckpointsButLast()}.
   * @return (undocumented)
   */
  public  java.lang.String[] getAllCheckpointFiles ()  { throw new RuntimeException(); }
}
