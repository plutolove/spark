package org.apache.spark.sql.execution.columnar;
 final class ShortColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   ShortColumnStats ()  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  void gatherValueStats (short value)  { throw new RuntimeException(); }
  protected  short lower ()  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
  // not preceding
  protected  short upper ()  { throw new RuntimeException(); }
}