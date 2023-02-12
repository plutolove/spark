package org.apache.spark.ml.tree;
/**
 * If true, then "categories" is the set of categories for splitting to the left, and vice versa.
 */
public  class CategoricalSplit implements org.apache.spark.ml.tree.Split {
  // not preceding
     CategoricalSplit (int featureIndex, double[] _leftCategories, int numCategories)  { throw new RuntimeException(); }
  public  boolean equals (Object o)  { throw new RuntimeException(); }
  // not preceding
  public  int featureIndex ()  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  /** Get sorted categories which split to the left */
  public  double[] leftCategories ()  { throw new RuntimeException(); }
  public  int numCategories ()  { throw new RuntimeException(); }
  /** Get sorted categories which split to the right */
  public  double[] rightCategories ()  { throw new RuntimeException(); }
    boolean shouldGoLeft (org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
    boolean shouldGoLeft (int binnedFeature, org.apache.spark.ml.tree.Split[] splits)  { throw new RuntimeException(); }
    org.apache.spark.mllib.tree.model.Split toOld ()  { throw new RuntimeException(); }
}