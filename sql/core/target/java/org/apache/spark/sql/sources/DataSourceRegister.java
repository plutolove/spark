package org.apache.spark.sql.sources;
/**
 * The string that represents the format that this data source provider uses. This is
 * overridden by children to provide a nice alias for the data source. For example:
 * <p>
 * <pre><code>
 *   override def shortName(): String = "parquet"
 * </code></pre>
 * <p>
 * @since 1.5.0
 */
public  interface DataSourceRegister {
  // not preceding
  public  java.lang.String shortName ()  ;
}
