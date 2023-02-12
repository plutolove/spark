package org.apache.spark.status;
/**
 * There's always a single ApplicationEnvironmentInfo object per application, so this
 * ID doesn't need to be dynamic. But the KVStore API requires an ID.
 */
  class ExecutorSummaryWrapper {
  // not preceding
  public   ExecutorSummaryWrapper (org.apache.spark.status.api.v1.ExecutorSummary info)  { throw new RuntimeException(); }
  public  java.lang.String host ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.api.v1.ExecutorSummary info ()  { throw new RuntimeException(); }
}
