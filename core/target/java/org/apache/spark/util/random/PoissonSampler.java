package org.apache.spark.util.random;
/** Epsilon slop to avoid failure from floating point jitter. */
public  class PoissonSampler<T extends java.lang.Object> implements org.apache.spark.util.random.RandomSampler<T, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   PoissonSampler (double fraction, boolean useGapSamplingIfPossible)  { throw new RuntimeException(); }
  // not preceding
  public   PoissonSampler (double fraction)  { throw new RuntimeException(); }
  public  org.apache.spark.util.random.PoissonSampler<T> clone ()  { throw new RuntimeException(); }
  public  int sample ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<T> sample (scala.collection.Iterator<T> items)  { throw new RuntimeException(); }
  public  void setSeed (long seed)  { throw new RuntimeException(); }
}
