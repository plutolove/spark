package org.apache.spark.sql.catalyst.expressions;
/**
 * A collection of data types used for resolution the output type of the expression. By default,
 * data types of all child expressions. The collection must not be empty.
 */
public  interface ComplexTypeMergingExpression {
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  void dataTypeCheck ()  ;
  /**
   * A collection of data types used for resolution the output type of the expression. By default,
   * data types of all child expressions. The collection must not be empty.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypesForMerging ()  ;
}
