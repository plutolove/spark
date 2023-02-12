package org.apache.spark.sql.catalyst.analysis;
public  class NoSuchTableException extends org.apache.spark.sql.AnalysisException {
  // not preceding
  public   NoSuchTableException (java.lang.String message)  { throw new RuntimeException(); }
  // not preceding
  public   NoSuchTableException (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public   NoSuchTableException (org.apache.spark.sql.connector.catalog.Identifier tableIdent)  { throw new RuntimeException(); }
}
