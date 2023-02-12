package org.apache.spark.sql.execution.columnar;
 final class BooleanColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   BooleanColumnStats ()  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  void gatherValueStats (boolean value)  { throw new RuntimeException(); }
  protected  boolean lower ()  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean upper ()  { throw new RuntimeException(); }
}
