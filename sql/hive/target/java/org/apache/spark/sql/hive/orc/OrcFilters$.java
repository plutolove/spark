package org.apache.spark.sql.hive.orc;
/**
 * Build a SearchArgument and return the builder so far.
 * <p>
 * param:  dataTypeMap a map from the attribute name to its data type.
 * param:  expression the input predicates, which should be fully convertible to SearchArgument.
 * param:  builder the input SearchArgument.Builder.
 * @return the builder so far.
 */
// not preceding
public  class OrcFilters$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcFilters$ MODULE$ = null;
  public   OrcFilters$ ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.hadoop.hive.ql.io.sarg.SearchArgument> createFilter (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.sources.Filter> convertibleFilters (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> dataTypeMap, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
}
