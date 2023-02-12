package org.apache.spark.sql.execution.datasources.orc;
public abstract class OrcPartitionDiscoveryTest extends org.apache.spark.sql.execution.datasources.orc.OrcTest {
  // not preceding
  public   OrcPartitionDiscoveryTest ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String defaultPartitionName ()  { throw new RuntimeException(); }
  protected  java.io.File makePartitionDir (java.io.File basePath, java.lang.String defaultPartitionName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> partitionCols)  { throw new RuntimeException(); }
  protected  void withTempTable (java.lang.String tableName, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
