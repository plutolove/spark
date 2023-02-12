package org.apache.spark.sql.execution.datasources.orc;
/**
 * Create ORC filter as a SearchArgument instance.
 */
// not preceding
public  class OrcFilters$ implements org.apache.spark.sql.execution.datasources.orc.OrcFiltersBase {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcFilters$ MODULE$ = null;
  public  org.apache.spark.sql.execution.datasources.orc.OrcFiltersBase.OrcPrimitiveField$ OrcPrimitiveField ()  { throw new RuntimeException(); }
  public   OrcFilters$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.hadoop.hive.ql.io.sarg.SearchArgument> createFilter (org.apache.spark.sql.types.StructType schema, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.sources.Filter> convertibleFilters (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.orc.OrcFiltersBase.OrcPrimitiveField> dataTypeMap, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
  /**
   * Get PredicateLeafType which is corresponding to the given DataType.
   * @param dataType (undocumented)
   * @return (undocumented)
   */
    org.apache.hadoop.hive.ql.io.sarg.PredicateLeaf.Type getPredicateLeafType (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
}
