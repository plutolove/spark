package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Whether it merges schemas or not. When the given Parquet files have different schemas,
 * the schemas can be merged.  By default use the value specified in SQLConf.
 */
// not preceding
public  class ParquetOptions$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetOptions$ MODULE$ = null;
  public   ParquetOptions$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String MERGE_SCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String getParquetCompressionCodecName (java.lang.String name)  { throw new RuntimeException(); }
}
