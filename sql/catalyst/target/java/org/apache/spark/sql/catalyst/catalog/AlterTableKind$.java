package org.apache.spark.sql.catalyst.catalog;
/**
 * String to indicate which part of table is altered. If a plain alterTable API is called, then
 * type will generally be Table.
 */
// not preceding
public  class AlterTableKind$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AlterTableKind$ MODULE$ = null;
  public   AlterTableKind$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String TABLE ()  { throw new RuntimeException(); }
  public  java.lang.String DATASCHEMA ()  { throw new RuntimeException(); }
  public  java.lang.String STATS ()  { throw new RuntimeException(); }
}
