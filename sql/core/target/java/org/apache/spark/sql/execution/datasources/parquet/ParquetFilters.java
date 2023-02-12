package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Holds a single primitive field information stored in the underlying parquet file.
 * <p>
 * param:  fieldNames a field name as an array of string multi-identifier in parquet file
 * param:  fieldType field type related info in parquet file
 */
public  class ParquetFilters {
  // not preceding
  public   ParquetFilters (org.apache.parquet.schema.MessageType schema, boolean pushDownDate, boolean pushDownTimestamp, boolean pushDownDecimal, boolean pushDownStartWith, int pushDownInFilterThreshold, boolean caseSensitive)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.sources.Filter> convertibleFilters (scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
  /**
   * Converts data sources filters to Parquet filter predicates.
   * @param predicate (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<org.apache.parquet.filter2.predicate.FilterPredicate> createFilter (org.apache.spark.sql.sources.Filter predicate)  { throw new RuntimeException(); }
}
