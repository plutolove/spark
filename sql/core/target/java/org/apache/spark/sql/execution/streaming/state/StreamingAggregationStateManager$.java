package org.apache.spark.sql.execution.streaming.state;
/** Return an iterator containing all the values in target state store. */
// not preceding
public  class StreamingAggregationStateManager$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StreamingAggregationStateManager$ MODULE$ = null;
  public   StreamingAggregationStateManager$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.Object> supportedVersions ()  { throw new RuntimeException(); }
  public  int legacyVersion ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StreamingAggregationStateManager createStateManager (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> keyExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputRowAttributes, int stateFormatVersion)  { throw new RuntimeException(); }
}
