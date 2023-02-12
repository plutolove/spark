package org.apache.spark.sql.execution.datasources;
/**
 * Whether or not paths should be globbed before being used to access files.
 */
public  class DataSource implements org.apache.spark.internal.Logging, scala.Product, scala.Serializable {
  // not preceding
  public  class SourceInfo implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
    // not preceding
    public   SourceInfo (java.lang.String name, org.apache.spark.sql.types.StructType schema, scala.collection.Seq<java.lang.String> partitionColumns)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class SourceInfo$ extends scala.runtime.AbstractFunction3<java.lang.String, org.apache.spark.sql.types.StructType, scala.collection.Seq<java.lang.String>, org.apache.spark.sql.execution.datasources.DataSource.SourceInfo> implements scala.Serializable {
    public   SourceInfo$ ()  { throw new RuntimeException(); }
  }
  /** Given a provider name, look up the data source class definition. */
  static public  java.lang.Class<?> lookupDataSource (java.lang.String provider, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * Returns an optional {@link TableProvider} instance for the given provider. It returns None if
   * there is no corresponding Data Source V2 implementation, or the provider is configured to
   * fallback to Data Source V1 code path.
   * @param provider (undocumented)
   * @param conf (undocumented)
   * @return (undocumented)
   */
  static public  scala.Option<org.apache.spark.sql.connector.catalog.TableProvider> lookupDataSourceV2 (java.lang.String provider, org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  /**
   * The key in the "options" map for deciding whether or not to glob paths before use.
   * @return (undocumented)
   */
  static public  java.lang.String GLOB_PATHS_KEY ()  { throw new RuntimeException(); }
  /**
   * Checks and returns files in all the paths.
   * @param paths (undocumented)
   * @param hadoopConf (undocumented)
   * @param checkEmptyGlobPath (undocumented)
   * @param checkFilesExist (undocumented)
   * @param enableGlobbing (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.Seq<org.apache.hadoop.fs.Path> checkAndGlobPathIfNecessary (scala.collection.Seq<java.lang.String> paths, org.apache.hadoop.conf.Configuration hadoopConf, boolean checkEmptyGlobPath, boolean checkFilesExist, boolean enableGlobbing)  { throw new RuntimeException(); }
  /**
   * When creating a data source table, the <code>path</code> option has a special meaning: the table location.
   * This method extracts the <code>path</code> option and treat it as table location to build a
   * {@link CatalogStorageFormat}. Note that, the <code>path</code> option is removed from options after this.
   * @param options (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.catalyst.catalog.CatalogStorageFormat buildStorageFormatFromOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Called before writing into a FileFormat based data source to make sure the
   * supplied schema is not empty.
   * @param schema
   */
  static public  void validateSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  public  java.lang.String className ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> paths ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> partitionColumns ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> catalogTable ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSource (org.apache.spark.sql.SparkSession sparkSession, java.lang.String className, scala.collection.Seq<java.lang.String> paths, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, scala.collection.Seq<java.lang.String> partitionColumns, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, scala.collection.immutable.Map<java.lang.String, java.lang.String> options, scala.Option<org.apache.spark.sql.catalyst.catalog.CatalogTable> catalogTable)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.Class<?> providingClass ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.datasources.DataSource.SourceInfo sourceInfo ()  { throw new RuntimeException(); }
  /**
   * Whether or not paths should be globbed before being used to access files.
   * @return (undocumented)
   */
  public  boolean globPaths ()  { throw new RuntimeException(); }
  /** Returns a source that can be used to continually read data. */
  public  org.apache.spark.sql.execution.streaming.Source createSource (java.lang.String metadataPath)  { throw new RuntimeException(); }
  /** Returns a sink that can be used to continually write data. */
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /**
   * Create a resolved {@link BaseRelation} that can be used to read data from or write data into this
   * {@link DataSource}
   * <p>
   * @param checkFilesExist Whether to confirm that the files exist when generating the
   *                        non-streaming file based datasource. StructuredStreaming jobs already
   *                        list file existence, and when generating incremental jobs, the batch
   *                        is considered as a non-streaming file based data source. Since we know
   *                        that files already exist, we don't need to check them again.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.BaseRelation resolveRelation (boolean checkFilesExist)  { throw new RuntimeException(); }
  /**
   * Writes the given {@link LogicalPlan} out to this {@link DataSource} and returns a {@link BaseRelation} for
   * the following reading.
   * <p>
   * @param mode The save mode for this writing.
   * @param data The input query plan that produces the data to be written. Note that this plan
   *             is analyzed and optimized.
   * @param outputColumnNames The original output column names of the input query plan. The
   *                          optimizer may not preserve the output column's names' case, so we need
   *                          this parameter instead of <code>data.output</code>.
   * @param physicalPlan The physical plan of the input query plan. We should run the writing
   *                     command with this physical plan instead of creating a new physical plan,
   *                     so that the metrics can be correctly linked to the given physical plan and
   *                     shown in the web UI.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.sources.BaseRelation writeAndRead (org.apache.spark.sql.SaveMode mode, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan data, scala.collection.Seq<java.lang.String> outputColumnNames, org.apache.spark.sql.execution.SparkPlan physicalPlan)  { throw new RuntimeException(); }
  /**
   * Returns a logical plan to write the given {@link LogicalPlan} out to this {@link DataSource}.
   * @param mode (undocumented)
   * @param data (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan planForWriting (org.apache.spark.sql.SaveMode mode, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan data)  { throw new RuntimeException(); }
}
