package org.apache.spark.ml.tree;
/**
 * Info for a {@link org.apache.spark.ml.tree.Split}
 * <p>
 * param:  featureIndex  Index of feature split on
 * param:  leftCategoriesOrThreshold  For categorical feature, set of leftCategories.
 *                                   For continuous feature, threshold.
 * param:  numCategories  For categorical feature, number of categories.
 *                       For continuous feature, -1.
 */
// not preceding
public  class DecisionTreeModelReadWrite$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DecisionTreeModelReadWrite$ MODULE$ = null;
  public   DecisionTreeModelReadWrite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.tree.Node loadTreeNodes (java.lang.String path, org.apache.spark.ml.util.DefaultParamsReader.Metadata metadata, org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * Given all data for all nodes in a tree, rebuild the tree.
   * @param data  Unsorted node data
   * @param impurityType  Impurity type for this tree
   * @return Root node of reconstructed tree
   */
  public  org.apache.spark.ml.tree.Node buildTreeFromNodes (org.apache.spark.ml.tree.DecisionTreeModelReadWrite.NodeData[] data, java.lang.String impurityType)  { throw new RuntimeException(); }
}
