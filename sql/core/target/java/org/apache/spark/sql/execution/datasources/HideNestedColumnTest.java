package org.apache.spark.sql.execution.datasources;
/**
 * Hide a nested column.
 */
public  interface HideNestedColumnTest extends org.apache.spark.sql.execution.datasources.ReadSchemaTest {
  public  void testHide (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df1, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df2, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df3, scala.collection.Seq<org.apache.spark.sql.Row> expectedRows)  ;
}
