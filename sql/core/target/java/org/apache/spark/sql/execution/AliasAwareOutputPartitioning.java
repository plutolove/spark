package org.apache.spark.sql.execution;
/**
 * A trait that handles aliases in the <code>outputExpressions</code> to produce <code>outputPartitioning</code>
 * that satisfies output distribution requirements.
 */
public  interface AliasAwareOutputPartitioning extends org.apache.spark.sql.execution.UnaryExecNode {
  public  boolean hasAlias ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> outputExpressions ()  ;
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Attribute> replaceAlias (org.apache.spark.sql.catalyst.expressions.AttributeReference attr)  ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> replaceAliases (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs)  ;
}
