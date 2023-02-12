package org.apache.spark.sql.execution.streaming.continuous;
/**
 * Populate the start offsets to start the execution at the current offsets stored in the sink
 * (i.e. avoid reprocessing data that we have already processed). This function must be called
 * before any processing occurs and will populate the following fields:
 *  - currentBatchId
 *  - committedOffsets
 *  The basic structure of this method is as follows:
 * <p>
 *  Identify (from the commit log) the latest epoch that has committed
 *  IF last epoch exists THEN
 *    Get end offsets for the epoch
 *    Set those offsets as the current commit progress
 *    Set the next epoch ID as the last + 1
 *    Return the end offsets of the last epoch as start for the next one
 *    DONE
 *  ELSE
 *    Start a new query log
 *  DONE
 */
public  class ContinuousExecution extends org.apache.spark.sql.execution.streaming.StreamExecution {
  // not preceding
  static public  java.lang.String START_EPOCH_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String EPOCH_COORDINATOR_ID_KEY ()  { throw new RuntimeException(); }
  static public  java.lang.String EPOCH_INTERVAL_KEY ()  { throw new RuntimeException(); }
  // not preceding
  public   ContinuousExecution (org.apache.spark.sql.SparkSession sparkSession, java.lang.String name, java.lang.String checkpointRoot, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan analyzedPlan, org.apache.spark.sql.connector.catalog.SupportsWrite sink, org.apache.spark.sql.streaming.Trigger trigger, org.apache.spark.util.Clock triggerClock, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraOptions, boolean deleteCheckpointOnStop)  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.ContinuousStream> sources ()  { throw new RuntimeException(); }
    java.lang.String currentEpochCoordinatorId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.continuous.WriteToContinuousDataSource logicalPlan ()  { throw new RuntimeException(); }
  protected  void runActivatedStream (org.apache.spark.sql.SparkSession sparkSessionForStream)  { throw new RuntimeException(); }
  /**
   * Report ending partition offsets for the given reader at the given epoch.
   * @param epoch (undocumented)
   * @param stream (undocumented)
   * @param partitionOffsets (undocumented)
   */
  public  void addOffset (long epoch, org.apache.spark.sql.connector.read.streaming.ContinuousStream stream, scala.collection.Seq<org.apache.spark.sql.connector.read.streaming.PartitionOffset> partitionOffsets)  { throw new RuntimeException(); }
  /**
   * Mark the specified epoch as committed. All readers must have reported end offsets for the epoch
   * before this is called.
   * @param epoch (undocumented)
   */
  public  void commit (long epoch)  { throw new RuntimeException(); }
  /**
   * Blocks the current thread until execution has committed at or after the specified epoch.
   * @param epoch (undocumented)
   */
    void awaitEpoch (long epoch)  { throw new RuntimeException(); }
  /**
   * Stores error and stops the query execution thread to terminate the query in new thread.
   * @param error (undocumented)
   */
  public  void stopInNewThread (java.lang.Throwable error)  { throw new RuntimeException(); }
  /**
   * Stops the query execution thread to terminate the query.
   */
  public  void stop ()  { throw new RuntimeException(); }
}
