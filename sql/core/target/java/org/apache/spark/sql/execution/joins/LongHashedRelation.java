package org.apache.spark.sql.execution.joins;
/**
 * Returns an iterator for keys of InternalRow type.
 */
public  class LongHashedRelation implements org.apache.spark.sql.execution.joins.HashedRelation, java.io.Externalizable {
  // not preceding
  static public  org.apache.spark.sql.execution.joins.LongHashedRelation apply (scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> input, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> key, int sizeEstimate, org.apache.spark.memory.TaskMemoryManager taskMemoryManager)  { throw new RuntimeException(); }
  // not preceding
  public   LongHashedRelation (int nFields, org.apache.spark.sql.execution.joins.LongToUnsafeRowMap map)  { throw new RuntimeException(); }
  public   LongHashedRelation ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.joins.LongHashedRelation asReadOnlyCopy ()  { throw new RuntimeException(); }
  public  long estimatedSize ()  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> get (org.apache.spark.sql.catalyst.InternalRow key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getValue (org.apache.spark.sql.catalyst.InternalRow key)  { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> get (long key)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.InternalRow getValue (long key)  { throw new RuntimeException(); }
  public  boolean keyIsUnique ()  { throw new RuntimeException(); }
  public  void close ()  { throw new RuntimeException(); }
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  /**
   * Returns an iterator for keys of InternalRow type.
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> keys ()  { throw new RuntimeException(); }
}
