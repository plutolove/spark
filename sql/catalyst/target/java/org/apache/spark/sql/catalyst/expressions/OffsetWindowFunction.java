package org.apache.spark.sql.catalyst.expressions;
/**
 * Input expression to evaluate against a row which a number of rows below or above (depending on
 * the value and sign of the offset) the current row.
 */
public abstract class OffsetWindowFunction extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.WindowFunction, org.apache.spark.sql.catalyst.expressions.Unevaluable, org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  // not preceding
  public   OffsetWindowFunction ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  /**
   * Direction of the number of rows between the current row and the row where the input expression
   * is evaluated.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.SortDirection direction ()  ;
  public  boolean foldable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.WindowFrame frame ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression input ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  /**
   * (Foldable) expression that contains the number of rows between the current row and the row
   * where the input expression is evaluated.
   * @return (undocumented)
   */
  public abstract  org.apache.spark.sql.catalyst.expressions.Expression offset ()  ;
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
