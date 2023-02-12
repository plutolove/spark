package org.apache.spark.sql.execution.aggregate;
/**
 * Dumps all entries into a newly created external sorter, clears the hash map, and returns the
 * external sorter.
 */
public  class ObjectAggregationMap {
  // not preceding
  public   ObjectAggregationMap ()  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  /**
   * Dumps all entries into a newly created external sorter, clears the hash map, and returns the
   * external sorter.
   * @param groupingAttributes (undocumented)
   * @param aggregateFunctions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.UnsafeKVExternalSorter dumpToExternalSorter (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> groupingAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateFunction> aggregateFunctions)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.InternalRow getAggregationBuffer (org.apache.spark.sql.catalyst.expressions.UnsafeRow groupingKey)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.aggregate.AggregationBufferEntry> iterator ()  { throw new RuntimeException(); }
  public  void putAggregationBuffer (org.apache.spark.sql.catalyst.expressions.UnsafeRow groupingKey, org.apache.spark.sql.catalyst.InternalRow aggBuffer)  { throw new RuntimeException(); }
  public  int size ()  { throw new RuntimeException(); }
}
