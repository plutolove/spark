package org.apache.spark.mllib.tree.impurity;
/**
 * Merge the stats from one bin into another.
 * param:  allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
 * param:  offset    Start index of stats for (node, feature, bin) which is modified by the merge.
 * param:  otherOffset  Start index of stats for (node, feature, other bin) which is not modified.
 */
 abstract class ImpurityAggregator implements scala.Serializable {
  // not preceding
  public   ImpurityAggregator (int statsSize)  { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for a (node, feature, bin).
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   * @return (undocumented)
   */
  public abstract  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getCalculator (double[] allStats, int offset)  ;
  // not preceding
  public  void merge (double[] allStats, int offset, int otherOffset)  { throw new RuntimeException(); }
  // not preceding
  public  int statsSize ()  { throw new RuntimeException(); }
  /**
   * Update stats for one (node, feature, bin) with the given label.
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   * @param label (undocumented)
   * @param numSamples (undocumented)
   * @param sampleWeight (undocumented)
   */
  public abstract  void update (double[] allStats, int offset, double label, int numSamples, double sampleWeight)  ;
}
