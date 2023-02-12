package org.apache.spark.sql.hive.execution;
public  class CountSerDeUDT extends org.apache.spark.sql.types.UserDefinedType<org.apache.spark.sql.hive.execution.CountSerDeSQL> {
  static   boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static public  java.lang.String json ()  { throw new RuntimeException(); }
  static public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  static public  java.lang.String simpleString ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString (int maxNumberFields)  { throw new RuntimeException(); }
  static   boolean sameType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  static   boolean existsRecursively (scala.Function1<org.apache.spark.sql.types.DataType, java.lang.Object> f)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static public  java.lang.String pyUDT ()  { throw new RuntimeException(); }
  static public  java.lang.String serializedPyClass ()  { throw new RuntimeException(); }
  static   org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  static public  int defaultSize ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.String sql ()  { throw new RuntimeException(); }
  static public  java.lang.String catalogString ()  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  // not preceding
  public   CountSerDeUDT ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Class<org.apache.spark.sql.hive.execution.CountSerDeSQL> userClass ()  { throw new RuntimeException(); }
  public  java.lang.String typeName ()  { throw new RuntimeException(); }
    org.apache.spark.sql.hive.execution.CountSerDeUDT asNullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType sqlType ()  { throw new RuntimeException(); }
  public  Object serialize (org.apache.spark.sql.hive.execution.CountSerDeSQL sql)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.execution.CountSerDeSQL deserialize (Object any)  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
}
