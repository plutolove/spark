package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Updater used together with field converters within a {@link ParquetRowConverter}.  It propagates
 * converted filed values to the <code>ordinal</code>-th cell in <code>currentRow</code>.
 */
  class ParquetRowConverter extends org.apache.spark.sql.execution.datasources.parquet.ParquetGroupConverter implements org.apache.spark.internal.Logging {
  // not preceding
  public  interface RepeatedConverter {
    public  java.lang.Object newArrayUpdater (org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  ;
  }
  // not preceding
  static public  long binaryToUnscaledLong (org.apache.parquet.io.api.Binary binary)  { throw new RuntimeException(); }
  static public  long binaryToSQLTimestamp (org.apache.parquet.io.api.Binary binary)  { throw new RuntimeException(); }
  // not preceding
  public   ParquetRowConverter (org.apache.spark.sql.execution.datasources.parquet.ParquetToSparkSchemaConverter schemaConverter, org.apache.parquet.schema.GroupType parquetType, org.apache.spark.sql.types.StructType catalystType, scala.Option<java.time.ZoneId> convertTz, scala.Enumeration.Value datetimeRebaseMode, org.apache.spark.sql.execution.datasources.parquet.ParentContainerUpdater updater)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.InternalRow currentRecord ()  { throw new RuntimeException(); }
  public  org.apache.parquet.io.api.Converter getConverter (int fieldIndex)  { throw new RuntimeException(); }
  public  void end ()  { throw new RuntimeException(); }
  public  void start ()  { throw new RuntimeException(); }
}
