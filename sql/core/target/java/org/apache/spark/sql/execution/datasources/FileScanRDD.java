package org.apache.spark.sql.execution.datasources;
/** Advances to the next file. Returns true if a new non-empty iterator is available. */
public  class FileScanRDD extends org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> {
  // not preceding
  public   FileScanRDD (org.apache.spark.sql.SparkSession sparkSession, scala.Function1<org.apache.spark.sql.execution.datasources.PartitionedFile, scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow>> readFunction, scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> filePartitions)  { throw new RuntimeException(); }
  /** Advances to the next file. Returns true if a new non-empty iterator is available. */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.FilePartition> filePartitions ()  { throw new RuntimeException(); }
  /** Advances to the next file. Returns true if a new non-empty iterator is available. */
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
}
