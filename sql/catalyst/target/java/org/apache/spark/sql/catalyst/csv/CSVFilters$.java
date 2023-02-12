package org.apache.spark.sql.catalyst.csv;
/**
 * Returns the filters currently supported by CSV datasource.
 * param:  filters The filters pushed down to CSV datasource.
 * param:  schema data schema of CSV files.
 * @return a sub-set of <code>filters</code> that can be handled by CSV datasource.
 */
// not preceding
public  class CSVFilters$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CSVFilters$ MODULE$ = null;
  public   CSVFilters$ ()  { throw new RuntimeException(); }
  /**
   * Returns the filters currently supported by CSV datasource.
   * @param filters The filters pushed down to CSV datasource.
   * @param schema data schema of CSV files.
   * @return a sub-set of <code>filters</code> that can be handled by CSV datasource.
   */
  public  org.apache.spark.sql.sources.Filter[] pushedFilters (org.apache.spark.sql.sources.Filter[] filters, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Converts a filter to an expression and binds it to row positions.
   * <p>
   * @param filter The filter to convert.
   * @param toRef The function converts a filter attribute to a bound reference.
   * @return some expression with resolved attributes or None if the conversion
   *         of the given filter to an expression is impossible.
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.Expression> filterToExpression (org.apache.spark.sql.sources.Filter filter, scala.Function1<java.lang.String, scala.Option<org.apache.spark.sql.catalyst.expressions.BoundReference>> toRef)  { throw new RuntimeException(); }
}
