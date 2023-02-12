package org.apache.spark.api.r;
/**
 * Returns the JVM object associated with the input key or None if not found.
 */
  class JVMObjectTracker {
  // not preceding
  public   JVMObjectTracker ()  { throw new RuntimeException(); }
  /**
   * Adds a JVM object to track and returns assigned ID, which is unique within this tracker.
   * @param obj (undocumented)
   * @return (undocumented)
   */
  public final  org.apache.spark.api.r.JVMObjectId addAndGetId (java.lang.Object obj)  { throw new RuntimeException(); }
  /**
   * Returns the JVM object associated with the input key or throws an exception if not found.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public final  java.lang.Object apply (org.apache.spark.api.r.JVMObjectId id) throws java.util.NoSuchElementException { throw new RuntimeException(); }
  /**
   * Clears the tracker.
   */
  public final  void clear ()  { throw new RuntimeException(); }
  // not preceding
  public final  scala.Option<java.lang.Object> get (org.apache.spark.api.r.JVMObjectId id)  { throw new RuntimeException(); }
  /**
   * Removes and returns a JVM object with the specific ID from the tracker, or None if not found.
   * @param id (undocumented)
   * @return (undocumented)
   */
  public final  scala.Option<java.lang.Object> remove (org.apache.spark.api.r.JVMObjectId id)  { throw new RuntimeException(); }
  /**
   * Number of JVM objects being tracked.
   * @return (undocumented)
   */
  public final  int size ()  { throw new RuntimeException(); }
}
