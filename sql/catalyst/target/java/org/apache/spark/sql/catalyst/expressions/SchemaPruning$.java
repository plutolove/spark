package org.apache.spark.sql.catalyst.expressions;
/**
 * Prunes the nested schema by the requested fields. For example, if the schema is:
 * <code>id int, s struct<a:int, b:int></code>, and given requested field "s.a", the inner field "b"
 * is pruned in the returned schema: <code>id int, s struct<a:int></code>.
 * Note that:
 *   1. The schema field ordering at original schema is still preserved in pruned schema.
 *   2. The top-level fields are not pruned here.
 */
// not preceding
public  class SchemaPruning$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SchemaPruning$ MODULE$ = null;
  public   SchemaPruning$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.types.StructType pruneDataSchema (org.apache.spark.sql.types.StructType dataSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> requestedRootFields)  { throw new RuntimeException(); }
  /**
   * Returns the set of fields from projection and filtering predicates that the query plan needs.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> identifyRootFields (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
}
