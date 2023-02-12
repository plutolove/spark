package org.apache.spark.sql.catalyst.expressions;
/**
 * Check if a given expression evaluates to an expected output, in case the input is
 * a literal and in case the input is in the form of a row.
 * @param <A>  type of input
 * param:  mkExpr the expression to test for a given input
 * param:  input value that will be used to create the expression, as literal and in the form
 *        of a row
 * param:  expected the expected output of the expression
 * param:  inputToExpression an implicit conversion from the input type to its corresponding
 *        sql expression
 */
public  class RegexpExpressionsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  public  org.scalatest.prop.Configuration.MaxDiscarded$ MaxDiscarded ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscardedFactor$ MaxDiscardedFactor ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxSize$ MaxSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSize$ MinSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSuccessful$ MinSuccessful ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfig$ PropertyCheckConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration$ PropertyCheckConfiguration ()  { throw new RuntimeException(); }
  // not preceding
  public   RegexpExpressionsSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.SizeRange$ SizeRange ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.Workers$ Workers ()  { throw new RuntimeException(); }
  // not preceding
  public <A extends java.lang.Object> void checkLiteralRow (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> mkExpr, A input, Object expected, scala.Function1<A, org.apache.spark.sql.catalyst.expressions.Expression> inputToExpression)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration generatorDrivenConfig ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}
