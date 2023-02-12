package org.apache.spark.sql.execution.aggregate;
/**
 * A required check for any fast hash map implementation (basically the common requirements
 * for row-based and vectorized).
 * Currently fast hash map is supported for primitive data types during partial aggregation.
 * This list of supported use-cases should be expanded over time.
 */
// not preceding
public  class HashAggregateExec$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HashAggregateExec$ MODULE$ = null;
  public   HashAggregateExec$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsAggregate (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateBufferAttributes)  { throw new RuntimeException(); }
}
