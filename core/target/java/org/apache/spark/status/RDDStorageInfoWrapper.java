package org.apache.spark.status;
/**
 * Sorting by accumulators is a little weird, and the previous behavior would generate
 * insanely long keys in the index. So this implementation just considers the first
 * accumulator and its String representation.
 */
  class RDDStorageInfoWrapper {
  // not preceding
  public   RDDStorageInfoWrapper (org.apache.spark.status.api.v1.RDDStorageInfo info)  { throw new RuntimeException(); }
  public  boolean cached ()  { throw new RuntimeException(); }
  // not preceding
  public  int id ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.api.v1.RDDStorageInfo info ()  { throw new RuntimeException(); }
}
