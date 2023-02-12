package org.apache.spark.sql.streaming;
/** SinkProgress without custom metrics. */
public  class SinkProgress implements scala.Serializable {
  // not preceding
  static public  long DEFAULT_NUM_OUTPUT_ROWS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.streaming.SinkProgress apply (java.lang.String description, scala.Option<java.lang.Object> numOutputRows)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  long numOutputRows ()  { throw new RuntimeException(); }
  // not preceding
  protected   SinkProgress (java.lang.String description, long numOutputRows)  { throw new RuntimeException(); }
  // not preceding
  protected   SinkProgress (java.lang.String description)  { throw new RuntimeException(); }
  /** The compact JSON representation of this progress. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
}
