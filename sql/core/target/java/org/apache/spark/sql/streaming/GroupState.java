package org.apache.spark.sql.streaming;
/** Whether state exists or not. */
public  interface GroupState<S extends java.lang.Object> extends org.apache.spark.sql.catalyst.plans.logical.LogicalGroupState<S> {
  /** Whether state exists or not. */
  public  boolean exists ()  ;
  /** Get the state value if it exists, or throw NoSuchElementException. */
  public  S get () throws java.util.NoSuchElementException ;
  /**
   * Get the current processing time as milliseconds in epoch time.
   * @note In a streaming query, this will return a constant value throughout the duration of a
   *       trigger, even if the trigger is re-executed.
   * @return (undocumented)
   */
  public  long getCurrentProcessingTimeMs ()  ;
  /**
   * Get the current event time watermark as milliseconds in epoch time.
   * <p>
   * @note In a streaming query, this can be called only when watermark is set before calling
   *       <code>[map/flatMap]GroupsWithState</code>. In a batch query, this method always returns -1.
   * @return (undocumented)
   */
  public  long getCurrentWatermarkMs () throws java.lang.UnsupportedOperationException ;
  /** Get the state value as a scala Option. */
  public  scala.Option<S> getOption ()  ;
  /**
   * Whether the function has been called because the key has timed out.
   * @note This can return true only when timeouts are enabled in <code>[map/flatMap]GroupsWithState</code>.
   * @return (undocumented)
   */
  public  boolean hasTimedOut ()  ;
  /** Remove this state. */
  public  void remove ()  ;
  /**
   * Set the timeout duration in ms for this key.
   * <p>
   * @note {@link GroupStateTimeout Processing time timeout} must be enabled in
   *       <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no effect when used in a batch query.
   * @param durationMs (undocumented)
   */
  public  void setTimeoutDuration (long durationMs) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException ;
  /**
   * Set the timeout duration for this key as a string. For example, "1 hour", "2 days", etc.
   * <p>
   * @note {@link GroupStateTimeout Processing time timeout} must be enabled in
   *       <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no effect when used in a batch query.
   * @param duration (undocumented)
   */
  public  void setTimeoutDuration (java.lang.String duration) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException ;
  /**
   * Set the timeout timestamp for this key as milliseconds in epoch time.
   * This timestamp cannot be older than the current watermark.
   * <p>
   * @note {@link GroupStateTimeout Event time timeout} must be enabled in
   *       <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no effect when used in a batch query.
   * @param timestampMs (undocumented)
   */
  public  void setTimeoutTimestamp (long timestampMs) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException ;
  /**
   * Set the timeout timestamp for this key as milliseconds in epoch time and an additional
   * duration as a string (e.g. "1 hour", "2 days", etc.).
   * The final timestamp (including the additional duration) cannot be older than the
   * current watermark.
   * <p>
   * @note {@link GroupStateTimeout Event time timeout} must be enabled in
   *       <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no side effect when used in a batch query.
   * @param timestampMs (undocumented)
   * @param additionalDuration (undocumented)
   */
  public  void setTimeoutTimestamp (long timestampMs, java.lang.String additionalDuration) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException ;
  /**
   * Set the timeout timestamp for this key as a java.sql.Date.
   * This timestamp cannot be older than the current watermark.
   * <p>
   * @note {@link GroupStateTimeout Event time timeout} must be enabled in
   *       <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no side effect when used in a batch query.
   * @param timestamp (undocumented)
   */
  public  void setTimeoutTimestamp (java.sql.Date timestamp) throws java.lang.UnsupportedOperationException ;
  /**
   * Set the timeout timestamp for this key as a java.sql.Date and an additional
   * duration as a string (e.g. "1 hour", "2 days", etc.).
   * The final timestamp (including the additional duration) cannot be older than the
   * current watermark.
   * <p>
   * @note {@link GroupStateTimeout Event time timeout} must be enabled in
   *      <code>[map/flatMap]GroupsWithState</code> for calling this method.
   * @note This method has no side effect when used in a batch query.
   * @param timestamp (undocumented)
   * @param additionalDuration (undocumented)
   */
  public  void setTimeoutTimestamp (java.sql.Date timestamp, java.lang.String additionalDuration) throws java.lang.IllegalArgumentException, java.lang.UnsupportedOperationException ;
  /** Update the value of the state. */
  public  void update (S newState)  ;
}
