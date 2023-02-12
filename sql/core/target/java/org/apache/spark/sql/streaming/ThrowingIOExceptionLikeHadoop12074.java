package org.apache.spark.sql.streaming;
/** A fake source that throws the same IOException like pre Hadoop 2.8 when it's interrupted. */
public  class ThrowingIOExceptionLikeHadoop12074 extends org.apache.spark.sql.streaming.FakeSource {
  // not preceding
  static public  java.util.concurrent.CountDownLatch createSourceLatch ()  { throw new RuntimeException(); }
  // not preceding
  public   ThrowingIOExceptionLikeHadoop12074 ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext spark, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
