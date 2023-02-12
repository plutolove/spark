package org.apache.spark.sql.execution.datasources;
/**
 * Process the fact that a new partition is about to be written.
 * Only triggered when the relation is partitioned by a (non-empty) sequence of columns.
 * param:  partitionValues The values that define this new partition.
 */
public  interface WriteTaskStatsTracker {
  /**
   * Returns the final statistics computed so far.
   * @note This may only be called once. Further use of the object may lead to undefined behavior.
   * @return An object of subtype of {@link WriteTaskStats}, to be sent to the driver.
   */
  public  org.apache.spark.sql.execution.datasources.WriteTaskStats getFinalStats ()  ;
  /**
   * Process the fact that a new bucket is about to written.
   * Only triggered when the relation is bucketed by a (non-empty) sequence of columns.
   * @param bucketId The bucket number.
   */
  public  void newBucket (int bucketId)  ;
  /**
   * Process the fact that a new file is about to be written.
   * @param filePath Path of the file into which future rows will be written.
   */
  public  void newFile (java.lang.String filePath)  ;
  // not preceding
  public  void newPartition (org.apache.spark.sql.catalyst.InternalRow partitionValues)  ;
  /**
   * Process the fact that a new row to update the tracked statistics accordingly.
   * The row will be written to the most recently witnessed file (via <code>newFile</code>).
   * @note Keep in mind that any overhead here is per-row, obviously,
   *       so implementations should be as lightweight as possible.
   * @param row Current data row to be processed.
   */
  public  void newRow (org.apache.spark.sql.catalyst.InternalRow row)  ;
}
