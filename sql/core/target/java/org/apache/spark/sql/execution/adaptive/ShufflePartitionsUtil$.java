package org.apache.spark.sql.execution.adaptive;
/**
 * Coalesce the partitions from multiple shuffles. This method assumes that all the shuffles
 * have the same number of partitions, and the partitions of same index will be read together
 * by one task.
 * <p>
 * The strategy used to determine the number of coalesced partitions is described as follows.
 * To determine the number of coalesced partitions, we have a target size for a coalesced
 * partition. Once we have size statistics of all shuffle partitions, we will do
 * a pass of those statistics and pack shuffle partitions with continuous indices to a single
 * coalesced partition until adding another shuffle partition would cause the size of a
 * coalesced partition to be greater than the target size.
 * <p>
 * For example, we have two shuffles with the following partition size statistics:
 *  - shuffle 1 (5 partitions): [100 MiB, 20 MiB, 100 MiB, 10MiB, 30 MiB]
 *  - shuffle 2 (5 partitions): [10 MiB,  10 MiB, 70 MiB,  5 MiB, 5 MiB]
 * Assuming the target size is 128 MiB, we will have 4 coalesced partitions, which are:
 *  - coalesced partition 0: shuffle partition 0 (size 110 MiB)
 *  - coalesced partition 1: shuffle partition 1 (size 30 MiB)
 *  - coalesced partition 2: shuffle partition 2 (size 170 MiB)
 *  - coalesced partition 3: shuffle partition 3 and 4 (size 50 MiB)
 * <p>
 *  @return A sequence of {@link CoalescedPartitionSpec}s. For example, if partitions [0, 1, 2, 3, 4]
 *          split at indices [0, 2, 3], the returned partition specs will be:
 *          CoalescedPartitionSpec(0, 2), CoalescedPartitionSpec(2, 3) and
 *          CoalescedPartitionSpec(3, 5).
 */
// not preceding
public  class ShufflePartitionsUtil$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ShufflePartitionsUtil$ MODULE$ = null;
  public   ShufflePartitionsUtil$ ()  { throw new RuntimeException(); }
  // not preceding
  public final  double SMALL_PARTITION_FACTOR ()  { throw new RuntimeException(); }
  public final  double MERGED_PARTITION_FACTOR ()  { throw new RuntimeException(); }
  /**
   * Coalesce the partitions from multiple shuffles. This method assumes that all the shuffles
   * have the same number of partitions, and the partitions of same index will be read together
   * by one task.
   * <p>
   * The strategy used to determine the number of coalesced partitions is described as follows.
   * To determine the number of coalesced partitions, we have a target size for a coalesced
   * partition. Once we have size statistics of all shuffle partitions, we will do
   * a pass of those statistics and pack shuffle partitions with continuous indices to a single
   * coalesced partition until adding another shuffle partition would cause the size of a
   * coalesced partition to be greater than the target size.
   * <p>
   * For example, we have two shuffles with the following partition size statistics:
   *  - shuffle 1 (5 partitions): [100 MiB, 20 MiB, 100 MiB, 10MiB, 30 MiB]
   *  - shuffle 2 (5 partitions): [10 MiB,  10 MiB, 70 MiB,  5 MiB, 5 MiB]
   * Assuming the target size is 128 MiB, we will have 4 coalesced partitions, which are:
   *  - coalesced partition 0: shuffle partition 0 (size 110 MiB)
   *  - coalesced partition 1: shuffle partition 1 (size 30 MiB)
   *  - coalesced partition 2: shuffle partition 2 (size 170 MiB)
   *  - coalesced partition 3: shuffle partition 3 and 4 (size 50 MiB)
   * <p>
   *  @return A sequence of {@link CoalescedPartitionSpec}s. For example, if partitions [0, 1, 2, 3, 4]
   *          split at indices [0, 2, 3], the returned partition specs will be:
   *          CoalescedPartitionSpec(0, 2), CoalescedPartitionSpec(2, 3) and
   *          CoalescedPartitionSpec(3, 5).
   * @param mapOutputStatistics (undocumented)
   * @param advisoryTargetSize (undocumented)
   * @param minNumPartitions (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.execution.ShufflePartitionSpec> coalescePartitions (org.apache.spark.MapOutputStatistics[] mapOutputStatistics, long advisoryTargetSize, int minNumPartitions)  { throw new RuntimeException(); }
  /**
   * Given a list of size, return an array of indices to split the list into multiple partitions,
   * so that the size sum of each partition is close to the target size. Each index indicates the
   * start of a partition.
   * @param sizes (undocumented)
   * @param targetSize (undocumented)
   * @return (undocumented)
   */
  public  int[] splitSizeListByTargetSize (scala.collection.Seq<java.lang.Object> sizes, long targetSize)  { throw new RuntimeException(); }
}