package org.apache.spark.sql.execution.datasources;
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
 */
// not preceding
public  class PartitioningAwareFileIndex$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PartitioningAwareFileIndex$ MODULE$ = null;
  public   PartitioningAwareFileIndex$ ()  { throw new RuntimeException(); }
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
  public  java.lang.String BASE_PATH_PARAM ()  { throw new RuntimeException(); }
}
