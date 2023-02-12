package org.apache.spark.sql.execution.datasources;
/**
 * Reads data source file from given <code>path</code> as <code>DataFrame</code> and passes it to given function.
 * <p>
 * param:  path           The path to file
 * param:  testVectorized Whether to read the file with vectorized reader.
 * param:  f              The given function that takes a <code>DataFrame</code> as input.
 */
public  interface FileBasedDataSourceTest extends org.apache.spark.sql.test.SQLTestUtils {
  public  java.lang.String dataSourceName ()  ;
  public <T extends scala.Product> void makeDataSourceFile (scala.collection.Seq<T> data, java.io.File path, scala.reflect.ClassTag<T> evidence$7, scala.reflect.api.TypeTags.TypeTag<T> evidence$8)  ;
  public <T extends scala.Product> void makeDataSourceFile (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.io.File path, scala.reflect.ClassTag<T> evidence$9, scala.reflect.api.TypeTags.TypeTag<T> evidence$10)  ;
  /**
   * Reads data source file from given <code>path</code> as <code>DataFrame</code> and passes it to given function.
   * <p>
   * @param path           The path to file
   * @param testVectorized Whether to read the file with vectorized reader.
   * @param f              The given function that takes a <code>DataFrame</code> as input.
   */
  public  void readFile (java.lang.String path, boolean testVectorized, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> f)  ;
  public  java.lang.String vectorizedReaderEnabledKey ()  ;
  /**
   * Writes <code>data</code> to a data source file and reads it back as a {@link DataFrame},
   * which is then passed to <code>f</code>. The file will be deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param testVectorized (undocumented)
   * @param f (undocumented)
   * @param evidence$3 (undocumented)
   * @param evidence$4 (undocumented)
   */
  public <T extends scala.Product> void withDataSourceDataFrame (scala.collection.Seq<T> data, boolean testVectorized, scala.Function1<org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$3, scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  ;
  /**
   * Writes <code>data</code> to a data source file, which is then passed to <code>f</code> and will be deleted after <code>f</code>
   * returns.
   * @param data (undocumented)
   * @param f (undocumented)
   * @param evidence$1 (undocumented)
   * @param evidence$2 (undocumented)
   */
  public <T extends scala.Product> void withDataSourceFile (scala.collection.Seq<T> data, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$1, scala.reflect.api.TypeTags.TypeTag<T> evidence$2)  ;
  /**
   * Writes <code>data</code> to a data source file, reads it back as a {@link DataFrame} and registers it as a
   * temporary table named <code>tableName</code>, then call <code>f</code>. The temporary table together with the
   * data file will be dropped/deleted after <code>f</code> returns.
   * @param data (undocumented)
   * @param tableName (undocumented)
   * @param testVectorized (undocumented)
   * @param f (undocumented)
   * @param evidence$5 (undocumented)
   * @param evidence$6 (undocumented)
   */
  public <T extends scala.Product> void withDataSourceTable (scala.collection.Seq<T> data, java.lang.String tableName, boolean testVectorized, scala.Function0<scala.runtime.BoxedUnit> f, scala.reflect.ClassTag<T> evidence$5, scala.reflect.api.TypeTags.TypeTag<T> evidence$6)  ;
}
