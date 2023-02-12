package org.apache.spark;
/**
 * Get the partition's index within its parent RDD
 */
public  interface Partition extends scala.Serializable {
  public  boolean equals (Object other)  ;
  public  int hashCode ()  ;
  /**
   * Get the partition's index within its parent RDD
   * @return (undocumented)
   */
  public  int index ()  ;
}
