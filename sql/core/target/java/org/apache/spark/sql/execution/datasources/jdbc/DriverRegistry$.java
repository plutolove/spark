package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Load DriverManager first to avoid any race condition between
 * DriverManager static initialization block and specific driver class's
 * static initialization block. e.g. PhoenixDriver
 */
// not preceding
public  class DriverRegistry$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DriverRegistry$ MODULE$ = null;
  public   DriverRegistry$ ()  { throw new RuntimeException(); }
  public  void register (java.lang.String className)  { throw new RuntimeException(); }
}
