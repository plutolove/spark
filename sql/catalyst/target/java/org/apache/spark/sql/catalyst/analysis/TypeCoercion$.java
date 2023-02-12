package org.apache.spark.sql.catalyst.analysis;
/**
 * Case 1 type widening (see the classdoc comment above for TypeCoercion).
 * <p>
 * Find the tightest common type of two types that might be used in a binary expression.
 * This handles all numeric types except fixed-precision decimals interacting with each other or
 * with primitive types, because in that case the precision and scale of the result depends on
 * the operation. Those rules are implemented in {@link DecimalPrecision}.
 */
// not preceding
public  class TypeCoercion$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TypeCoercion$ MODULE$ = null;
  public   TypeCoercion$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Case 1 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link DecimalPrecision}.
   * @return (undocumented)
   */
  public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonType ()  { throw new RuntimeException(); }
  /**
   * The method finds a common type for data types that differ only in nullable flags, including
   * <code>nullable</code>, <code>containsNull</code> of {@link ArrayType} and <code>valueContainsNull</code> of {@link MapType}.
   * If the input types are different besides nullable flags, None is returned.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Case 2 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * i.e. the main difference with {@link findTightestCommonType} is that here we allow some
   * loss of precision when widening decimal and double, and promotion to string.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  /**
   * Whether the data type contains StringType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  boolean hasStringType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Similar to {@link findWiderTypeForTwo} that can handle decimal types, but can't promote to
   * string. If the wider decimal type exceeds system limitation, this rule will truncate
   * the decimal type before return it.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
    scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotionForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Check whether the given types are equal ignoring nullable, containsNull and valueContainsNull.
   * @param types (undocumented)
   * @return (undocumented)
   */
  public  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
}
