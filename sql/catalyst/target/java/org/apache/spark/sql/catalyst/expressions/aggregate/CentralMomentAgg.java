package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * The central moment order to be computed.
 */
public abstract class CentralMomentAgg extends org.apache.spark.sql.catalyst.expressions.aggregate.DeclarativeAggregate implements org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  // not preceding
  public   CentralMomentAgg (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference avg ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> initialValues ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference m2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference m3 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference m4 ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> mergeExpressions ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  int momentOrder ()  ;
  protected  org.apache.spark.sql.catalyst.expressions.AttributeReference n ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> updateExpressionsDef ()  { throw new RuntimeException(); }
}
