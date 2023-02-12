package org.apache.spark.sql.types;
/**
 * Enables matching against AtomicType for expressions:
 * <pre><code>
 *   case Cast(child &#64; AtomicType(), StringType) =&gt;
 *     ...
 * </code></pre>
 */
// not preceding
public  class AtomicType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AtomicType$ MODULE$ = null;
  public   AtomicType$ ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e)  { throw new RuntimeException(); }
}
