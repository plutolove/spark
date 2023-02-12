package org.apache.spark.sql.catalyst.plans.physical;
/**
 * Returns true if any <code>partitioning</code> of this collection satisfies the given
 * {@link Distribution}.
 */
public  class PartitioningCollection extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.plans.physical.Partitioning, org.apache.spark.sql.catalyst.expressions.Unevaluable, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Partitioning> partitionings ()  { throw new RuntimeException(); }
  // not preceding
  public   PartitioningCollection (scala.collection.Seq<org.apache.spark.sql.catalyst.plans.physical.Partitioning> partitionings)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  public  int numPartitions ()  { throw new RuntimeException(); }
  /**
   * Returns true if any <code>partitioning</code> of this collection satisfies the given
   * {@link Distribution}.
   * @param required (undocumented)
   * @return (undocumented)
   */
  public  boolean satisfies0 (org.apache.spark.sql.catalyst.plans.physical.Distribution required)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
