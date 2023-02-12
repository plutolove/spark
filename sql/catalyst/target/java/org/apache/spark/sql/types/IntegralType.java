package org.apache.spark.sql.types;
/**
 * Enables matching against IntegralType for expressions:
 * <pre><code>
 *   case Cast(child &#64; IntegralType(), StringType) =&gt;
 *     ...
 * </code></pre>
 */
 abstract class IntegralType extends org.apache.spark.sql.types.NumericType {
  // not preceding
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  static   org.apache.spark.sql.types.DataType defaultConcreteType ()  { throw new RuntimeException(); }
  static   java.lang.String simpleString ()  { throw new RuntimeException(); }
  static   boolean acceptsType (org.apache.spark.sql.types.DataType other)  { throw new RuntimeException(); }
  // not preceding
  public   IntegralType ()  { throw new RuntimeException(); }
  // not preceding
   abstract  scala.math.Integral<java.lang.Object> integral ()  ;
}
