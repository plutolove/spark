package org.apache.spark.sql.execution.aggregate;
/**
 * Dumps all entries into a newly created external sorter, clears the hash map, and returns the
 * external sorter.
 */
public  class AggregationBufferEntry {
  // not preceding
  public   AggregationBufferEntry (org.apache.spark.sql.catalyst.expressions.UnsafeRow groupingKey, org.apache.spark.sql.catalyst.InternalRow aggregationBuffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow aggregationBuffer ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow groupingKey ()  { throw new RuntimeException(); }
}
