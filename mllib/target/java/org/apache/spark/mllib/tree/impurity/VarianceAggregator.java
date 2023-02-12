package org.apache.spark.mllib.tree.impurity;
/**
 * Update stats for one (node, feature, bin) with the given label.
 * param:  allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
 * param:  offset    Start index of stats for this (node, feature, bin).
 */
  class VarianceAggregator extends org.apache.spark.mllib.tree.impurity.ImpurityAggregator implements scala.Serializable {
  // not preceding
  public   VarianceAggregator ()  { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for a (node, feature, bin).
   * @param allStats  Flat stats array, with stats for this (node, feature, bin) contiguous.
   * @param offset    Start index of stats for this (node, feature, bin).
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.tree.impurity.VarianceCalculator getCalculator (double[] allStats, int offset)  { throw new RuntimeException(); }
  // not preceding
  public  void update (double[] allStats, int offset, double label, int numSamples, double sampleWeight)  { throw new RuntimeException(); }
}
