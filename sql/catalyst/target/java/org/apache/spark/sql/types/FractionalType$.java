package org.apache.spark.sql.types;
/**
 * Enables matching against FractionalType for expressions:
 * <pre><code>
 *   case Cast(child &#64; FractionalType(), StringType) =&gt;
 *     ...
 * </code></pre>
 */
// not preceding
public  class FractionalType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FractionalType$ MODULE$ = null;
  public   FractionalType$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
