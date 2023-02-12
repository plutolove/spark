package org.apache.spark.sql.streaming.util;
/**
 * A StreamSourceProvider that provides mocked Sources for unit testing. Example usage:
 * <p>
 * <pre><code>
 *    MockSourceProvider.withMockSources(source1, source2) {
 *      val df1 = spark.readStream
 *        .format("org.apache.spark.sql.streaming.util.MockSourceProvider")
 *        .load()
 *
 *      val df2 = spark.readStream
 *        .format("org.apache.spark.sql.streaming.util.MockSourceProvider")
 *        .load()
 *
 *      df1.union(df2)
 *      ...
 *    }
 * </code></pre>
 */
public  class MockSourceProvider implements org.apache.spark.sql.sources.StreamSourceProvider {
  static public final  org.apache.spark.sql.types.StructType fakeSchema ()  { throw new RuntimeException(); }
  static public  void withMockSources (org.apache.spark.sql.execution.streaming.Source source, scala.collection.Seq<org.apache.spark.sql.execution.streaming.Source> otherSources, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  // not preceding
  public   MockSourceProvider ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Tuple2<java.lang.String, org.apache.spark.sql.types.StructType> sourceSchema (org.apache.spark.sql.SQLContext spark, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.Source createSource (org.apache.spark.sql.SQLContext spark, java.lang.String metadataPath, scala.Option<org.apache.spark.sql.types.StructType> schema, java.lang.String providerName, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
}
