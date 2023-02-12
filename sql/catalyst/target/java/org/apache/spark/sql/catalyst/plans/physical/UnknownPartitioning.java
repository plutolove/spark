package org.apache.spark.sql.catalyst.plans.physical;
/**
 * The actual method that defines whether this {@link Partitioning} can satisfy the given
 * {@link Distribution}, after the <code>numPartitions</code> check.
 * <p>
 * By default a {@link Partitioning} can satisfy {@link UnspecifiedDistribution}, and {@link AllTuples} if
 * the {@link Partitioning} only have one partition. Implementations can also overwrite this method
 * with special logic.
 */
public  class UnknownPartitioning implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int numPartitions ()  { throw new RuntimeException(); }
  // not preceding
  public   UnknownPartitioning (int numPartitions)  { throw new RuntimeException(); }
}
