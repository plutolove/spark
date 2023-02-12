package org.apache.spark.mllib.random;
/**
 * Returns an i.i.d. sample as a generic type from an underlying distribution.
 */
public  interface RandomDataGenerator<T extends java.lang.Object> extends org.apache.spark.util.random.Pseudorandom, scala.Serializable {
  /**
   * Returns a copy of the RandomDataGenerator with a new instance of the rng object used in the
   * class when applicable for non-locking concurrent usage.
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.random.RandomDataGenerator<T> copy ()  ;
  /**
   * Returns an i.i.d. sample as a generic type from an underlying distribution.
   * @return (undocumented)
   */
  public  T nextValue ()  ;
}
