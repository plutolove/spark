package org.apache.spark.sql.execution.adaptive;
/**
 * A wrapper of shuffle query stage, which follows the given partition arrangement.
 * <p>
 * param:  child           It is usually <code>ShuffleQueryStageExec</code>, but can be the shuffle exchange
 *                        node during canonicalization.
 * param:  partitionSpecs  The partition specs that defines the arrangement.
 * param:  description     The string description of this shuffle reader.
 */
public  class CustomShuffleReaderExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.SparkPlan child ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec> partitionSpecs ()  { throw new RuntimeException(); }
  public  java.lang.String description ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsColumnar ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<java.lang.Object> stringArgs ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.vectorized.ColumnarBatch> doExecuteColumnar ()  { throw new RuntimeException(); }
}
