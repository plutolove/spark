package org.apache.spark.sql.execution.command;
public  interface ShowPartitionsSuiteBase extends org.apache.spark.sql.test.SQLTestUtils {
  public  java.lang.String catalog ()  ;
  public  void createDateTable (java.lang.String table)  ;
  public  void createWideTable (java.lang.String table)  ;
  public  java.lang.String defaultUsing ()  ;
  public  void runShowPartitionsSql (java.lang.String sqlText, scala.collection.Seq<org.apache.spark.sql.Row> expected)  ;
  public  void test (java.lang.String testName, scala.collection.Seq<org.scalatest.Tag> testTags, scala.Function0<java.lang.Object> testFun, org.scalactic.source.Position pos)  ;
  public  java.lang.String version ()  ;
}
