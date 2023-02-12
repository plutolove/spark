package org.apache.spark.streaming;
/** Whether the state already exists */
public abstract class State<S extends java.lang.Object> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   State ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  boolean exists ()  ;
  /**
   * Get the state if it exists, otherwise it will throw <code>java.util.NoSuchElementException</code>.
   * Check with <code>exists()</code> whether the state exists or not before calling <code>get()</code>.
   * <p>
   * @throws java.util.NoSuchElementException If the state does not exist.
   * @return (undocumented)
   */
  public abstract  S get ()  ;
  /**
   * Get the state as a <code>scala.Option</code>. It will be <code>Some(state)</code> if it exists, otherwise <code>None</code>.
   * @return (undocumented)
   */
  public final  scala.Option<S> getOption ()  { throw new RuntimeException(); }
  /**
   * Whether the state is timing out and going to be removed by the system after the current batch.
   * This timeout can occur if timeout duration has been specified in the
   * {@link org.apache.spark.streaming.StateSpec StatSpec} and the key has not received any new data
   * for that timeout duration.
   * @return (undocumented)
   */
  public abstract  boolean isTimingOut ()  ;
  /**
   * Remove the state if it exists.
   * <p>
   * State cannot be updated if it has been already removed (that is, <code>remove()</code> has already been
   * called) or it is going to be removed due to timeout (that is, <code>isTimingOut()</code> is <code>true</code>).
   */
  public abstract  void remove ()  ;
  public final  java.lang.String toString ()  { throw new RuntimeException(); }
  /**
   * Update the state with a new value.
   * <p>
   * State cannot be updated if it has been already removed (that is, <code>remove()</code> has already been
   * called) or it is going to be removed due to timeout (that is, <code>isTimingOut()</code> is <code>true</code>).
   * <p>
   * @throws java.lang.IllegalArgumentException If the state has already been removed, or is
   *                                            going to be removed
   * @param newState (undocumented)
   */
  public abstract  void update (S newState)  ;
}
