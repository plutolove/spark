package org.apache.spark.sql.execution.columnar;
/**
 * Initializes with an approximate lower bound on the expected number of elements in this column.
 */
public  interface ColumnBuilder {
  // not preceding
  public  void initialize (int initialSize, java.lang.String columnName, boolean useCompression)  ;
  /**
   * Appends <code>row(ordinal)</code> to the column builder.
   * @param row (undocumented)
   * @param ordinal (undocumented)
   */
  public  void appendFrom (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
  /**
   * Column statistics information
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.columnar.ColumnStats columnStats ()  ;
  /**
   * Returns the final columnar byte buffer.
   * @return (undocumented)
   */
  public  java.nio.ByteBuffer build ()  ;
}
