package org.apache.spark.sql.execution.datasources.orc;
public abstract class OrcSuite extends org.apache.spark.sql.execution.datasources.orc.OrcTest implements org.scalatest.BeforeAndAfterAll {
  // not preceding
  public   OrcSuite ()  { throw new RuntimeException(); }
  protected  void beforeAll ()  { throw new RuntimeException(); }
  public  java.io.File orcTableAsDir ()  { throw new RuntimeException(); }
  // not preceding
  public  java.io.File orcTableDir ()  { throw new RuntimeException(); }
  protected  void testBloomFilterCreation (org.apache.orc.OrcProto.Stream.Kind bloomFilterKind)  { throw new RuntimeException(); }
  protected  void testMergeSchemasInParallel (boolean ignoreCorruptFiles, scala.Function3<scala.collection.Seq<org.apache.hadoop.fs.FileStatus>, org.apache.hadoop.conf.Configuration, java.lang.Object, scala.collection.Seq<org.apache.spark.sql.types.StructType>> schemaReader)  { throw new RuntimeException(); }
  protected  void testMergeSchemasInParallel (scala.Function3<scala.collection.Seq<org.apache.hadoop.fs.FileStatus>, org.apache.hadoop.conf.Configuration, java.lang.Object, scala.collection.Seq<org.apache.spark.sql.types.StructType>> schemaReader)  { throw new RuntimeException(); }
  protected  void testSelectiveDictionaryEncoding (boolean isSelective, boolean isHive23)  { throw new RuntimeException(); }
}
