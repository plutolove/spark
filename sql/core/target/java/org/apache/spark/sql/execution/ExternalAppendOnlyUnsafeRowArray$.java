package org.apache.spark.sql.execution;
/**
 * Creates an {@link Iterator} for the current rows in the array starting from a user provided index
 * <p>
 * If there are subsequent {@link add()} or {@link clear()} calls made on this array after creation of
 * the iterator, then the iterator is invalidated thus saving clients from thinking that they
 * have read all the data while there were new rows added to this array.
 */
// not preceding
public  class ExternalAppendOnlyUnsafeRowArray$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ExternalAppendOnlyUnsafeRowArray$ MODULE$ = null;
  public   ExternalAppendOnlyUnsafeRowArray$ ()  { throw new RuntimeException(); }
  // not preceding
  public  int DefaultInitialSizeOfInMemoryBuffer ()  { throw new RuntimeException(); }
}
