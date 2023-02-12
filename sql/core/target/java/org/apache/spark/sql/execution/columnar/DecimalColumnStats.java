package org.apache.spark.sql.execution.columnar;
 final class DecimalColumnStats implements org.apache.spark.sql.execution.columnar.ColumnStats {
  // not preceding
  public   DecimalColumnStats (int precision, int scale)  { throw new RuntimeException(); }
  // not preceding
  public   DecimalColumnStats (org.apache.spark.sql.types.DecimalType dt)  { throw new RuntimeException(); }
  public  java.lang.Object[] collectedStatistics ()  { throw new RuntimeException(); }
  // not preceding
  protected  int count ()  { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  { throw new RuntimeException(); }
  public  void gatherValueStats (org.apache.spark.sql.types.Decimal value)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Decimal lower ()  { throw new RuntimeException(); }
  // not preceding
  protected  int nullCount ()  { throw new RuntimeException(); }
  // not preceding
    long sizeInBytes ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.Decimal upper ()  { throw new RuntimeException(); }
}
