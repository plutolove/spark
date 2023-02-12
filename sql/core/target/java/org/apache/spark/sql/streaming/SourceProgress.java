package org.apache.spark.sql.streaming;
/** The compact JSON representation of this progress. */
public  class SourceProgress implements scala.Serializable {
  // not preceding
  protected   SourceProgress (java.lang.String description, java.lang.String startOffset, java.lang.String endOffset, long numInputRows, double inputRowsPerSecond, double processedRowsPerSecond)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String description ()  { throw new RuntimeException(); }
  public  java.lang.String endOffset ()  { throw new RuntimeException(); }
  public  double inputRowsPerSecond ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String json ()  { throw new RuntimeException(); }
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  public  long numInputRows ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  public  double processedRowsPerSecond ()  { throw new RuntimeException(); }
  public  java.lang.String startOffset ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
