package org.apache.spark.sql.catalyst.expressions;
/**
 * Return a fresh uninitialized copy of the stateful expression.
 */
public  interface Stateful extends org.apache.spark.sql.catalyst.expressions.Nondeterministic {
  /**
   * Only the same reference is considered equal.
   * @param other (undocumented)
   * @return (undocumented)
   */
  public  boolean fastEquals (org.apache.spark.sql.catalyst.trees.TreeNode<?> other)  ;
  /**
   * Return a fresh uninitialized copy of the stateful expression.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.Stateful freshCopy ()  ;
}
