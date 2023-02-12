package org.apache.spark.mllib.fpm;
/**
 * Constructs a default instance with default parameters {minSupport: <code>0.3</code>, numPartitions: same
 * as the input data}.
 * <p>
 */
public  class FPGrowth implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  static public  class FreqItemset<Item extends java.lang.Object> implements scala.Serializable {
    // not preceding
    public   FreqItemset (java.lang.Object items, long freq)  { throw new RuntimeException(); }
    public  long freq ()  { throw new RuntimeException(); }
    public  java.lang.Object items ()  { throw new RuntimeException(); }
    // not preceding
    public  java.util.List<Item> javaItems ()  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
  }
  // not preceding
     FPGrowth (double minSupport, int numPartitions)  { throw new RuntimeException(); }
  // not preceding
  public   FPGrowth ()  { throw new RuntimeException(); }
  /**
   * Sets the minimal support level (default: <code>0.3</code>).
   * <p>
   * @param minSupport (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setMinSupport (double minSupport)  { throw new RuntimeException(); }
  /**
   * Sets the number of partitions used by parallel FP-growth (default: same as input data).
   * <p>
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.fpm.FPGrowth setNumPartitions (int numPartitions)  { throw new RuntimeException(); }
  /**
   * Computes an FP-Growth model that contains frequent itemsets.
   * @param data input data set, each element contains a transaction
   * @return an {@link FPGrowthModel}
   * <p>
   * @param evidence$4 (undocumented)
   */
  public <Item extends java.lang.Object> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.rdd.RDD<java.lang.Object> data, scala.reflect.ClassTag<Item> evidence$4)  { throw new RuntimeException(); }
  /**
   * Java-friendly version of <code>run</code>.
   * @param data (undocumented)
   * @return (undocumented)
   */
  public <Item extends java.lang.Object, Basket extends java.lang.Iterable<Item>> org.apache.spark.mllib.fpm.FPGrowthModel<Item> run (org.apache.spark.api.java.JavaRDD<Basket> data)  { throw new RuntimeException(); }
}
