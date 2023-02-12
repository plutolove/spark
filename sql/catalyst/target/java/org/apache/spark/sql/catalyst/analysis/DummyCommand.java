package org.apache.spark.sql.catalyst.analysis;
/** A dummy command for testing unsupported operations. */
public  class DummyCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.plans.logical.Command, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public   DummyCommand ()  { throw new RuntimeException(); }
}
