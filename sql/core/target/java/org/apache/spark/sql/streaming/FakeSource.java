package org.apache.spark.sql.streaming;
/** Verify whether the local limit in the plan is a streaming limit or is a simple */
public abstract class FakeSource implements org.apache.spark.sql.sources.StreamSourceProvider {
  // not preceding
  public   FakeSource ()  { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext spark, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
