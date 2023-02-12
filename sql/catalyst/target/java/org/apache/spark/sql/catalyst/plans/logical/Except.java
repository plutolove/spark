package org.apache.spark.sql.catalyst.plans.logical;
/** We don't use right.output because those rows get excluded from the set. */
public  class Except extends org.apache.spark.sql.catalyst.plans.logical.SetOperation implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right ()  { throw new RuntimeException(); }
  public  boolean isAll ()  { throw new RuntimeException(); }
  // not preceding
  public   Except (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right, boolean isAll)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  /** We don't use right.output because those rows get excluded from the set. */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.expressions.Expression> validConstraints ()  { throw new RuntimeException(); }
}
