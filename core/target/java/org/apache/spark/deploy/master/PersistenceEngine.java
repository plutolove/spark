package org.apache.spark.deploy.master;
/**
 * Defines how the object is serialized and persisted. Implementation will
 * depend on the store used.
 */
public abstract class PersistenceEngine {
  // not preceding
  public   PersistenceEngine ()  { throw new RuntimeException(); }
  public final  void addApplication (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  public final  void addDriver (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  public final  void addWorker (org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void persist (java.lang.String name, java.lang.Object obj)  ;
  /**
   * Gives all objects, matching a prefix. This defines how objects are
   * read/deserialized back.
   * @param prefix (undocumented)
   * @param evidence$1 (undocumented)
   * @return (undocumented)
   */
  public abstract <T extends java.lang.Object> scala.collection.Seq<T> read (java.lang.String prefix, scala.reflect.ClassTag<T> evidence$1)  ;
  /**
   * Returns the persisted data sorted by their respective ids (which implies that they're
   * sorted by time of creation).
   * @param rpcEnv (undocumented)
   * @return (undocumented)
   */
  public final  scala.Tuple3<scala.collection.Seq<org.apache.spark.deploy.master.ApplicationInfo>, scala.collection.Seq<org.apache.spark.deploy.master.DriverInfo>, scala.collection.Seq<org.apache.spark.deploy.master.WorkerInfo>> readPersistedData (org.apache.spark.rpc.RpcEnv rpcEnv)  { throw new RuntimeException(); }
  public final  void removeApplication (org.apache.spark.deploy.master.ApplicationInfo app)  { throw new RuntimeException(); }
  public final  void removeDriver (org.apache.spark.deploy.master.DriverInfo driver)  { throw new RuntimeException(); }
  public final  void removeWorker (org.apache.spark.deploy.master.WorkerInfo worker)  { throw new RuntimeException(); }
  /**
   * Defines how the object referred by its name is removed from the store.
   * @param name (undocumented)
   */
  public abstract  void unpersist (java.lang.String name)  ;
}
