package org.apache.spark.sql.internal;
/**
 * Helper method to create an instance of {@link T} using a single-arg constructor that
 * accepts an {@link Arg1} and an {@link Arg2}.
 */
// not preceding
public  class SharedState$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SharedState$ MODULE$ = null;
  public   SharedState$ ()  { throw new RuntimeException(); }
  /**
   * Determine the warehouse path using the key <code>spark.sql.warehouse.dir</code> in the {@link SparkConf}, and
   * <code>hive.metastore.warehouse.dir</code> in hadoop {@link Configuration}.
   * The priority order is:
   * s.s.w.d in spark conf (user specified)
   *   > h.m.w.d in hadoop conf (user specified)
   *   > s.s.w.d in spark conf (default)
   * <p>
   * After resolved, the final value will be application wide reachable in the sparkConf and
   * hadoopConf from {@link SparkContext}.
   * <p>
   * @param sparkConf (undocumented)
   * @param hadoopConf (undocumented)
   */
  public  void resolveWarehousePath (org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
}
