package org.apache.spark.sql.execution.datasources;
/** Close the current partition and move to the next. */
// not preceding
public  class FilePartition$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FilePartition$ MODULE$ = null;
  public   FilePartition$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> getFilePartitions (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionedFile> partitionedFiles, long maxSplitBytes)  { throw new RuntimeException(); }
  /** Close the current partition and move to the next. */
  public  long maxSplitBytes (org.apache.spark.sql.SparkSession sparkSession, scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> selectedPartitions)  { throw new RuntimeException(); }
}
