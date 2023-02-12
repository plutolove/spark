package org.apache.spark.sql.execution.datasources.orc;
/**
 * Reads ORC file schemas in multi-threaded manner, using native version of ORC.
 * This is visible for testing.
 */
// not preceding
public  class OrcUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OrcUtils$ MODULE$ = null;
  public   OrcUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> extensionsForCompressionCodecNames ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> listOrcFiles (java.lang.String pathStr, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.orc.TypeDescription> readSchema (org.apache.hadoop.fs.Path file, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> readSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> readCatalystSchema (org.apache.hadoop.fs.Path file, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  /**
   * Reads ORC file schemas in multi-threaded manner, using native version of ORC.
   * This is visible for testing.
   * @param files (undocumented)
   * @param conf (undocumented)
   * @param ignoreCorruptFiles (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.types.StructType> readOrcSchemasInParallel (scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, org.apache.hadoop.conf.Configuration conf, boolean ignoreCorruptFiles)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> inferSchema (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * @return Returns the combination of requested column ids from the given ORC file and
   *         boolean flag to find if the pruneCols is allowed or not. Requested Column id can be
   *         -1, which means the requested column doesn't exist in the ORC file. Returns None
   *         if the given ORC file is empty.
   * @param isCaseSensitive (undocumented)
   * @param dataSchema (undocumented)
   * @param requiredSchema (undocumented)
   * @param reader (undocumented)
   * @param conf (undocumented)
   */
  public  scala.Option<scala.Tuple2<int[], java.lang.Object>> requestedColumnIds (boolean isCaseSensitive, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType requiredSchema, org.apache.orc.Reader reader, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
  /**
   * Add a metadata specifying Spark version.
   * @param writer (undocumented)
   */
  public  void addSparkVersionMetadata (org.apache.orc.Writer writer)  { throw new RuntimeException(); }
  /**
   * Given a <code>StructType</code> object, this methods converts it to corresponding string representation
   * in ORC.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String orcTypeDescriptionString (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * @return Returns the result schema string based on the canPruneCols flag.
   *         resultSchemaString will be created using resultsSchema in case of
   *         canPruneCols is true and for canPruneCols as false value
   *         resultSchemaString will be created using the actual dataSchema.
   * @param canPruneCols (undocumented)
   * @param dataSchema (undocumented)
   * @param resultSchema (undocumented)
   * @param partitionSchema (undocumented)
   * @param conf (undocumented)
   */
  public  java.lang.String orcResultSchemaString (boolean canPruneCols, org.apache.spark.sql.types.StructType dataSchema, org.apache.spark.sql.types.StructType resultSchema, org.apache.spark.sql.types.StructType partitionSchema, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
