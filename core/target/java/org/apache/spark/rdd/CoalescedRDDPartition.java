package org.apache.spark.rdd;
/**
 * Computes the fraction of the parents' partitions containing preferredLocation within
 * their getPreferredLocs.
 * @return locality of this coalesced partition between 0 and 1
 */
  class CoalescedRDDPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  int index ()  { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<?> rdd ()  { throw new RuntimeException(); }
  public  int[] parentsIndices ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> preferredLocation ()  { throw new RuntimeException(); }
  // not preceding
  public   CoalescedRDDPartition (int index, org.apache.spark.rdd.RDD<?> rdd, int[] parentsIndices, scala.Option<java.lang.String> preferredLocation)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.Partition> parents ()  { throw new RuntimeException(); }
  /**
   * Computes the fraction of the parents' partitions containing preferredLocation within
   * their getPreferredLocs.
   * @return locality of this coalesced partition between 0 and 1
   */
  public  double localFraction ()  { throw new RuntimeException(); }
}
