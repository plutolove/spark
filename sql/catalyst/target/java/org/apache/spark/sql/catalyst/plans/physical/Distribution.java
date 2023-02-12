package org.apache.spark.sql.catalyst.plans.physical;
/**
 * The required number of partitions for this distribution. If it's None, then any number of
 * partitions is allowed for this distribution.
 */
public  interface Distribution {
  /**
   * Creates a default partitioning for this distribution, which can satisfy this distribution while
   * matching the given number of partitions.
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning createPartitioning (int numPartitions)  ;
  // not preceding
  public  scala.Option<java.lang.Object> requiredNumPartitions ()  ;
}
