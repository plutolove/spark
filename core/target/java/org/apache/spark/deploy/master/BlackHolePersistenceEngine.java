package org.apache.spark.deploy.master;
/**
 * Returns the persisted data sorted by their respective ids (which implies that they're
 * sorted by time of creation).
 */
  class BlackHolePersistenceEngine extends org.apache.spark.deploy.master.PersistenceEngine {
  // not preceding
  public   BlackHolePersistenceEngine ()  { throw new RuntimeException(); }
  // not preceding
  public  void persist (java.lang.String name, java.lang.Object obj)  { throw new RuntimeException(); }
  public <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String name, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  public  void unpersist (java.lang.String name)  { throw new RuntimeException(); }
}
