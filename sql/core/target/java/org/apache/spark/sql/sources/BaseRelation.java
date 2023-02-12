package org.apache.spark.sql.sources;
/**
 * Returns an estimated size of this relation in bytes. This information is used by the planner
 * to decide when it is safe to broadcast a relation and can be overridden by sources that
 * know the size ahead of time. By default, the system will assume that tables are too
 * large to broadcast. This method will be called multiple times during query planning
 * and thus should not perform expensive operations for each invocation.
 * <p>
 * @note It is always better to overestimate size than underestimate, because underestimation
 * could lead to execution plans that are suboptimal (i.e. broadcasting a very large table).
 * <p>
 * @since 1.3.0
 */
public abstract class BaseRelation {
  // not preceding
  public   BaseRelation ()  { throw new RuntimeException(); }
  /**
   * Whether does it need to convert the objects in Row to internal representation, for example:
   *  java.lang.String to UTF8String
   *  java.lang.Decimal to Decimal
   * <p>
   * If <code>needConversion</code> is <code>false</code>, buildScan() should return an <code>RDD</code> of <code>InternalRow</code>
   * <p>
   * @note The internal representation is not stable across releases and thus data sources outside
   * of Spark SQL should leave this as true.
   * <p>
   * @since 1.4.0
   * @return (undocumented)
   */
  public  boolean needConversion ()  { throw new RuntimeException(); }
  public abstract  org.apache.spark.sql.types.StructType schema ()  ;
  /**
   * Returns an estimated size of this relation in bytes. This information is used by the planner
   * to decide when it is safe to broadcast a relation and can be overridden by sources that
   * know the size ahead of time. By default, the system will assume that tables are too
   * large to broadcast. This method will be called multiple times during query planning
   * and thus should not perform expensive operations for each invocation.
   * <p>
   * @note It is always better to overestimate size than underestimate, because underestimation
   * could lead to execution plans that are suboptimal (i.e. broadcasting a very large table).
   * <p>
   * @since 1.3.0
   * @return (undocumented)
   */
  public  long sizeInBytes ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.SQLContext sqlContext ()  ;
  /**
   * Returns the list of {@link Filter}s that this datasource may not be able to handle.
   * These returned {@link Filter}s will be evaluated by Spark SQL after data is output by a scan.
   * By default, this function will return all filters, as it is always safe to
   * double evaluate a {@link Filter}. However, specific implementations can override this function to
   * avoid double filtering when they are capable of processing a filter internally.
   * <p>
   * @since 1.6.0
   * @param filters (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.Filter[] unhandledFilters (org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
}
