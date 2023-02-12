package org.apache.spark.sql.execution.datasources;
/** Describes how output files should be placed in the filesystem. */
// not preceding
public  class FileFormatWriter {
  // not preceding
  static public  class OutputSpec implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String outputPath ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String> customPartitionLocations ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputColumns ()  { throw new RuntimeException(); }
    // not preceding
    public   OutputSpec (java.lang.String outputPath, scala.collection.immutable.Map<scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String> customPartitionLocations, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> outputColumns)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class OutputSpec$ extends scala.runtime.AbstractFunction3<java.lang.String, scala.collection.immutable.Map<scala.collection.immutable.Map<java.lang.String, java.lang.String>, java.lang.String>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.execution.datasources.FileFormatWriter.OutputSpec> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final OutputSpec$ MODULE$ = null;
    public   OutputSpec$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Empty2Null extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.String2StringExpression, scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.Expression child ()  { throw new RuntimeException(); }
    // not preceding
    public   Empty2Null (org.apache.spark.sql.catalyst.expressions.Expression child)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.unsafe.types.UTF8String convert (org.apache.spark.unsafe.types.UTF8String v)  { throw new RuntimeException(); }
    public  boolean nullable ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode doGenCode (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Empty2Null$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.execution.datasources.FileFormatWriter.Empty2Null> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Empty2Null$ MODULE$ = null;
    public   Empty2Null$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.collection.immutable.Set<java.lang.String> write (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.SparkPlan plan, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, org.apache.spark.internal.io.FileCommitProtocol committer, org.apache.spark.sql.execution.datasources.FileFormatWriter.OutputSpec outputSpec, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionColumns, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteJobStatsTracker> statsTrackers, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * For every registered {@link WriteJobStatsTracker}, call <code>processStats()</code> on it, passing it
   * the corresponding {@link WriteTaskStats} from all executors.
   * @param statsTrackers (undocumented)
   * @param statsPerTask (undocumented)
   */
  static   void processStats (scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteJobStatsTracker> statsTrackers, scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats>> statsPerTask)  { throw new RuntimeException(); }
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
}
