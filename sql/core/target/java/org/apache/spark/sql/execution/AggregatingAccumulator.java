package org.apache.spark.sql.execution;
/**
 * Driver side operations like <code>merge</code> and <code>value</code> are executed in the DAGScheduler thread. This
 * thread does not have a SQL configuration so we attach our own here.
 */
public  class AggregatingAccumulator extends org.apache.spark.util.AccumulatorV2<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  static public  org.apache.spark.sql.execution.AggregatingAccumulator apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> functions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttributes)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
  public  boolean isZero ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.AggregatingAccumulator copyAndReset ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.AggregatingAccumulator copy ()  { throw new RuntimeException(); }
  public  void add (org.apache.spark.sql.catalyst.InternalRow v)  { throw new RuntimeException(); }
  public  void merge (org.apache.spark.util.AccumulatorV2<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.InternalRow> other)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow value ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /**
   * Set the state of the accumulator to the state of another accumulator. This is used in cases
   * where we only want to publish the state of the accumulator when the task completes, see
   * {@link CollectMetricsExec} for an example.
   * @param other (undocumented)
   */
    void setState (org.apache.spark.sql.execution.AggregatingAccumulator other)  { throw new RuntimeException(); }
}
