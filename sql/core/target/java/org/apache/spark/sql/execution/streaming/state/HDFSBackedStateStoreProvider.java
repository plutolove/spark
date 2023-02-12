package org.apache.spark.sql.execution.streaming.state;
/** Implementation of {@link StateStore} API which is backed by an HDFS-compatible file system */
  class HDFSBackedStateStoreProvider implements org.apache.spark.sql.execution.streaming.state.StateStoreProvider, org.apache.spark.internal.Logging {
  /** Trait and classes representing the internal state of the store */
  public  class HDFSBackedStateStore implements org.apache.spark.sql.execution.streaming.state.StateStore {
    // not preceding
    // not preceding
    public  class UPDATING {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    public  class UPDATING$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final UPDATING$ MODULE$ = null;
      public   UPDATING$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    public  class COMMITTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    public  class COMMITTED$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final COMMITTED$ MODULE$ = null;
      public   COMMITTED$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    public  class ABORTED {
      static public abstract  boolean canEqual (Object that)  ;
      static public abstract  boolean equals (Object that)  ;
      static public abstract  Object productElement (int n)  ;
      static public abstract  int productArity ()  ;
      static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
      static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
    }
    // not preceding
    // not preceding
    public  class ABORTED$ implements org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.STATE, scala.Product, scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final ABORTED$ MODULE$ = null;
      public   ABORTED$ ()  { throw new RuntimeException(); }
    }
    // not preceding
    public  interface STATE {
    }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.ABORTED$ ABORTED ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.COMMITTED$ COMMITTED ()  { throw new RuntimeException(); }
    // not preceding
    public   HDFSBackedStateStore (long version, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow> mapToUpdate)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.HDFSBackedStateStoreProvider.HDFSBackedStateStore.UPDATING$ UPDATING ()  { throw new RuntimeException(); }
    /** Abort all the updates made on this store. This store will not be usable any more. */
    public  void abort ()  { throw new RuntimeException(); }
    /** Commit all the updates that have been made to the store, and return the new version. */
    public  long commit ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.expressions.UnsafeRow get (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> getRange (scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> start, scala.Option<org.apache.spark.sql.catalyst.expressions.UnsafeRow> end)  { throw new RuntimeException(); }
    /**
     * Whether all updates have been committed
     * @return (undocumented)
     */
    public  boolean hasCommitted ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreId id ()  { throw new RuntimeException(); }
    /**
     * Get an iterator of all the store data.
     * This can be called only after committing all the updates made in the current thread.
     * @return (undocumented)
     */
    public  scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> iterator ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.streaming.state.StateStoreMetrics metrics ()  { throw new RuntimeException(); }
    public  void put (org.apache.spark.sql.catalyst.expressions.UnsafeRow key, org.apache.spark.sql.catalyst.expressions.UnsafeRow value)  { throw new RuntimeException(); }
    public  void remove (org.apache.spark.sql.catalyst.expressions.UnsafeRow key)  { throw new RuntimeException(); }
    public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  long version ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   HDFSBackedStateStoreProvider ()  { throw new RuntimeException(); }
  /**
   * Clean up old snapshots and delta files that are not needed any more. It ensures that last
   * few versions of the store can be recovered from the files, so re-executed RDD operations
   * can re-apply updates on the past versions of the store.
   */
    void cleanup ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  /** Do maintenance backing data files, including creating snapshots and cleaning up old files */
  public  void doMaintenance ()  { throw new RuntimeException(); }
  /** This method is intended to be only used for unit test(s). DO NOT TOUCH ELEMENTS IN MAP! */
    java.util.SortedMap<java.lang.Object, java.util.concurrent.ConcurrentHashMap<org.apache.spark.sql.catalyst.expressions.UnsafeRow, org.apache.spark.sql.catalyst.expressions.UnsafeRow>> getLoadedMaps ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> getMetricsForProvider ()  { throw new RuntimeException(); }
  /** Get the state store for making updates to create a new `version` of the store. */
  public  org.apache.spark.sql.execution.streaming.state.StateStore getStore (long version)  { throw new RuntimeException(); }
  public  void init (org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId, org.apache.spark.sql.types.StructType keySchema, org.apache.spark.sql.types.StructType valueSchema, scala.Option<java.lang.Object> indexOrdinal, org.apache.spark.sql.execution.streaming.state.StateStoreConf storeConf, org.apache.hadoop.conf.Configuration hadoopConf)  { throw new RuntimeException(); }
  /**
   * Get iterator of all the data of the latest version of the store.
   * Note that this will look up the files to determined the latest known version.
   * @return (undocumented)
   */
    scala.collection.Iterator<org.apache.spark.sql.execution.streaming.state.UnsafeRowPair> latestIterator ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.streaming.state.StateStoreId stateStoreId ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.execution.streaming.state.StateStoreCustomMetric> supportedCustomMetrics ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
