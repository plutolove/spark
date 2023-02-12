package org.apache.spark.mllib.fpm;
/**
 * Constructs a default instance with default parameters {minConfidence = 0.8}.
 */
public  class AssociationRules implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  static public  class Rule<Item extends java.lang.Object> implements scala.Serializable {
    // not preceding
       Rule (java.lang.Object antecedent, java.lang.Object consequent, double freqUnion, double freqAntecedent, scala.Option<java.lang.Object> freqConsequent)  { throw new RuntimeException(); }
    public  java.lang.Object antecedent ()  { throw new RuntimeException(); }
    // not preceding
    public  double confidence ()  { throw new RuntimeException(); }
    public  java.lang.Object consequent ()  { throw new RuntimeException(); }
    /**
     * Returns antecedent in a Java List.
     * <p>
     * @return (undocumented)
     */
    public  java.util.List<Item> javaAntecedent ()  { throw new RuntimeException(); }
    /**
     * Returns consequent in a Java List.
     * <p>
     * @return (undocumented)
     */
    public  java.util.List<Item> javaConsequent ()  { throw new RuntimeException(); }
    /**
     * Returns the lift of the rule.
     * @return (undocumented)
     */
    public  scala.Option<java.lang.Object> lift ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
     AssociationRules (double minConfidence)  { throw new RuntimeException(); }
  // not preceding
  public   AssociationRules ()  { throw new RuntimeException(); }
  /**
   * Sets the minimal confidence (default: <code>0.8</code>).
   * @param minConfidence (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.AssociationRules setMinConfidence (double minConfidence)  { throw new RuntimeException(); }
  /**
   * Computes the association rules with confidence above <code>minConfidence</code>.
   * @param freqItemsets frequent itemset model obtained from {@link FPGrowth}
   * @return a <code>RDD[Rule[Item}</code> containing the association rules.
   * <p>
   * @param evidence$1 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.AssociationRules.Rule<Item>> run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets, scala.reflect.ClassTag<Item> evidence$1)  { throw new RuntimeException(); }
  /**
   * Computes the association rules with confidence above <code>minConfidence</code>.
   * @param freqItemsets frequent itemset model obtained from {@link FPGrowth}
   * @param itemSupport map containing an item and its support
   * @return a <code>RDD[Rule[Item}</code> containing the association rules. The rules will be able to
   *         compute also the lift metric.
   * @param evidence$2 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.AssociationRules.Rule<Item>> run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets, scala.collection.Map<Item, java.lang.Object> itemSupport, scala.reflect.ClassTag<Item> evidence$2)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run</code>.
   * @param freqItemsets (undocumented)
   * @return (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.fpm.AssociationRules.Rule<Item>> run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.fpm.FPGrowth.FreqItemset<Item>> freqItemsets)  { throw new RuntimeException(); }
}
