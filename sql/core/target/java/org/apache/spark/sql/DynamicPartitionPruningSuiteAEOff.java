package org.apache.spark.sql;
/**
 * This test is a small reproduction of the Query-23 of the TPCDS benchmark.
 * The query employs an aggregation on the result of a join between a store table and a
 * date dimension table which is further joined with item, date, and store tables using
 * a disjoint filter. The outcome of this query is a sequence of nested joins that have
 * duplicated partitioning keys, also used to uniquely identify the dynamic pruning filters.
 */
public  class DynamicPartitionPruningSuiteAEOff extends org.apache.spark.sql.DynamicPartitionPruningSuiteBase {
  // not preceding
  public   DynamicPartitionPruningSuiteAEOff ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean adaptiveExecutionOn ()  { throw new RuntimeException(); }
}
