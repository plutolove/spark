package org.apache.spark.sql.streaming.util;
/** Set the latch that we will use to block the streaming query thread. */
public  class BlockOnStopSourceProvider implements org.apache.spark.sql.sources.StreamSourceProvider, org.apache.spark.sql.internal.connector.SimpleTableProvider {
  static public  org.apache.spark.sql.types.StructType schema ()  { throw new RuntimeException(); }
  /** Set the latch that we will use to block the streaming query thread. */
  static public  void enableBlocking ()  { throw new RuntimeException(); }
  static public  void disableBlocking ()  { throw new RuntimeException(); }
  // not preceding
  public   BlockOnStopSourceProvider ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext sqlContext, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext sqlContext, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
