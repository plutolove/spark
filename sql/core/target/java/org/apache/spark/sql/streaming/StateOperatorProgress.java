package org.apache.spark.sql.streaming;
/** The compact JSON representation of this progress. */
public  class StateOperatorProgress implements scala.Serializable {
  // not preceding
  public  long numRowsTotal ()  { throw new RuntimeException(); }
  public  long numRowsUpdated ()  { throw new RuntimeException(); }
  public  long memoryUsedBytes ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Long> customMetrics ()  { throw new RuntimeException(); }
  // not preceding
     StateOperatorProgress (long numRowsTotal, long numRowsUpdated, long memoryUsedBytes, java.util.Map<java.lang.String, java.lang.Long> customMetrics)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
    org.apache.spark.sql.streaming.StateOperatorProgress copy (long newNumRowsUpdated)  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
