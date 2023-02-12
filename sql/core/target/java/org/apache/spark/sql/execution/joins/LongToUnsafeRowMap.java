package org.apache.spark.sql.execution.joins;
/**
 * Returns whether all the keys are unique.
 */
 final class LongToUnsafeRowMap extends org.apache.spark.memory.MemoryConsumer implements java.io.Externalizable, com.esotericsoftware.kryo.KryoSerializable {
  // not preceding
  public   LongToUnsafeRowMap (org.apache.spark.memory.TaskMemoryManager mm, int capacity)  { throw new RuntimeException(); }
  public   LongToUnsafeRowMap ()  { throw new RuntimeException(); }
  /**
   * Appends the key and row into this map.
   * @param key (undocumented)
   * @param row (undocumented)
   */
  public  void append (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow row)  { throw new RuntimeException(); }
  /**
   * Free all the memory acquired by this map.
   */
  public  void free ()  { throw new RuntimeException(); }
  /**
   * Returns an iterator for all the values for the given key, or null if no value found.
   * @param key (undocumented)
   * @param resultRow (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.UnsafeRow> get (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Returns total memory consumption.
   * @return (undocumented)
   */
  public  long getTotalMemoryConsumption ()  { throw new RuntimeException(); }
  /**
   * Returns the single UnsafeRow for given key, or null if not found.
   * @param key (undocumented)
   * @param resultRow (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.UnsafeRow getValue (long key, org.apache.spark.sql.catalyst.expressions.UnsafeRow resultRow)  { throw new RuntimeException(); }
  /**
   * Returns whether all the keys are unique.
   * @return (undocumented)
   */
  public  boolean keyIsUnique ()  { throw new RuntimeException(); }
  /**
   * Builds an iterator on a sparse array.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> keys ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.memory.TaskMemoryManager mm ()  { throw new RuntimeException(); }
  /**
   * Try to turn the map into dense mode, which is faster to probe.
   */
  public  void optimize ()  { throw new RuntimeException(); }
  public  void read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input in)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  long spill (long size, org.apache.spark.memory.MemoryConsumer trigger)  { throw new RuntimeException(); }
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output out)  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput output)  { throw new RuntimeException(); }
}
