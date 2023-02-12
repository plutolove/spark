package org.apache.spark.sql.catalyst.analysis;
/** Collect all the streaming aggregates in a sub plan */
// not preceding
public  class UnsupportedOperationChecker$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final UnsupportedOperationChecker$ MODULE$ = null;
  public   UnsupportedOperationChecker$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void checkForBatch (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  public  void checkStreamingQueryGlobalWatermarkLimit (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode, boolean failWhenDetected)  { throw new RuntimeException(); }
  /** Collect all the streaming aggregates in a sub plan */
  public  void checkForStreaming (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Whether the subplan will contain complete data or incremental data in every incremental
   * execution. Some operations may be allowed only when the child logical plan gives complete
   * data.
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   */
  public  void checkForContinuous (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
}
