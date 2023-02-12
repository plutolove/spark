package org.apache.spark.sql.execution.datasources;
/**
 * Add a nested column.
 */
public  interface AddNestedColumnTest extends org.apache.spark.sql.execution.datasources.ReadSchemaTest {
  public  void testAdd (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df1, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df2, scala.collection.Seq<org.apache.spark.sql.Row> expectedRows)  ;
}
