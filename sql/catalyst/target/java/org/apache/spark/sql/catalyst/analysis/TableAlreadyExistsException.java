package org.apache.spark.sql.catalyst.analysis;
public  class TableAlreadyExistsException extends org.apache.spark.sql.AnalysisException {
  // not preceding
  public   TableAlreadyExistsException (java.lang.String message)  { throw new RuntimeException(); }
  // not preceding
  public   TableAlreadyExistsException (java.lang.String db, java.lang.String table)  { throw new RuntimeException(); }
  public   TableAlreadyExistsException (org.apache.spark.sql.connector.catalog.Identifier tableIdent)  { throw new RuntimeException(); }
}
