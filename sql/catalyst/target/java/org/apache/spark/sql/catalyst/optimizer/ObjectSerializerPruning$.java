package org.apache.spark.sql.catalyst.optimizer;
/**
 * Visible for testing.
 * Collects all struct types from given data type object, recursively.
 */
// not preceding
public  class ObjectSerializerPruning$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ObjectSerializerPruning$ MODULE$ = null;
  public   ObjectSerializerPruning$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.types.StructType> collectStructType (org.apache.spark.sql.types.DataType dt, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.types.StructType> structs)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.NamedExpression pruneSerializer (org.apache.spark.sql.catalyst.expressions.NamedExpression serializer, org.apache.spark.sql.types.DataType prunedDataType)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
