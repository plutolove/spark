package org.apache.spark.sql.streaming;
/** The aggregate (across all sources) number of records processed in a trigger. */
public  class StreamingQueryProgress implements scala.Serializable {
  // not preceding
     StreamingQueryProgress (java.util.UUID id, java.util.UUID runId, java.lang.String name, java.lang.String timestamp, long batchId, long batchDuration, java.util.Map<java.lang.String, java.lang.Long> durationMs, java.util.Map<java.lang.String, java.lang.String> eventTime, org.apache.spark.sql.streaming.StateOperatorProgress[] stateOperators, org.apache.spark.sql.streaming.SourceProgress[] sources, org.apache.spark.sql.streaming.SinkProgress sink, java.util.Map<java.lang.String, org.apache.spark.sql.Row> observedMetrics)  { throw new RuntimeException(); }
  public  long batchDuration ()  { throw new RuntimeException(); }
  public  long batchId ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.Long> durationMs ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, java.lang.String> eventTime ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.UUID id ()  { throw new RuntimeException(); }
  /** The aggregate (across all sources) rate of data arriving. */
  public  double inputRowsPerSecond ()  { throw new RuntimeException(); }
  /** The compact JSON representation of this progress. */
  public  java.lang.String json ()  { throw new RuntimeException(); }
  /** Convert map to JValue while handling empty maps. Also, this sorts the keys. */
    org.json4s.JsonAST.JValue jsonValue ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public  long numInputRows ()  { throw new RuntimeException(); }
  public  java.util.Map<java.lang.String, org.apache.spark.sql.Row> observedMetrics ()  { throw new RuntimeException(); }
  /** The pretty (i.e. indented) JSON representation of this progress. */
  public  java.lang.String prettyJson ()  { throw new RuntimeException(); }
  /** The aggregate (across all sources) rate at which Spark is processing data. */
  public  double processedRowsPerSecond ()  { throw new RuntimeException(); }
  public  java.util.UUID runId ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.SinkProgress sink ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.SourceProgress[] sources ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.streaming.StateOperatorProgress[] stateOperators ()  { throw new RuntimeException(); }
  public  java.lang.String timestamp ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
