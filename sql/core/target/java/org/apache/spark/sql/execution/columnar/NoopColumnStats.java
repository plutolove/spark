package org.apache.spark.sql.execution.columnar;
/**
 * A no-op ColumnStats only used for testing purposes.
 */
 final class NoopColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   NoopColumnStats ()  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  // not preceding
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
}