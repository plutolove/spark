package org.apache.spark.sql.execution.datasources.parquet;
/**
 * A testing Parquet {@link WriteSupport} implementation used to write manually constructed Parquet
 * records with arbitrary structures.
 */
// not preceding
public  class ParquetCompatibilityTest$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ParquetCompatibilityTest$ MODULE$ = null;
  public   ParquetCompatibilityTest$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
  /**
   * Provide a builder for constructing a parquet writer - after PARQUET-248 directly constructing
   * the writer is deprecated and should be done through a builder. The default builders include
   * Avro - but for raw Parquet writing we must create our own builder.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @param metadata (undocumented)
   * @param recordWriters (undocumented)
   */
  public  void writeDirect (java.lang.String path, java.lang.String schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata, scala.collection.Seq<scala.Function1<org.apache.parquet.io.api.RecordConsumer, scala.runtime.BoxedUnit>> recordWriters)  { throw new RuntimeException(); }
}
