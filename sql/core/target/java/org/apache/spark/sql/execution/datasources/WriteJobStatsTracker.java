package org.apache.spark.sql.execution.datasources;
/**
 * Instantiates a {@link WriteTaskStatsTracker}, based on (non-transient) members of this class.
 * To be called by executors.
 * @return A {@link WriteTaskStatsTracker} instance to be used for computing stats during a write task
 */
public  interface WriteJobStatsTracker extends scala.Serializable {
  // not preceding
  public  org.apache.spark.sql.execution.datasources.WriteTaskStatsTracker newTaskInstance ()  ;
  /**
   * Process the given collection of stats computed during this job.
   * E.g. aggregate them, write them to memory / disk, issue warnings, whatever.
   * @param stats One {@link WriteTaskStats} object from each successful write task.
   * @note The type of @param <code>stats</code> is too generic. These classes should probably be parametrized:
   *   WriteTaskStatsTracker[S <: WriteTaskStats]
   *   WriteJobStatsTracker[S <: WriteTaskStats, T <: WriteTaskStatsTracker[S}
   * and this would then be:
   *   def processStats(stats: Seq[S]): Unit
   * but then we wouldn't be able to have a Seq[WriteJobStatsTracker] due to type
   * co-/contra-variance considerations. Instead, you may feel free to just cast <code>stats</code>
   * to the expected derived type when implementing this method in a derived class.
   * The framework will make sure to call this with the right arguments.
   */
  public  void processStats (scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats> stats)  ;
}
