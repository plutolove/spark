package org.apache.spark.sql.catalyst.expressions;
/** Name of the function for this expression on a {@link Decimal} type. */
public abstract class BinaryArithmetic extends org.apache.spark.sql.catalyst.expressions.BinaryOperator implements org.apache.spark.sql.catalyst.expressions.NullIntolerant {
  // not preceding
  static public  scala.Option<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.Expression>> unapply (org.apache.spark.sql.catalyst.expressions.BinaryArithmetic e)  { throw new RuntimeException(); }
  // not preceding
  public   BinaryArithmetic ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean checkOverflow ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean resolved ()  { throw new RuntimeException(); }
  /** Name of the function for this expression on a {@link Decimal} type. */
  public  java.lang.String decimalMethod ()  { throw new RuntimeException(); }
  /** Name of the function for this expression on a {@link CalendarInterval} type. */
  public  java.lang.String calendarIntervalMethod ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> exactMathMethod ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
}
