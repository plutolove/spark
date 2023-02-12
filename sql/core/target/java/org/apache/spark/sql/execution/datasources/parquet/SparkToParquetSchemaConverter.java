package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Converts a Spark SQL {@link StructType} to a Parquet {@link MessageType}.
 */
public  class SparkToParquetSchemaConverter {
  // not preceding
  public   SparkToParquetSchemaConverter (boolean writeLegacyParquetFormat, scala.Enumeration.Value outputTimestampType)  { throw new RuntimeException(); }
  // not preceding
  public   SparkToParquetSchemaConverter (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   SparkToParquetSchemaConverter (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL {@link StructType} to a Parquet {@link MessageType}.
   * @param catalystSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.MessageType convert (org.apache.spark.sql.types.StructType catalystSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Spark SQL {@link StructField} to a Parquet {@link Type}.
   * @param field (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.schema.Type convertField (org.apache.spark.sql.types.StructField field)  { throw new RuntimeException(); }
}
