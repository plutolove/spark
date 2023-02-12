package org.apache.spark.sql.execution.streaming.state;
/** Get all the values of a key */
public  class SymmetricHashJoinStateManager implements org.apache.spark.internal.Logging {
  // not preceding
  public  interface KeyWithIndexToValueRowConverter {
    /**
     * Build the value row from (actual value, match) pair. This is expected to be called just
     * before storing to the state store.
     * <p>
     * NOTE: depending on the implementation, the result row "may" be reused during execution
     * (to avoid initialization of object), so the caller should ensure that the logic doesn't
     * affect by such behavior. Call copy() against the result row if needed.
     * @param value (undocumented)
     * @param matched (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow convertToValueRow (org.apache.spark.sql.catalyst.expressions.UnsafeRow value, boolean matched)  ;
    /**
     * Convert the value row to (actual value, match) pair.
     * <p>
     * NOTE: implementations should ensure the result row is NOT reused during execution, so
     * that caller can safely read the value in any time.
     * @param value (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.ValueAndMatchPair convertValue (org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  ;
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> valueAttributes ()  ;
  }
  /** Helper class for representing data (value, matched). */
  static public  class ValueAndMatchPair implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow value ()  { throw new RuntimeException(); }
    public  boolean matched ()  { throw new RuntimeException(); }
    // not preceding
    public   ValueAndMatchPair (org.apache.spark.sql.catalyst.expressions.UnsafeRow value, boolean matched)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ValueAndMatchPair$ extends scala.runtime.AbstractFunction2<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.ValueAndMatchPair> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ValueAndMatchPair$ MODULE$ = null;
    public   ValueAndMatchPair$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class KeyToValuePair implements scala.Product, scala.Serializable {
    // not preceding
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow key ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow value ()  { throw new RuntimeException(); }
    public  boolean matched ()  { throw new RuntimeException(); }
    // not preceding
    public   KeyToValuePair (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value, boolean matched)  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToValuePair withNew (org.apache.spark.sql.catalyst.expressions.UnsafeRow newKey, org.apache.spark.sql.catalyst.expressions.UnsafeRow newValue, boolean newMatched)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToValuePair withNew (org.apache.spark.sql.catalyst.expressions.UnsafeRow newKey, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.ValueAndMatchPair newValue)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class KeyToValuePair$ extends scala.runtime.AbstractFunction3<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object, org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToValuePair> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final KeyToValuePair$ MODULE$ = null;
    public   KeyToValuePair$ ()  { throw new RuntimeException(); }
  }
  static public  interface StateStoreType {
  }
  // not preceding
  static public  scala.collection.Seq<java.lang.Object> supportedVersions ()  { throw new RuntimeException(); }
  static public  int legacyVersion ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> allStateStoreNames (scala.collection.Seq<org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide> joinSides)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide ()  { throw new RuntimeException(); }
  // not preceding
  public   SymmetricHashJoinStateManager (org.apache.spark.sql.execution.streaming.StreamingSymmetricHashJoinHelper.JoinSide joinSide, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputValueAttributes, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> joinKeys, scala.Option<org.apache.spark.sql.execution.streaming.StatefulOperatorStateInfo> stateInfo, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf, int partitionId, int stateFormatVersion)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
  /** Append a new value to the key */
  public  void append (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value, boolean matched)  { throw new RuntimeException(); }
  /**
   * Get all the matched values for given join condition, with marking matched.
   * This method is designed to mark joined rows properly without exposing internal index of row.
   * @param key (undocumented)
   * @param generateJoinedRow (undocumented)
   * @param predicate (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.JoinedRow> getJoinedRows (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, scala.Function1<org.apache.spark.sql.catalyst.InternalRow, org.apache.spark.sql.catalyst.expressions.JoinedRow> generateJoinedRow, scala.Function1<org.apache.spark.sql.catalyst.expressions.JoinedRow, java.lang.Object> predicate)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on keys.
   * <p>
   * This produces an iterator over the (key, value, matched) tuples satisfying condition(key),
   * where the underlying store is updated as a side-effect of producing next.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToValuePair> removeByKeyCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /**
   * Remove using a predicate on values.
   * <p>
   * At a high level, this produces an iterator over the (key, value, matched) tuples such that
   * value satisfies the predicate, where producing an element removes the value from the
   * state store and producing all elements with a given key updates it accordingly.
   * <p>
   * This implies the iterator must be consumed fully without any other operations on this manager
   * or the underlying store being interleaved.
   * @param removalCondition (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.SymmetricHashJoinStateManager.KeyToValuePair> removeByValueCondition (scala.Function1<org.apache.spark.sql.catalyst.expressions.UnsafeRow, java.lang.Object> removalCondition)  { throw new RuntimeException(); }
  /** Projects the key of unsafe row to internal row for printable log message. */
  public  org.apache.spark.sql.catalyst.InternalRow getInternalRowOfKeyWithIndex (org.apache.spark.sql.catalyst.expressions.UnsafeRow currentKey)  { throw new RuntimeException(); }
  /** Commit all the changes to all the state stores */
  public  void commit ()  { throw new RuntimeException(); }
  /** Abort any changes to the state stores if needed */
  public  void abortIfNeeded ()  { throw new RuntimeException(); }
  /** Get the combined metrics of all the state stores */
  public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
}