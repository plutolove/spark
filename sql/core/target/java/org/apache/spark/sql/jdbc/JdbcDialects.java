package org.apache.spark.sql.jdbc;
/**
 * Register a dialect for use on all new matching jdbc <code>org.apache.spark.sql.DataFrame</code>.
 * Reading an existing dialect will cause a move-to-front.
 * <p>
 * param:  dialect The new dialect.
 */
// not preceding
public  class JdbcDialects {
  // not preceding
  static public  void registerDialect (org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Unregister a dialect. Does nothing if the dialect is not registered.
   * <p>
   * @param dialect The jdbc dialect.
   */
  static public  void unregisterDialect (org.apache.spark.sql.jdbc.JdbcDialect dialect)  { throw new RuntimeException(); }
  /**
   * Fetch the JdbcDialect class corresponding to a given database url.
   * @param url (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.jdbc.JdbcDialect get (java.lang.String url)  { throw new RuntimeException(); }
}
