package org.apache.spark.sql.streaming;
/** The compact JSON representation of this status. */
public  class StreamingQueryStatus implements scala.Serializable {
  // not preceding
  protected   StreamingQueryStatus (java.lang.String message, boolean isDataAvailable, boolean isTriggerActive)  { throw new RuntimeException(); }
    org.apache.spark.sql.streaming.StreamingQueryStatus copy (java.lang.String message, boolean isDataAvailable, boolean isTriggerActive)  { throw new RuntimeException(); }
  public  boolean isDataAvailable ()  { throw new RuntimeException(); }
  public  boolean isTriggerActive ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String json ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String message ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this status. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
