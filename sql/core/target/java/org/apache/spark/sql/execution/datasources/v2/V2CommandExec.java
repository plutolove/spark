package org.apache.spark.sql.execution.datasources.v2;
/**
 * Abstract method that each concrete command needs to implement to compute the result.
 */
public abstract class V2CommandExec extends org.apache.spark.sql.execution.SparkPlan {
  // not preceding
  public   V2CommandExec ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> children ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  /**
   * The <code>execute()</code> method of all the physical command classes should reference <code>result</code>
   * so that the command can be executed eagerly right after the command query is created.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.InternalRow[] executeCollect ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTail (int limit)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow[] executeTake (int limit)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> executeToIterator ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  scala.collection.Seq<org.apache.spark.sql.catalyst.InternalRow> run ()  ;
}
