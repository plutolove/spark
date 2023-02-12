package org.apache.spark.sql.execution.exchange;
/**
 * Returns the number of mappers of this shuffle.
 */
public  interface ShuffleExchangeLike {
  /**
   * Returns whether the shuffle partition number can be changed.
   * @return (undocumented)
   */
  public  boolean canChangeNumPartitions ()  ;
  /**
   * Returns the shuffle RDD with specified partition specs.
   * @param partitionSpecs (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.rdd.RDD<?> getShuffleRDD (org.apache.spark.sql.execution.ShufflePartitionSpec[] partitionSpecs)  ;
  /**
   * The asynchronous job that materializes the shuffle.
   * @return (undocumented)
   */
  public  scala.concurrent.Future<org.apache.spark.MapOutputStatistics> mapOutputStatisticsFuture ()  ;
  // not preceding
  public  int numMappers ()  ;
  /**
   * Returns the shuffle partition number.
   * @return (undocumented)
   */
  public  int numPartitions ()  ;
  /**
   * Returns the runtime statistics after shuffle materialization.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics runtimeStatistics ()  ;
}
