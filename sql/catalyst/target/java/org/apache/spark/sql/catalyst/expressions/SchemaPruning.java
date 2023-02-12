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
public  class SchemaPruning {
  /**
   * This represents a "root" schema field (aka top-level, no-parent). <code>field</code> is the
   * <code>StructField</code> for field name and datatype. <code>derivedFromAtt</code> indicates whether it
   * was derived from an attribute or had a proper child. <code>prunedIfAnyChildAccessed</code> means
   * whether this root field can be pruned if any of child field is used in the query.
   */
  static public  class RootField implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.types.StructField field ()  { throw new RuntimeException(); }
    public  boolean derivedFromAtt ()  { throw new RuntimeException(); }
    public  boolean prunedIfAnyChildAccessed ()  { throw new RuntimeException(); }
    // not preceding
    public   RootField (org.apache.spark.sql.types.StructField field, boolean derivedFromAtt, boolean prunedIfAnyChildAccessed)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class RootField$ extends scala.runtime.AbstractFunction3<org.apache.spark.sql.types.StructField, java.lang.Object, java.lang.Object, org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RootField$ MODULE$ = null;
    public   RootField$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.sql.types.StructType pruneDataSchema (org.apache.spark.sql.types.StructType dataSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> requestedRootFields)  { throw new RuntimeException(); }
  /**
   * Returns the set of fields from projection and filtering predicates that the query plan needs.
   * @param projects (undocumented)
   * @param filters (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SchemaPruning.RootField> identifyRootFields (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> projects, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> filters)  { throw new RuntimeException(); }
}