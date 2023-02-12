package org.apache.spark.sql.internal;
public  class SQLConfAssertPlan extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafExecNode, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confToCheck ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLConfAssertPlan (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> confToCheck)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
}
