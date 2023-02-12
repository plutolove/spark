package org.apache.spark.sql.streaming.sources;
public  class FakeWriteSupportProviderV1Fallback implements org.apache.spark.sql.sources.DataSourceRegister, org.apache.spark.sql.internal.connector.SimpleTableProvider, org.apache.spark.sql.sources.StreamSinkProvider {
  // not preceding
  public   FakeWriteSupportProviderV1Fallback ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.Sink createSink (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters, scala.collection.Seq<java.lang.String> partitionColumns, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.connector.catalog.Table getTable (org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
  public  java.lang.String shortName ()  { throw new RuntimeException(); }
}
