package org.apache.spark.partial;
/**
 * @note Consistent with Double, any NaN value will make equality false
 */
public  class BoundedDouble {
  // not preceding
  public   BoundedDouble (double mean, double confidence, double low, double high)  { throw new RuntimeException(); }
  public  double confidence ()  { throw new RuntimeException(); }
  /**
   * @note Consistent with Double, any NaN value will make equality false
   * @param that (undocumented)
   * @return (undocumented)
   */
  public  boolean equals (Object that)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  double high ()  { throw new RuntimeException(); }
  public  double low ()  { throw new RuntimeException(); }
  // not preceding
  public  double mean ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}