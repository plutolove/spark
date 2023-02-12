package org.apache.spark.sql.execution.datasources.parquet;
/**
 * Called on executor side before {@link prepareForRead()} and instantiating actual Parquet record
 * readers.  Responsible for figuring out Parquet requested schema used for column pruning.
 */
public  class ParquetReadSupport extends org.apache.parquet.hadoop.api.ReadSupport<org.apache.spark.sql.catalyst.InternalRow> implements org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String SPARK_ROW_REQUESTED_SCHEMA ()  { throw new RuntimeException(); }
  static public  java.lang.String SPARK_METADATA_KEY ()  { throw new RuntimeException(); }
  /**
   * Tailors <code>parquetSchema</code> according to <code>catalystSchema</code> by removing column paths don't exist
   * in <code>catalystSchema</code>, and adding those only exist in <code>catalystSchema</code>.
   * @param parquetSchema (undocumented)
   * @param catalystSchema (undocumented)
   * @param caseSensitive (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.parquet.schema.MessageType clipParquetSchema (org.apache.parquet.schema.MessageType parquetSchema, org.apache.spark.sql.types.StructType catalystSchema, boolean caseSensitive)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType expandUDT (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  scala.Option<java.time.ZoneId> convertTz ()  { throw new RuntimeException(); }
  // not preceding
  public   ParquetReadSupport (scala.Option<java.time.ZoneId> convertTz, boolean enableVectorizedReader, scala.Enumeration.Value datetimeRebaseMode)  { throw new RuntimeException(); }
  public   ParquetReadSupport ()  { throw new RuntimeException(); }
  /**
   * Called on executor side before {@link prepareForRead()} and instantiating actual Parquet record
   * readers.  Responsible for figuring out Parquet requested schema used for column pruning.
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.hadoop.api.ReadSupport.ReadContext init (org.apache.parquet.hadoop.api.InitContext context)  { throw new RuntimeException(); }
  /**
   * Called on executor side after {@link init()}, before instantiating actual Parquet record readers.
   * Responsible for instantiating {@link RecordMaterializer}, which is used for converting Parquet
   * records to Catalyst {@link InternalRow}s.
   * @param conf (undocumented)
   * @param keyValueMetaData (undocumented)
   * @param fileSchema (undocumented)
   * @param readContext (undocumented)
   * @return (undocumented)
   */
  public  org.apache.parquet.io.api.RecordMaterializer<org.apache.spark.sql.catalyst.InternalRow> prepareForRead (org.apache.hadoop.conf.Configuration conf, java.util.Map<java.lang.String, java.lang.String> keyValueMetaData, org.apache.parquet.schema.MessageType fileSchema, org.apache.parquet.hadoop.api.ReadSupport.ReadContext readContext)  { throw new RuntimeException(); }
}
