package org.apache.spark.sql.hive.execution;
/**
 * Negative examples.  Currently only left here for documentation purposes.
 * TODO(marmbrus): Test that catalyst fails on these queries.
 */
public  class HiveResolutionSuite extends org.apache.spark.sql.hive.execution.HiveComparisonTest {
  // not preceding
  public   HiveResolutionSuite ()  { throw new RuntimeException(); }
}
