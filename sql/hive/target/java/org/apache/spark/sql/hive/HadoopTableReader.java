package org.apache.spark.sql.hive;
/**
 * Creates a Hadoop RDD to read data from the target table's data directory. Returns a transformed
 * RDD that contains deserialized rows.
 * <p>
 * param:  hiveTable Hive metadata for the table being scanned.
 * param:  deserializerClass Class of the SerDe used to deserialize Writables read from Hadoop.
 * param:  filterOpt If defined, then the filter is used to reject files contained in the data
 *                  directory being read. If None, then all files are accepted.
 */
  class HadoopTableReader implements org.apache.spark.sql.hive.TableReader, org.apache.spark.sql.catalyst.analysis.CastSupport, org.apache.spark.internal.Logging {
  // not preceding
  static public  void initializeLocalJobConfFunc (java.lang.String path, org.apache.hadoop.hive.ql.plan.TableDesc tableDesc, org.apache.hadoop.mapred.JobConf jobConf)  { throw new RuntimeException(); }
  /**
   * Builds specific unwrappers ahead of time according to object inspector
   * types to avoid pattern matching and branching costs per row.
   * @param iterator (undocumented)
   * @param rawDeser (undocumented)
   * @param nonPartitionKeyAttrs (undocumented)
   * @param mutableRow (undocumented)
   * @param tableDeser (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> fillObject (scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator, org.apache.hadoop.hive.serde2.Deserializer rawDeser, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, java.lang.Object>> nonPartitionKeyAttrs, org.apache.spark.sql.catalyst.InternalRow mutableRow, org.apache.hadoop.hive.serde2.Deserializer tableDeser)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType javaTypeToDataType (java.lang.reflect.Type clz)  { throw new RuntimeException(); }
  static protected  scala.Function1<java.lang.Object, java.lang.Object> wrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  scala.Function1<java.lang.Object, java.lang.Object> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector objectInspector)  { throw new RuntimeException(); }
  static public  scala.Function3<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, scala.runtime.BoxedUnit> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.StructField field)  { throw new RuntimeException(); }
  static public  java.lang.Object wrap (Object a, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (org.apache.spark.sql.catalyst.InternalRow row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  java.lang.Object[] wrap (scala.collection.Seq<java.lang.Object> row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.DataType inspectorToDataType (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector inspector)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.hive.HiveInspectors.typeInfoConversions typeInfoConversions (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
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
  // not preceding
  public   HadoopTableReader (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionKeys, org.apache.hadoop.hive.ql.plan.TableDesc tableDesc, org.apache.spark.sql.SparkSession sparkSession, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForTable (org.apache.hadoop.hive.ql.metadata.Table hiveTable)  { throw new RuntimeException(); }
  /**
   * Creates a Hadoop RDD to read data from the target table's data directory. Returns a transformed
   * RDD that contains deserialized rows.
   * <p>
   * @param hiveTable Hive metadata for the table being scanned.
   * @param deserializerClass Class of the SerDe used to deserialize Writables read from Hadoop.
   * @param filterOpt If defined, then the filter is used to reject files contained in the data
   *                  directory being read. If None, then all files are accepted.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForTable (org.apache.hadoop.hive.ql.metadata.Table hiveTable, java.lang.Class<? extends org.apache.hadoop.hive.serde2.Deserializer> deserializerClass, scala.Option<org.apache.hadoop.fs.PathFilter> filterOpt)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForPartitionedTable (scala.collection.Seq<org.apache.hadoop.hive.ql.metadata.Partition> partitions)  { throw new RuntimeException(); }
  /**
   * Create a HadoopRDD for every partition key specified in the query. Note that for on-disk Hive
   * tables, a data directory is created for each partition corresponding to keys specified using
   * 'PARTITION BY'.
   * <p>
   * @param partitionToDeserializer Mapping from a Hive Partition metadata object to the SerDe
   *     class to use to deserialize input Writables from the corresponding partition.
   * @param filterOpt If defined, then the filter is used to reject files contained in the data
   *     subdirectory of each partition being read. If None, then all files are accepted.
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> makeRDDForPartitionedTable (scala.collection.immutable.Map<org.apache.hadoop.hive.ql.metadata.Partition, java.lang.Class<? extends org.apache.hadoop.hive.serde2.Deserializer>> partitionToDeserializer, scala.Option<org.apache.hadoop.fs.PathFilter> filterOpt)  { throw new RuntimeException(); }
}
