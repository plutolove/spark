package org.apache.spark.sql.execution.datasources.jdbc;
/**
 * Returns a property with all options except Spark internal data source options like <code>url</code>,
 * <code>dbtable</code>, and <code>numPartition</code>. This should be used when invoking JDBC API like <code>Driver.connect</code>
 * because each DBMS vendor has its own property list for JDBC driver. See SPARK-17776.
 */
public  class JdbcOptionsInWrite extends org.apache.spark.sql.execution.datasources.jdbc.JDBCOptions {
  // not preceding
  public   JdbcOptionsInWrite (org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters)  { throw new RuntimeException(); }
  // not preceding
  public   JdbcOptionsInWrite (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public   JdbcOptionsInWrite (java.lang.String url, java.lang.String table, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.util.CaseInsensitiveMap<java.lang.String> parameters ()  { throw new RuntimeException(); }
  public  java.lang.String table ()  { throw new RuntimeException(); }
}
