package org.apache.spark.sql.catalyst.expressions;
/** This expression is always nullable because it returns null if index is out of range. */
public  interface String2StringExpression extends org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  org.apache.spark.unsafe.types.UTF8String convert (org.apache.spark.unsafe.types.UTF8String v)  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> inputTypes ()  ;
  public  Object nullSafeEval (Object input)  ;
}
