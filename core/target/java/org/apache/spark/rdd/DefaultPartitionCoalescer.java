package org.apache.spark.rdd;
/**
 * Gets the least element of the list associated with key in groupHash
 * The returned PartitionGroup is the least loaded of all groups that represent the machine "key"
 * <p>
 * param:  key string representing a partitioned group on preferred machine key
 * @return Option of {@link PartitionGroup} that has least elements for key
 */
public  class DefaultPartitionCoalescer implements org.apache.spark.rdd.PartitionCoalescer {
  // not preceding
  // not preceding
  public  class partitionGroupOrdering$ implements scala.math.Ordering<org.apache.spark.rdd.PartitionGroup> {
    public   partitionGroupOrdering$ ()  { throw new RuntimeException(); }
    // not preceding
    public  int compare (org.apache.spark.rdd.PartitionGroup o1, org.apache.spark.rdd.PartitionGroup o2)  { throw new RuntimeException(); }
  }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.DefaultPartitionCoalescer.partitionGroupOrdering$ partitionGroupOrdering ()  { throw new RuntimeException(); }
  // not preceding
  public  double balanceSlack ()  { throw new RuntimeException(); }
  // not preceding
  public   DefaultPartitionCoalescer (double balanceSlack)  { throw new RuntimeException(); }
  // not preceding
  public  scala.util.Random rnd ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.rdd.PartitionGroup> groupArr ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.ArrayBuffer<org.apache.spark.rdd.PartitionGroup>> groupHash ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.Set<org.apache.spark.Partition> initialHash ()  { throw new RuntimeException(); }
  public  boolean noLocality ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> currPrefLocs (org.apache.spark.Partition part, org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<org.apache.spark.rdd.PartitionGroup> getLeastGroupHash (java.lang.String key)  { throw new RuntimeException(); }
  public  boolean addPartToPGroup (org.apache.spark.Partition part, org.apache.spark.rdd.PartitionGroup pgroup)  { throw new RuntimeException(); }
  /**
   * Initializes targetLen partition groups. If there are preferred locations, each group
   * is assigned a preferredLocation. This uses coupon collector to estimate how many
   * preferredLocations it must rotate through until it has seen most of the preferred
   * locations (2 * n log(n))
   * @param targetLen The number of desired partition groups
   * @param partitionLocs (undocumented)
   */
  public  void setupGroups (int targetLen, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  /**
   * Takes a parent RDD partition and decides which of the partition groups to put it in
   * Takes locality into account, but also uses power of 2 choices to load balance
   * It strikes a balance between the two using the balanceSlack variable
   * @param p partition (ball to be thrown)
   * @param balanceSlack determines the trade-off between load-balancing the partitions sizes and
   *                     their locality. e.g., balanceSlack=0.10 means that it allows up to 10%
   *                     imbalance in favor of locality
   * @return partition group (bin to be put in)
   * @param prev (undocumented)
   * @param partitionLocs (undocumented)
   */
  public  org.apache.spark.rdd.PartitionGroup pickBin (org.apache.spark.Partition p, org.apache.spark.rdd.RDD<?> prev, double balanceSlack, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  public  void throwBalls (int maxPartitions, org.apache.spark.rdd.RDD<?> prev, double balanceSlack, org.apache.spark.rdd.DefaultPartitionCoalescer.PartitionLocations partitionLocs)  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.PartitionGroup[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Runs the packing algorithm and returns an array of PartitionGroups that if possible are
   * load balanced and grouped by locality
   * <p>
   * @return array of partition groups
   * @param maxPartitions (undocumented)
   * @param prev (undocumented)
   */
  public  org.apache.spark.rdd.PartitionGroup[] coalesce (int maxPartitions, org.apache.spark.rdd.RDD<?> prev)  { throw new RuntimeException(); }
}
