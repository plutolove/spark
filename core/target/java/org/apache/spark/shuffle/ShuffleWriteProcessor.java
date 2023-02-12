package org.apache.spark.shuffle;
/**
 * Create a {@link ShuffleWriteMetricsReporter} from the task context. As the reporter is a
 * per-row operator, here need a careful consideration on performance.
 */
  class ShuffleWriteProcessor implements scala.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  public   ShuffleWriteProcessor ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.shuffle.ShuffleWriteMetricsReporter createMetricsReporter (org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  /**
   * The write process for particular partition, it controls the life circle of {@link ShuffleWriter}
   * get from {@link ShuffleManager} and triggers rdd compute, finally return the {@link MapStatus} for
   * this task.
   * @param rdd (undocumented)
   * @param dep (undocumented)
   * @param mapId (undocumented)
   * @param context (undocumented)
   * @param partition (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.scheduler.MapStatus write (org.apache.spark.rdd.RDD<?> rdd, org.apache.spark.ShuffleDependency<?, ?, ?> dep, long mapId, org.apache.spark.TaskContext context, org.apache.spark.Partition partition)  { throw new RuntimeException(); }
}
