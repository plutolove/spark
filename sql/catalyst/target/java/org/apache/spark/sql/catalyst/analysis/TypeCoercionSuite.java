package org.apache.spark.sql.catalyst.analysis;
/**
 * There are rules that need to not fire before child expressions get resolved.
 * We use this test to make sure those rules do not fire early.
 */
public  class TypeCoercionSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  static public  class AnyTypeUnaryExpression extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
    // not preceding
    public   AnyTypeUnaryExpression (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class AnyTypeUnaryExpression$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.analysis.TypeCoercionSuite.AnyTypeUnaryExpression> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AnyTypeUnaryExpression$ MODULE$ = null;
    public   AnyTypeUnaryExpression$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NumericTypeUnaryExpression extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
    // not preceding
    public   NumericTypeUnaryExpression (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NumericTypeUnaryExpression$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.analysis.TypeCoercionSuite.NumericTypeUnaryExpression> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NumericTypeUnaryExpression$ MODULE$ = null;
    public   NumericTypeUnaryExpression$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class AnyTypeBinaryOperator extends org.apache.spark.sql.catalyst.expressions.BinaryOperator implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
    // not preceding
    public   AnyTypeBinaryOperator (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.AbstractDataType inputType ()  { throw new RuntimeException(); }
    public  java.lang.String symbol ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class AnyTypeBinaryOperator$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.analysis.TypeCoercionSuite.AnyTypeBinaryOperator> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AnyTypeBinaryOperator$ MODULE$ = null;
    public   AnyTypeBinaryOperator$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NumericTypeBinaryOperator extends org.apache.spark.sql.catalyst.expressions.BinaryOperator implements org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression left ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.Expression right ()  { throw new RuntimeException(); }
    // not preceding
    public   NumericTypeBinaryOperator (org.apache.spark.sql.catalyst.expressions.Expression left, org.apache.spark.sql.catalyst.expressions.Expression right)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.AbstractDataType inputType ()  { throw new RuntimeException(); }
    public  java.lang.String symbol ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class NumericTypeBinaryOperator$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.analysis.TypeCoercionSuite.NumericTypeBinaryOperator> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NumericTypeBinaryOperator$ MODULE$ = null;
    public   NumericTypeBinaryOperator$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> integralTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> fractionalTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> numericTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> atomicTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> complexTypes ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.types.DataType> allTypes ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  public   TypeCoercionSuite ()  { throw new RuntimeException(); }
}
