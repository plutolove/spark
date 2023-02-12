package org.apache.spark.shuffle;
/** Read the combined key-values for this reduce task */
public  interface ShuffleReader<K extends java.lang.Object, C extends java.lang.Object> {
  /** Read the combined key-values for this reduce task */
  public  scala.collection.Iterator<scala.Product2<K, C>> read ()  ;
}
