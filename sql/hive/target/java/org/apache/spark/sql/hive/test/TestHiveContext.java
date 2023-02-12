package org.apache.spark.sql.hive.test;
/**
 * If loadTestTables is false, no test tables are loaded. Note that this flag can only be true
 * when running in the JVM, i.e. it needs to be false when calling from Python.
 */
public  class TestHiveContext extends org.apache.spark.sql.SQLContext {
  /**
   * A map used to store all confs that need to be overridden in sql/hive unit tests.
   * @return (undocumented)
   */
  static public  scala.collection.immutable.Map<java.lang.String, java.lang.String> overrideConfs ()  { throw new RuntimeException(); }
  static public  java.io.File makeWarehouseDir ()  { throw new RuntimeException(); }
  static public  java.io.File makeScratchDir ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.hive.test.TestHiveSparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
  public   TestHiveContext (org.apache.spark.sql.hive.test.TestHiveSparkSession sparkSession)  { throw new RuntimeException(); }
  // not preceding
  public   TestHiveContext (org.apache.spark.SparkContext sc, boolean loadTestTables)  { throw new RuntimeException(); }
  public   TestHiveContext (org.apache.spark.SparkContext sc, org.apache.spark.sql.hive.client.HiveClient hiveClient)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.hive.test.TestHiveContext newSession ()  { throw new RuntimeException(); }
  public  void setCacheTables (boolean c)  { throw new RuntimeException(); }
  public  java.io.File getHiveFile (java.lang.String path)  { throw new RuntimeException(); }
  public  void loadTestTable (java.lang.String name)  { throw new RuntimeException(); }
  public  void reset ()  { throw new RuntimeException(); }
}
