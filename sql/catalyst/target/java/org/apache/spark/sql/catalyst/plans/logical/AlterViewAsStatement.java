package org.apache.spark.sql.catalyst.plans.logical;
/**
 * ALTER VIEW ... Query command, as parsed from SQL.
 */
public  class AlterViewAsStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> viewName ()  { throw new RuntimeException(); }
  public  java.lang.String originalText ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query ()  { throw new RuntimeException(); }
  // not preceding
  public   AlterViewAsStatement (scala.collection.Seq<java.lang.String> viewName, java.lang.String originalText, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan query)  { throw new RuntimeException(); }
}
