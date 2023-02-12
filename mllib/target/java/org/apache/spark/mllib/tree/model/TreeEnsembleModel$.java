package org.apache.spark.mllib.tree.model;
/**
 * Model data for model import/export.
 * We have to duplicate NodeData here since Spark SQL does not yet support extracting subfields
 * of nested fields; once that is possible, we can use something like:
 *  case class EnsembleNodeData(treeId: Int, node: NodeData),
 *  where NodeData is from DecisionTreeModel.
 */
// not preceding
public  class TreeEnsembleModel$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TreeEnsembleModel$ MODULE$ = null;
  public   TreeEnsembleModel$ ()  { throw new RuntimeException(); }
}
