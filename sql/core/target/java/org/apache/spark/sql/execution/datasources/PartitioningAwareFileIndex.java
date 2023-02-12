package org.apache.spark.sql.execution.datasources;
/** Returns the specification of the partitions inferred from the data. */
public abstract class PartitioningAwareFileIndex implements org.apache.spark.sql.execution.datasources.FileIndex, org.apache.spark.internal.Logging {
  /**
   * Contains a set of paths that are considered as the base dirs of the input datasets.
   * The partitioning discovery logic will make sure it will stop when it reaches any
   * base path.
   * <p>
   * By default, the paths of the dataset provided by users will be base paths.
   * Below are three typical examples,
   * Case 1) <code>spark.read.parquet("/path/something=true/")</code>: the base path will be
   * <code>/path/something=true/</code>, and the returned DataFrame will not contain a column of <code>something</code>.
   * Case 2) <code>spark.read.parquet("/path/something=true/a.parquet")</code>: the base path will be
   * still <code>/path/something=true/</code>, and the returned DataFrame will also not contain a column of
   * <code>something</code>.
   * Case 3) <code>spark.read.parquet("/path/")</code>: the base path will be <code>/path/</code>, and the returned
   * DataFrame will have the column of <code>something</code>.
   * <p>
   * Users also can override the basePath by setting <code>basePath</code> in the options to pass the new base
   * path to the data source.
   * For example, <code>spark.read.option("basePath", "/path/").parquet("/path/something=true/")</code>,
   * and the returned DataFrame will have the column of <code>something</code>.
   * @return (undocumented)
   */
  static public  java.lang.String BASE_PATH_PARAM ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitioningAwareFileIndex (org.apache.spark.sql.SparkSession sparkSession, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.Option<org.apache.spark.sql.types.StructType> userSpecifiedSchema, org.apache.spark.sql.execution.datasources.FileStatusCache fileStatusCache)  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.execution.datasources.PartitionSpec partitionSpec ()  ;
  public  org.apache.spark.sql.types.StructType partitionSchema ()  { throw new RuntimeException(); }
  protected  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  protected abstract  scala.collection.mutable.LinkedHashMap<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus> leafFiles ()  ;
  protected abstract  scala.collection.immutable.Map<org.apache.hadoop.fs.Path, org.apache.hadoop.fs.FileStatus[]> leafDirToChildrenFiles ()  ;
  // not preceding
  protected  scala.Option<org.apache.hadoop.fs.GlobFilter> pathGlobFilter ()  { throw new RuntimeException(); }
  protected  boolean matchGlobPattern (org.apache.hadoop.fs.FileStatus file)  { throw new RuntimeException(); }
  // not preceding
  protected  boolean recursiveFileLookup ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.datasources.PartitionDirectory> listFiles (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters)  { throw new RuntimeException(); }
  /** Returns the list of files that will be read when scanning this relation. */
  public  java.lang.String[] inputFiles ()  { throw new RuntimeException(); }
  public  long sizeInBytes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> allFiles ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.execution.datasources.PartitionSpec inferPartitioning ()  { throw new RuntimeException(); }
}
