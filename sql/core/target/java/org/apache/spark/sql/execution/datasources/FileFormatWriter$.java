package org.apache.spark.sql.execution.datasources;
/** Describes how output files should be placed in the filesystem. */
// not preceding
public  class FileFormatWriter$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileFormatWriter$ MODULE$ = null;
  public   FileFormatWriter$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Set<java.lang.String> write (org.apache.spark.sql.SparkSession sparkSession, org.apache.spark.sql.execution.SparkPlan plan, org.apache.spark.sql.execution.datasources.FileFormat fileFormat, org.apache.spark.internal.io.FileCommitProtocol committer, org.apache.spark.sql.execution.datasources.FileFormatWriter.OutputSpec outputSpec, org.apache.hadoop.conf.Configuration hadoopConf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> partitionColumns, scala.Option<org.apache.spark.sql.catalyst.catalog.BucketSpec> bucketSpec, scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteJobStatsTracker> statsTrackers, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * For every registered {@link WriteJobStatsTracker}, call <code>processStats()</code> on it, passing it
   * the corresponding {@link WriteTaskStats} from all executors.
   * @param statsTrackers (undocumented)
   * @param statsPerTask (undocumented)
   */
    void processStats (scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteJobStatsTracker> statsTrackers, scala.collection.Seq<scala.collection.Seq<org.apache.spark.sql.execution.datasources.WriteTaskStats>> statsPerTask)  { throw new RuntimeException(); }
}
