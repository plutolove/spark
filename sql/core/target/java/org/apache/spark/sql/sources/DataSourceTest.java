package org.apache.spark.sql.sources;
 abstract class DataSourceTest extends org.apache.spark.sql.QueryTest {
  // not preceding
  public   DataSourceTest ()  { throw new RuntimeException(); }
  // not preceding
  protected  void sqlTest (java.lang.String sqlString, scala.collection.Seq<org.apache.spark.sql.Row> expectedAnswer, boolean enableRegex)  { throw new RuntimeException(); }
}
