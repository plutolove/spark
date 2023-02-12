package org.apache.spark.sql.hive.client;
 abstract class HiveVersionSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   HiveVersionSuite (java.lang.String version)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.hive.client.HiveClient buildClient (org.apache.hadoop.conf.Configuration hadoopConf, boolean sharesHadoopClasses)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.hive.client.HiveClient client ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  public  java.lang.String suiteName ()  { throw new RuntimeException(); }
  protected  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  { throw new RuntimeException(); }
}
