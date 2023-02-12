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
public  class TypeCoercion {
  /** Build new children with the widest types for each attribute among all the children */
  // not preceding
  static public  class WidenSetOperationTypes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WidenSetOperationTypes$ MODULE$ = null;
    public   WidenSetOperationTypes$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class PromoteStrings extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   PromoteStrings (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class PromoteStrings$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.PromoteStrings> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PromoteStrings$ MODULE$ = null;
    public   PromoteStrings$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class InConversion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   InConversion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class InConversion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.InConversion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InConversion$ MODULE$ = null;
    public   InConversion$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class BooleanEquality$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BooleanEquality$ MODULE$ = null;
    public   BooleanEquality$ ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class FunctionArgumentConversion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FunctionArgumentConversion$ MODULE$ = null;
    public   FunctionArgumentConversion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Division$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Division$ MODULE$ = null;
    public   Division$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class IntegralDivision$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IntegralDivision$ MODULE$ = null;
    public   IntegralDivision$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class CaseWhenCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final CaseWhenCoercion$ MODULE$ = null;
    public   CaseWhenCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class IfCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IfCoercion$ MODULE$ = null;
    public   IfCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class StackCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StackCoercion$ MODULE$ = null;
    public   StackCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ConcatCoercion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   ConcatCoercion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ConcatCoercion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.ConcatCoercion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ConcatCoercion$ MODULE$ = null;
    public   ConcatCoercion$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class MapZipWithCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MapZipWithCoercion$ MODULE$ = null;
    public   MapZipWithCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class EltCoercion extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
    // not preceding
    public   EltCoercion (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class EltCoercion$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.internal.SQLConf, org.apache.spark.sql.catalyst.analysis.TypeCoercion.EltCoercion> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final EltCoercion$ MODULE$ = null;
    public   EltCoercion$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class DateTimeOperations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DateTimeOperations$ MODULE$ = null;
    public   DateTimeOperations$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ImplicitTypeCasts$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ImplicitTypeCasts$ MODULE$ = null;
    public   ImplicitTypeCasts$ ()  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
    /**
     * Given an expected data type, try to cast the expression and return the cast expression.
     * <p>
     * If the expression already fits the input type, we simply return the expression itself.
     * If the expression has an incompatible type that cannot be implicitly cast, return None.
     * @param e (undocumented)
     * @param expectedType (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> implicitCast (org.apache.spark.sql.catalyst.expressions.Expression e, org.apache.spark.sql.types.AbstractDataType expectedType)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class WindowFrameCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final WindowFrameCoercion$ MODULE$ = null;
    public   WindowFrameCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class StringLiteralCoercion$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.TypeCoercionRule {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StringLiteralCoercion$ MODULE$ = null;
    public   StringLiteralCoercion$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan coerceTypes (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> typeCoercionRules (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  static public  scala.collection.IndexedSeq<org.apache.spark.sql.types.NumericType> numericPrecedence ()  { throw new RuntimeException(); }
  /**
   * Case 1 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link DecimalPrecision}.
   * @return (undocumented)
   */
  static public  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, scala.Option<org.apache.spark.sql.types.DataType>> findTightestCommonType ()  { throw new RuntimeException(); }
  /**
   * The method finds a common type for data types that differ only in nullable flags, including
   * <code>nullable</code>, <code>containsNull</code> of {@link ArrayType} and <code>valueContainsNull</code> of {@link MapType}.
   * If the input types are different besides nullable flags, None is returned.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findCommonTypeDifferentOnlyInNullFlags (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Case 2 type widening (see the classdoc comment above for TypeCoercion).
   * <p>
   * i.e. the main difference with {@link findTightestCommonType} is that here we allow some
   * loss of precision when widening decimal and double, and promotion to string.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  /**
   * Whether the data type contains StringType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  static public  boolean hasStringType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Similar to {@link findWiderTypeForTwo} that can handle decimal types, but can't promote to
   * string. If the wider decimal type exceeds system limitation, this rule will truncate
   * the decimal type before return it.
   * @param t1 (undocumented)
   * @param t2 (undocumented)
   * @return (undocumented)
   */
  static   scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotionForTwo (org.apache.spark.sql.types.DataType t1, org.apache.spark.sql.types.DataType t2)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.sql.types.DataType> findWiderTypeWithoutStringPromotion (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
  /**
   * Check whether the given types are equal ignoring nullable, containsNull and valueContainsNull.
   * @param types (undocumented)
   * @return (undocumented)
   */
  static public  boolean haveSameType (scala.collection.Seq<org.apache.spark.sql.types.DataType> types)  { throw new RuntimeException(); }
}
