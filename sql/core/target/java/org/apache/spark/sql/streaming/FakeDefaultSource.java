package org.apache.spark.sql.streaming;
/** A fake StreamSourceProvider that creates a fake Source that cannot be reused. */
public  class FakeDefaultSource extends org.apache.spark.sql.streaming.FakeSource {
  // not preceding
  public   FakeDefaultSource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext spark, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
