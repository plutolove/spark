package org.apache.spark.ml.tree.impl;
/**
 * Train a random forest.
 * <p>
 * param:  input Training data: RDD of <code>LabeledPoint</code>
 * @return an unweighted set of trees
 */
// not preceding
public  class RandomForest$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomForest$ MODULE$ = null;
  public   RandomForest$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.tree.DecisionTreeModel[] run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed)  { throw new RuntimeException(); }
  /**
   * Train a random forest with metadata and splits. This method is mainly for GBT,
   * in which bagged input can be reused among trees.
   * <p>
   * @param baggedInput bagged training data: RDD of <code>BaggedPoint</code>
   * @param metadata Learning and dataset metadata for DecisionTree.
   * @return an unweighted set of trees
   * @param bcSplits (undocumented)
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   * @param instr (undocumented)
   * @param prune (undocumented)
   * @param parentUID (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeModel[] runBagged (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> baggedInput, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.tree.Split[][]> bcSplits, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed, scala.Option<org.apache.spark.ml.util.Instrumentation> instr, boolean prune, scala.Option<java.lang.String> parentUID)  { throw new RuntimeException(); }
  /**
   * Train a random forest.
   * <p>
   * @param input Training data: RDD of <code>Instance</code>
   * @return an unweighted set of trees
   * @param strategy (undocumented)
   * @param numTrees (undocumented)
   * @param featureSubsetStrategy (undocumented)
   * @param seed (undocumented)
   * @param instr (undocumented)
   * @param prune (undocumented)
   * @param parentUID (undocumented)
   */
  public  org.apache.spark.ml.tree.DecisionTreeModel[] run (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.mllib.tree.configuration.Strategy strategy, int numTrees, java.lang.String featureSubsetStrategy, long seed, scala.Option<org.apache.spark.ml.util.Instrumentation> instr, boolean prune, scala.Option<java.lang.String> parentUID)  { throw new RuntimeException(); }
  /**
   * Do the same thing as binSeqOp, but with nodeIdCache.
   * @param input (undocumented)
   * @param metadata (undocumented)
   * @param topNodesForGroup (undocumented)
   * @param nodesForGroup (undocumented)
   * @param treeToNodeToIndexInfo (undocumented)
   * @param bcSplits (undocumented)
   * @param nodeStack (undocumented)
   * @param timer (undocumented)
   * @param nodeIds (undocumented)
   * @param outputBestSplits (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.Split>[] findBestSplits (org.apache.spark.rdd.RDD<org.apache.spark.ml.tree.impl.BaggedPoint<org.apache.spark.ml.tree.impl.TreePoint>> input, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode> topNodesForGroup, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]> nodesForGroup, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>> treeToNodeToIndexInfo, org.apache.spark.broadcast.Broadcast<org.apache.spark.ml.tree.Split[][]> bcSplits, scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeStack, org.apache.spark.ml.tree.impl.TimeTracker timer, org.apache.spark.rdd.RDD<int[]> nodeIds, boolean outputBestSplits)  { throw new RuntimeException(); }
  /**
   * Find the best split for a node.
   * <p>
   * @param binAggregates Bin statistics.
   * @return tuple for best split: (Split, information gain, prediction at node)
   * @param splits (undocumented)
   * @param featuresForNode (undocumented)
   * @param node (undocumented)
   */
    scala.Tuple2<org.apache.spark.ml.tree.Split, org.apache.spark.mllib.tree.model.ImpurityStats> binsToBestSplit (org.apache.spark.ml.tree.impl.DTStatsAggregator binAggregates, org.apache.spark.ml.tree.Split[][] splits, scala.Option<int[]> featuresForNode, org.apache.spark.ml.tree.LearningNode node)  { throw new RuntimeException(); }
  /**
   * Returns splits for decision tree calculation.
   * Continuous and categorical features are handled differently.
   * <p>
   * Continuous features:
   *   For each feature, there are numBins - 1 possible splits representing the possible binary
   *   decisions at each node in the tree.
   *   This finds locations (feature values) for splits using a subsample of the data.
   * <p>
   * Categorical features:
   *   For each feature, there is 1 bin per split.
   *   Splits and bins are handled in 2 ways:
   *   (a) "unordered features"
   *       For multiclass classification with a low-arity feature
   *       (i.e., if isMulticlass &amp;&amp; isSpaceSufficientForAllCategoricalSplits),
   *       the feature is split based on subsets of categories.
   *   (b) "ordered features"
   *       For regression and binary classification,
   *       and for multiclass classification with a high-arity feature,
   *       there is one bin per category.
   * <p>
   * @param input Training data: RDD of {@link Instance}
   * @param metadata Learning and dataset metadata
   * @param seed random seed
   * @return Splits, an Array of {@link Split}
   *          of size (numFeatures, numSplits)
   */
  protected  org.apache.spark.ml.tree.Split[][] findSplits (org.apache.spark.rdd.RDD<org.apache.spark.ml.feature.Instance> input, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, long seed)  { throw new RuntimeException(); }
  /**
   * Nested method to extract list of eligible categories given an index. It extracts the
   * position of ones in a binary representation of the input. If binary
   * representation of an number is 01101 (13), the output list should (3.0, 2.0,
   * 0.0). The maxFeatureValue depict the number of rightmost digits that will be tested for ones.
   * @param input (undocumented)
   * @param maxFeatureValue (undocumented)
   * @return (undocumented)
   */
    scala.collection.immutable.List<java.lang.Object> extractMultiClassCategories (int input, int maxFeatureValue)  { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * <p>
   * @param featureSamples feature values and sample weights of each sample
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of split thresholds
   */
    double[] findSplitsForContinuousFeature (scala.collection.Iterable<scala.Tuple2<java.lang.Object, java.lang.Object>> featureSamples, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, int featureIndex)  { throw new RuntimeException(); }
  /**
   * Find splits for a continuous feature
   * NOTE: Returned number of splits is set based on <code>featureSamples</code> and
   *       could be different from the specified <code>numSplits</code>.
   *       The <code>numSplits</code> attribute in the <code>DecisionTreeMetadata</code> class will be set accordingly.
   * <p>
   * @param partValueWeights non-zero distinct values and their weights
   * @param metadata decision tree metadata
   *                 NOTE: <code>metadata.numbins</code> will be changed accordingly
   *                       if there are not enough splits to be found
   * @param featureIndex feature index to find splits
   * @return array of split thresholds
   * @param count (undocumented)
   */
    double[] findSplitsForContinuousFeature (scala.collection.immutable.Map<java.lang.Object, java.lang.Object> partValueWeights, long count, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, int featureIndex)  { throw new RuntimeException(); }
  // not preceding
    scala.Tuple2<scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.LearningNode[]>, scala.collection.immutable.Map<java.lang.Object, scala.collection.immutable.Map<java.lang.Object, org.apache.spark.ml.tree.impl.RandomForest.NodeIndexInfo>>> selectNodesToSplit (scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.Object, org.apache.spark.ml.tree.LearningNode>> nodeStack, long maxMemoryUsage, org.apache.spark.ml.tree.impl.DecisionTreeMetadata metadata, scala.util.Random rng)  { throw new RuntimeException(); }
}
