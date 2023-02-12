package org.apache.spark.sql.execution.columnar.compression;
public  class TestCompressibleColumnBuilder<T extends org.apache.spark.sql.types.AtomicType> extends org.apache.spark.sql.execution.columnar.NativeColumnBuilder<T> implements org.apache.spark.sql.execution.columnar.NullableColumnBuilder, org.apache.spark.sql.execution.columnar.compression.CompressibleColumnBuilder<T> {
  // not preceding
  static public <T extends org.apache.spark.sql.types.AtomicType> org.apache.spark.sql.execution.columnar.compression.TestCompressibleColumnBuilder<T> apply (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType, org.apache.spark.sql.execution.columnar.compression.CompressionScheme scheme)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.ColumnStats columnStats ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes ()  { throw new RuntimeException(); }
  // not preceding
  public   TestCompressibleColumnBuilder (org.apache.spark.sql.execution.columnar.ColumnStats columnStats, org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType, scala.collection.Seq<org.apache.spark.sql.execution.columnar.compression.CompressionScheme> schemes)  { throw new RuntimeException(); }
  // not preceding
  protected  boolean isWorthCompressing (org.apache.spark.sql.execution.columnar.compression.Encoder<T> encoder)  { throw new RuntimeException(); }
}
