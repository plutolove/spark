package org.apache.spark.util.random;
/** take a random sample */
public  interface RandomSampler<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.util.random.Pseudorandom, scala.Cloneable, scala.Serializable {
  /** take a random sample */
  public  scala.collection.Iterator<U> sample (scala.collection.Iterator<T> items)  ;
  /**
   * Whether to sample the next item or not.
   * Return how many times the next item will be sampled. Return 0 if it is not sampled.
   * @return (undocumented)
   */
  public  int sample ()  ;
  /** return a copy of the RandomSampler object */
  public  org.apache.spark.util.random.RandomSampler<T, U> clone ()  ;
}
