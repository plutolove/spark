package org.apache.spark.sql.hive.client;
/**
 * An extractor that matches all binary comparison operators except null-safe equality.
 * <p>
 * Null-safe equality is not supported by Hive metastore partition predicate pushdown
 */
  class Shim_v0_14 extends org.apache.spark.sql.hive.client.Shim_v0_13 {
  // not preceding
  public   Shim_v0_14 ()  { throw new RuntimeException(); }
  public  void dropTable (org.apache.hadoop.hive.ql.metadata.Hive hive, java.lang.String dbName, java.lang.String tableName, boolean deleteData, boolean ignoreIfNotExists, boolean purge)  { throw new RuntimeException(); }
  public  long getMetastoreClientConnectRetryDelayMillis (org.apache.hadoop.hive.conf.HiveConf conf)  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.Boolean isAcid ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.Boolean isSkewedStoreAsSubdir ()  { throw new RuntimeException(); }
  public  void loadDynamicPartitions (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, int numDP, boolean listBucketingEnabled)  { throw new RuntimeException(); }
  public  void loadPartition (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, java.util.Map<java.lang.String, java.lang.String> partSpec, boolean replace, boolean inheritTableSpecs, boolean isSkewedStoreAsSubdir, boolean isSrcLocal)  { throw new RuntimeException(); }
  public  void loadTable (org.apache.hadoop.hive.ql.metadata.Hive hive, org.apache.hadoop.fs.Path loadPath, java.lang.String tableName, boolean replace, boolean isSrcLocal)  { throw new RuntimeException(); }
}
