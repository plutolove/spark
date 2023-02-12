package org.apache.spark.sql.catalyst.expressions;
/**
 * Check the equality between result of expression and expected value, it will handle
 * Array[Byte], Spread[Double], MapData and Row. Also check whether nullable in expression is
 * true if result is null
 */
public  interface ExpressionEvalHelper extends org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks, org.apache.spark.sql.catalyst.plans.PlanTestBase {
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against unary expressions by feeding them arbitrary literals of <code>dataType</code>.
   * @param c (undocumented)
   * @param dataType (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against binary expressions by feeding them arbitrary literals of <code>dataType1</code>
   * and <code>dataType2</code>.
   * @param c (undocumented)
   * @param dataType1 (undocumented)
   * @param dataType2 (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType1, org.apache.spark.sql.types.DataType dataType2)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against ternary expressions by feeding them arbitrary literals of <code>dataType1</code>,
   * <code>dataType2</code> and <code>dataType3</code>.
   * @param c (undocumented)
   * @param dataType1 (undocumented)
   * @param dataType2 (undocumented)
   * @param dataType3 (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function3<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType1, org.apache.spark.sql.types.DataType dataType2, org.apache.spark.sql.types.DataType dataType3)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use.
   * <p>
   * This method test against expressions take Seq[Expression] as input by feeding them
   * arbitrary length Seq of arbitrary literal of <code>dataType</code>.
   * @param c (undocumented)
   * @param dataType (undocumented)
   * @param minNumElements (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegen (scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType, int minNumElements)  ;
  /**
   * Test evaluation results between Interpreted mode and Codegen mode, making sure we have
   * consistent result regardless of the evaluation method we use. If an exception is thrown,
   * it checks that both modes throw the same exception.
   * <p>
   * This method test against binary expressions by feeding them arbitrary literals of <code>dataType1</code>
   * and <code>dataType2</code>.
   * @param c (undocumented)
   * @param dataType1 (undocumented)
   * @param dataType2 (undocumented)
   */
  public  void checkConsistencyBetweenInterpretedAndCodegenAllowingException (scala.Function2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression> c, org.apache.spark.sql.types.DataType dataType1, org.apache.spark.sql.types.DataType dataType2)  ;
  public  void checkDoubleEvaluation (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, org.scalactic.TripleEqualsSupport.Spread<java.lang.Object> expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluation (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithMutableProjection (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithOptimization (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithUnsafeProjection (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  void checkEvaluationWithoutCodegen (org.apache.spark.sql.catalyst.expressions.Expression expression, Object expected, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public <T extends java.lang.Throwable> void checkExceptionInExpression (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, java.lang.String expectedErrMsg, scala.reflect.ClassTag<T> evidence$1)  ;
  public <T extends java.lang.Throwable> void checkExceptionInExpression (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, org.apache.spark.sql.catalyst.InternalRow inputRow, java.lang.String expectedErrMsg, scala.reflect.ClassTag<T> evidence$2)  ;
  /**
   * Check the equality between result of expression and expected value, it will handle
   * Array[Byte], Spread[Double], MapData and Row. Also check whether nullable in expression is
   * true if result is null
   * @param result (undocumented)
   * @param expected (undocumented)
   * @param expression (undocumented)
   * @return (undocumented)
   */
  public  boolean checkResult (Object result, Object expected, org.apache.spark.sql.catalyst.expressions.Expression expression)  ;
  public  boolean checkResult (Object result, Object expected, org.apache.spark.sql.types.DataType exprDataType, boolean exprNullable)  ;
  public  void cmpInterpretWithCodegen (org.apache.spark.sql.catalyst.InternalRow inputRow, org.apache.spark.sql.catalyst.expressions.Expression expr, boolean exceptionAllowed)  ;
  /**
   * Checks the equality between two exceptions. Returns true iff the two exceptions are instances
   * of the same class and they have the same message.
   * @param e1 (undocumented)
   * @param e2 (undocumented)
   * @return (undocumented)
   */
  public  boolean compareExceptions (java.lang.Exception e1, java.lang.Exception e2)  ;
  /**
   * Check the equality between result of expression and expected value, it will handle
   * Array[Byte] and Spread[Double].
   * @param result (undocumented)
   * @param expected (undocumented)
   * @return (undocumented)
   */
  public  boolean compareResults (Object result, Object expected)  ;
  public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData create_map (scala.collection.Seq<scala.Tuple2<?, ?>> entries)  ;
  public  org.apache.spark.sql.catalyst.util.ArrayBasedMapData create_map (scala.collection.Seq<?> keys, scala.collection.Seq<?> values)  ;
  public  org.apache.spark.sql.catalyst.InternalRow create_row (scala.collection.Seq<java.lang.Object> values)  ;
  public  Object evaluateWithMutableProjection (scala.Function0<org.apache.spark.sql.catalyst.expressions.Expression> expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  org.apache.spark.sql.catalyst.InternalRow evaluateWithUnsafeProjection (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  Object evaluateWithoutCodegen (org.apache.spark.sql.catalyst.expressions.Expression expression, org.apache.spark.sql.catalyst.InternalRow inputRow)  ;
  public  org.apache.spark.sql.catalyst.expressions.Projection generateProject (scala.Function0<org.apache.spark.sql.catalyst.expressions.Projection> generator, org.apache.spark.sql.catalyst.expressions.Expression expression)  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression prepareEvaluation (org.apache.spark.sql.catalyst.expressions.Expression expression)  ;
  /**
   * Private helper function for comparing two values using relative tolerance.
   * Note that if x or y is extremely close to zero, i.e., smaller than Double.MinPositiveValue,
   * the relative tolerance is meaningless, so the exception will be raised to warn users.
   * <p>
   * TODO: this duplicates functions in spark.ml.util.TestingUtils.relTol and
   * spark.mllib.util.TestingUtils.relTol, they could be moved to common utils sub module for the
   * whole spark project which does not depend on other modules. See more detail in discussion:
   * https://github.com/apache/spark/pull/15059#issuecomment-246940444
   * @param x (undocumented)
   * @param y (undocumented)
   * @param eps (undocumented)
   * @return (undocumented)
   */
  public  boolean relativeErrorComparison (double x, double y, double eps)  ;
  public  void testBothCodegenAndInterpreted (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
