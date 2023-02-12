package org.apache.spark.sql.execution.columnar;
// not preceding
public  class ColumnarTestUtils {
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.GenericInternalRow makeNullRow (int length)  { throw new RuntimeException(); }
  static public <JvmType extends java.lang.Object> JvmType makeRandomValue (org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> makeRandomValues (org.apache.spark.sql.execution.columnar.ColumnType<?> head, scala.collection.Seq<org.apache.spark.sql.execution.columnar.ColumnType<?>> tail)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.Object> makeRandomValues (scala.collection.Seq<org.apache.spark.sql.execution.columnar.ColumnType<?>> columnTypes)  { throw new RuntimeException(); }
  static public <JvmType extends java.lang.Object> scala.collection.Seq<JvmType> makeUniqueRandomValues (org.apache.spark.sql.execution.columnar.ColumnType<JvmType> columnType, int count)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow makeRandomRow (org.apache.spark.sql.execution.columnar.ColumnType<?> head, scala.collection.Seq<org.apache.spark.sql.execution.columnar.ColumnType<?>> tail)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.InternalRow makeRandomRow (scala.collection.Seq<org.apache.spark.sql.execution.columnar.ColumnType<?>> columnTypes)  { throw new RuntimeException(); }
  static public <T extends org.apache.spark.sql.types.AtomicType> scala.Tuple2<scala.collection.Seq<java.lang.Object>, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.GenericInternalRow>> makeUniqueValuesAndSingleValueRows (org.apache.spark.sql.execution.columnar.NativeColumnType<T> columnType, int count)  { throw new RuntimeException(); }
}
