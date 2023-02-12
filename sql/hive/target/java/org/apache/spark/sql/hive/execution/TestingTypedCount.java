package org.apache.spark.sql.hive.execution;
public  class TestingTypedCount extends org.apache.spark.sql.catalyst.expressions.aggregate.TypedImperativeAggregate<org.apache.spark.sql.hive.execution.TestingTypedCount.State> implements scala.Product, scala.Serializable {
  static public  class State implements scala.Product, scala.Serializable {
    // not preceding
    public  long count ()  { throw new RuntimeException(); }
    // not preceding
    public   State (long count)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class State$ extends scala.runtime.AbstractFunction1<java.lang.Object, org.apache.spark.sql.hive.execution.TestingTypedCount.State> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final State$ MODULE$ = null;
    public   State$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
  public  int mutableAggBufferOffset ()  { throw new RuntimeException(); }
  public  int inputAggBufferOffset ()  { throw new RuntimeException(); }
  // not preceding
  public   TestingTypedCount (org.apache.spark.sql.catalyst.expressions.Expression child, int mutableAggBufferOffset, int inputAggBufferOffset)  { throw new RuntimeException(); }
  // not preceding
  public   TestingTypedCount (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.TestingTypedCount.State createAggregationBuffer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.TestingTypedCount.State update (org.apache.spark.sql.hive.execution.TestingTypedCount.State buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.TestingTypedCount.State merge (org.apache.spark.sql.hive.execution.TestingTypedCount.State buffer, org.apache.spark.sql.hive.execution.TestingTypedCount.State input)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.hive.execution.TestingTypedCount.State buffer)  { throw new RuntimeException(); }
  public  byte[] serialize (org.apache.spark.sql.hive.execution.TestingTypedCount.State buffer)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.TestingTypedCount.State deserialize (byte[] storageFormat)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewMutableAggBufferOffset (int newMutableAggBufferOffset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate withNewInputAggBufferOffset (int newInputAggBufferOffset)  { throw new RuntimeException(); }
  public  java.lang.String prettyName ()  { throw new RuntimeException(); }
}
