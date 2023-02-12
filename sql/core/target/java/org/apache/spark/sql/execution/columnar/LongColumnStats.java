package org.apache.spark.sql.execution.columnar;
 final class LongColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   LongColumnStats ()  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  void gatherValueStats (long value)  { throw new RuntimeException(); }
  protected  long lower ()  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
  // not preceding
  protected  long upper ()  { throw new RuntimeException(); }
}
