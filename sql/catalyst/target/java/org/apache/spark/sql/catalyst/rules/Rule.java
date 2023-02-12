package org.apache.spark.sql.catalyst.rules;
/** Name for this rule, automatically inferred based on class name. */
public abstract class Rule<TreeType extends org.apache.spark.sql.catalyst.trees.TreeNode<?>> implements org.apache.spark.internal.Logging {
  // not preceding
  public   Rule ()  { throw new RuntimeException(); }
  public abstract  TreeType apply (TreeType plan)  ;
  // not preceding
  public  java.lang.String ruleName ()  { throw new RuntimeException(); }
}
