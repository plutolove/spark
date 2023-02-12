package org.apache.spark.sql.execution.streaming;
/**
 * Defines how to clean up completed files. Available options are "archive", "delete", "off".
 */
// not preceding
public  class CleanSourceMode$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CleanSourceMode$ MODULE$ = null;
  public   CleanSourceMode$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value ARCHIVE ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value DELETE ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value OFF ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value fromString (scala.Option<java.lang.String> value)  { throw new RuntimeException(); }
}
