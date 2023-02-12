package org.apache.spark.status.api.v1;
  class BadParameterException extends javax.ws.rs.WebApplicationException {
  // not preceding
  public   BadParameterException (java.lang.String msg)  { throw new RuntimeException(); }
  // not preceding
  public   BadParameterException (java.lang.String param, java.lang.String exp, java.lang.String actual)  { throw new RuntimeException(); }
}
