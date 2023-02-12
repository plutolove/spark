package org.apache.spark.sql.types;
/**
 * Enables matching against FractionalType for expressions:
 * <pre><code>
 *   case Cast(child &#64; FractionalType(), StringType) =&gt;
 *     ...
 * </code></pre>
 */
 abstract class FractionalType extends org.apache.spark.sql.types.NumericType {
  // not preceding
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
  // not preceding
  public   FractionalType ()  { throw new RuntimeException(); }
  // not preceding
   abstract  scala.math.Fractional<java.lang.Object> fractional ()  ;
   abstract  scala.math.Integral<java.lang.Object> asIntegral ()  ;
}
