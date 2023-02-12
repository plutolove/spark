package org.apache.spark.sql.execution.aggregate;
/**
 * Generates a method that returns true if the group-by keys exist at a given index in the
 * associated {@link org.apache.spark.sql.catalyst.expressions.RowBasedKeyValueBatch}.
 * <p>
 */
public  class RowBasedHashMapGenerator extends org.apache.spark.sql.execution.aggregate.HashMapGenerator {
  // not preceding
  public   RowBasedHashMapGenerator (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, java.lang.String generatedClassName, org.apache.spark.sql.types.StructType groupingKeySchema, org.apache.spark.sql.types.StructType bufferSchema, int bitMaxCapacity)  { throw new RuntimeException(); }
  /**
   * Generates a method that returns true if the group-by keys exist at a given index in the
   * associated {@link org.apache.spark.sql.catalyst.expressions.RowBasedKeyValueBatch}.
   * <p>
   * @return (undocumented)
   */
  protected  java.lang.String generateEquals ()  { throw new RuntimeException(); }
  /**
   * Generates a method that returns a
   * {@link org.apache.spark.sql.catalyst.expressions.UnsafeRow} which keeps track of the
   * aggregate value(s) for a given set of keys. If the corresponding row doesn't exist, the
   * generated method adds the corresponding row in the associated
   * {@link org.apache.spark.sql.catalyst.expressions.RowBasedKeyValueBatch}.
   * <p>
   * @return (undocumented)
   */
  protected  java.lang.String generateFindOrInsert ()  { throw new RuntimeException(); }
  protected  java.lang.String generateRowIterator ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String initializeAggregateHashMap ()  { throw new RuntimeException(); }
}
