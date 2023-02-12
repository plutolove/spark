package org.apache.spark.sql.hive.test;
/**
 * This is a temporary hack to override SparkSession.sql so we can still use the version of
 * Dataset.ofRows that creates a TestHiveQueryExecution (rather than a normal QueryExecution
 * which wouldn't load all the test tables).
 */
  class TestHiveSparkSession extends org.apache.spark.sql.SparkSession implements org.apache.spark.internal.Logging {
  public  class TestTable implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands ()  { throw new RuntimeException(); }
    // not preceding
    public   TestTable (java.lang.String name, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>> commands)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class TestTable$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.Seq<scala.Function0<scala.runtime.BoxedUnit>>, org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestTable$ MODULE$ = null;
    public   TestTable$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  protected  class SqlCmd {
    // not preceding
    public   SqlCmd (java.lang.String sql)  { throw new RuntimeException(); }
    // not preceding
    public  scala.Function0<scala.runtime.BoxedUnit> cmd ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   TestHiveSparkSession (org.apache.spark.SparkContext sc, scala.Option<org.apache.spark.sql.hive.test.TestHiveSharedState> existingSharedState, scala.Option<org.apache.spark.sql.internal.SessionState> parentSessionState, boolean loadTestTables)  { throw new RuntimeException(); }
  // not preceding
  public   TestHiveSparkSession (org.apache.spark.SparkContext sc, boolean loadTestTables)  { throw new RuntimeException(); }
  public   TestHiveSparkSession (org.apache.spark.SparkContext sc, org.apache.spark.sql.hive.client.HiveClient hiveClient, boolean loadTestTables)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.SparkSession cloneSession ()  { throw new RuntimeException(); }
  public  scala.util.matching.Regex describedTable ()  { throw new RuntimeException(); }
  public  java.io.File getHiveFile (java.lang.String path)  { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> getLoadedTables ()  { throw new RuntimeException(); }
  public  java.lang.String getWarehousePath ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.io.File> hiveDevHome ()  { throw new RuntimeException(); }
  public  java.io.File hiveFilesTemp ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.io.File> hiveHome ()  { throw new RuntimeException(); }
  public  void loadTestTable (java.lang.String name)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.hive.client.HiveClient metadataHive ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.test.TestHiveSparkSession newSession ()  { throw new RuntimeException(); }
  /**
   * Records the UDFs present when the server starts, so we can delete ones that are created by
   * tests.
   * @return (undocumented)
   */
  protected  java.util.Set<java.lang.String> originalUDFs ()  { throw new RuntimeException(); }
  public  void registerTestTable (org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable testTable)  { throw new RuntimeException(); }
  /**
   * Resets the test instance by deleting any table, view, temp view, and UDF that have been created
   */
  public  void reset ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
  public  void setCacheTables (boolean c)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.hive.test.TestHiveSharedState sharedState ()  { throw new RuntimeException(); }
  /**
   * This is a temporary hack to override SparkSession.sql so we can still use the version of
   * Dataset.ofRows that creates a TestHiveQueryExecution (rather than a normal QueryExecution
   * which wouldn't load all the test tables).
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sql (java.lang.String sqlText)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.sql.hive.test.TestHiveSparkSession.TestTable> testTables ()  { throw new RuntimeException(); }
}
