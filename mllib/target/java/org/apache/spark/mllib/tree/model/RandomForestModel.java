package org.apache.spark.mllib.tree.model;
/**
 * param:  sc  Spark context used to save model data.
 * param:  path  Path specifying the directory in which to save this model.
 *              If the directory already exists, this method throws an exception.
 */
public  class RandomForestModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel implements org.apache.spark.mllib.util.Saveable {
  // not preceding
  static public  org.apache.spark.mllib.tree.model.RandomForestModel load (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value algo ()  { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees ()  { throw new RuntimeException(); }
  // not preceding
  public   RandomForestModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees)  { throw new RuntimeException(); }
  /**
   * @param sc  Spark context used to save model data.
   * @param path  Path specifying the directory in which to save this model.
   *              If the directory already exists, this method throws an exception.
   */
  public  void save (org.apache.spark.SparkContext sc, java.lang.String path)  { throw new RuntimeException(); }
}
