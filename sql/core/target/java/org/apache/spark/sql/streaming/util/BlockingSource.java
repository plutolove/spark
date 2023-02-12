package org.apache.spark.sql.streaming.util;
/** Dummy provider: returns a SourceProvider with a blocking `createSource` call. */
public  class BlockingSource implements org.apache.spark.sql.sources.StreamSourceProvider, org.apache.spark.sql.sources.StreamSinkProvider {
  // not preceding
  static public  java.util.concurrent.CountDownLatch latch ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockingSource ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext spark, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext spark, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.SQLContext spark, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.collection.Seq<java.lang.String> partitionColumns, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
}
