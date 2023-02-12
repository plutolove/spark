package org.apache.spark.sql.execution.columnar;
/**
 * Gathers statistics information from <code>row(ordinal)</code>.
 */
public  interface ColumnStats extends scala.Serializable {
  /**
   * Column statistics represented as an array, currently including closed lower bound, closed
   * upper bound and null count.
   * @return (undocumented)
   */
  public  java.lang.Object[] collectedStatistics ()  ;
  public  int count ()  ;
  /**
   * Gathers statistics information on <code>null</code>.
   */
  public  void gatherNullStats ()  ;
  /**
   * Gathers statistics information from <code>row(ordinal)</code>.
   * @param row (undocumented)
   * @param ordinal (undocumented)
   */
  public  void gatherStats (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
  public  int nullCount ()  ;
    long sizeInBytes ()  ;
}
