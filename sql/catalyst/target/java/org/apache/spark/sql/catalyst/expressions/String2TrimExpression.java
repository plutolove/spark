package org.apache.spark.sql.catalyst.expressions;
public  interface String2TrimExpression extends org.apache.spark.sql.catalyst.expressions.ImplicitCastInputTypes {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  ;
  public  org.apache.spark.sql.types.DataType dataType ()  ;
  public  java.lang.String direction ()  ;
  public  boolean foldable ()  ;
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  ;
  public  boolean nullable ()  ;
  public  java.lang.String sql ()  ;
  public  org.apache.spark.sql.catalyst.expressions.Expression srcStr ()  ;
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> trimStr ()  ;
}
