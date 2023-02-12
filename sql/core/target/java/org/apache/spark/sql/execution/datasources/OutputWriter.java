package org.apache.spark.sql.execution.datasources;
/**
 * Persists a single row.  Invoked on the executor side.  When writing to dynamically partitioned
 * tables, dynamic partition columns are not included in rows to be written.
 */
public abstract class OutputWriter {
  // not preceding
  public   OutputWriter ()  { throw new RuntimeException(); }
  /**
   * Closes the {@link OutputWriter}. Invoked on the executor side after all rows are persisted, before
   * the task output is committed.
   */
  public abstract  void close ()  ;
  // not preceding
  public abstract  void write (org.apache.spark.sql.catalyst.InternalRow row)  ;
}
