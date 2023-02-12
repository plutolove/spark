package org.apache.spark.sql.execution.columnar;
 final class ObjectColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   ObjectColumnStats (org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.columnar.ColumnType<?> columnType ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
}
