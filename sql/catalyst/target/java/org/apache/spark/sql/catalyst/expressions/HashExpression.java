package org.apache.spark.sql.catalyst.expressions;
/** Seed of the HashExpression. */
public abstract class HashExpression<E extends java.lang.Object> extends org.apache.spark.sql.catalyst.expressions.Expression {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   HashExpression ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.TypeCheckResult checkInputDataTypes ()  { throw new RuntimeException(); }
  protected abstract  E computeHash (Object value, org.apache.spark.sql.types.DataType dataType, E seed)  ;
  protected  java.lang.String computeHash (java.lang.String input, org.apache.spark.sql.types.DataType dataType, java.lang.String result, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
  public  boolean foldable ()  { throw new RuntimeException(); }
  protected  java.lang.String genHashBoolean (java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashBytes (java.lang.String b, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashCalendarInterval (java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashDecimal (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.types.DecimalType d, java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashDouble (java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashFloat (java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashForArray (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String result, org.apache.spark.sql.types.DataType elementType, boolean containsNull)  { throw new RuntimeException(); }
  protected  java.lang.String genHashForMap (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String result, org.apache.spark.sql.types.DataType keyType, org.apache.spark.sql.types.DataType valueType, boolean valueContainsNull)  { throw new RuntimeException(); }
  protected  java.lang.String genHashForStruct (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, java.lang.String input, java.lang.String result, org.apache.spark.sql.types.StructField[] fields)  { throw new RuntimeException(); }
  protected  java.lang.String genHashInt (java.lang.String i, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashLong (java.lang.String l, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashString (java.lang.String input, java.lang.String result)  { throw new RuntimeException(); }
  protected  java.lang.String genHashTimestamp (java.lang.String t, java.lang.String result)  { throw new RuntimeException(); }
  protected abstract  java.lang.String hasherClassName ()  ;
  protected  java.lang.String nullSafeElementHash (java.lang.String input, java.lang.String index, boolean nullable, org.apache.spark.sql.types.DataType elementType, java.lang.String result, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx)  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  E seed ()  ;
}
