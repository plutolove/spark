package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Converts Parquet {@link MessageType} <code>parquetSchema</code> to a Spark SQL {@link StructType}.
 */
public  class ParquetToSparkSchemaConverter {
  // not preceding
  public   ParquetToSparkSchemaConverter (boolean assumeBinaryIsString, boolean assumeInt96IsTimestamp)  { throw new RuntimeException(); }
  // not preceding
  public   ParquetToSparkSchemaConverter (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public   ParquetToSparkSchemaConverter (org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Converts Parquet {@link MessageType} <code>parquetSchema</code> to a Spark SQL {@link StructType}.
   * @param parquetSchema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType convert (org.apache.parquet.schema.MessageType parquetSchema)  { throw new RuntimeException(); }
  /**
   * Converts a Parquet {@link Type} to a Spark SQL {@link DataType}.
   * @param parquetType (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.DataType convertField (org.apache.parquet.schema.Type parquetType)  { throw new RuntimeException(); }
}
