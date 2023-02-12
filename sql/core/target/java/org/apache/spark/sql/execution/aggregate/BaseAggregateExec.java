package org.apache.spark.sql.execution.aggregate;
/**
 * Holds common logic for aggregate operators
 */
public  interface BaseAggregateExec extends org.apache.spark.sql.execution.UnaryExecNode {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> aggregateAttributes ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> groupingExpressions ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputAttributes ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> resultExpressions ()  ;
  public  java.lang.String verboseStringWithOperatorId ()  ;
}
