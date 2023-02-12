package org.apache.spark.sql.catalyst.csv;
/**
 * Converted filters to predicates and grouped by maximum field index
 * in the read schema. For example, if an filter refers to 2 attributes
 * attrA with field index 5 and attrB with field index 10 in the read schema:
 *   0 === $"attrA" or $"attrB" < 100
 * the filter is compiled to a predicate, and placed to the <code>predicates</code>
 * array at the position 10. In this way, if there is a row with initialized
 * fields from the 0 to 10 index, the predicate can be applied to the row
 * to check that the row should be skipped or not.
 * Multiple predicates with the same maximum reference index are combined
 * by the <code>And</code> expression.
 */
public  class CSVFilters {
  /**
   * Returns the filters currently supported by CSV datasource.
   * @param filters The filters pushed down to CSV datasource.
   * @param schema data schema of CSV files.
   * @return a sub-set of <code>filters</code> that can be handled by CSV datasource.
   */
  static public  org.apache.spark.sql.sources.Filter[] pushedFilters (org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Converts a filter to an expression and binds it to row positions.
   * <p>
   * @param filter The filter to convert.
   * @param toRef The function converts a filter attribute to a bound reference.
   * @return some expression with resolved attributes or None if the conversion
   *         of the given filter to an expression is impossible.
   */
  static public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filterToExpression (org.apache.spark.sql.sources.Filter filter, scala.Function1<java.lang.String, scala.Option<org.apache.spark.sql.catalyst.expressions.BoundReference>> toRef)  { throw new RuntimeException(); }
  // not preceding
  public   CSVFilters (scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters, org.apache.spark.sql.types.StructType requiredSchema)  { throw new RuntimeException(); }
  /**
   * Applies all filters that refer to row fields at the positions from 0 to index.
   * @param row The internal row to check.
   * @param index Maximum field index. The function assumes that all fields
   *              from 0 to index position are set.
   * @return false iff row fields at the position from 0 to index pass filters
   *         or there are no applicable filters
   *         otherwise false if at least one of the filters returns false.
   */
  public  boolean skipRow (org.apache.spark.sql.catalyst.InternalRow row, int index)  { throw new RuntimeException(); }
}
