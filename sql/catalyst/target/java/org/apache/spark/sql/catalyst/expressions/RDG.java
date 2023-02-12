package org.apache.spark.sql.catalyst.expressions;
/**
 * Record ID within each partition. By being transient, the Random Number Generator is
 * reset every time we serialize and deserialize and initialize it.
 */
public abstract class RDG extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.sql.catalyst.expressions.ExpectsInputTypes, org.apache.spark.sql.catalyst.expressions.Stateful {
  // not preceding
  public   RDG ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.DataType dataType ()  { throw new RuntimeException(); }
  // not preceding
  public final  boolean deterministic ()  { throw new RuntimeException(); }
  protected  void initializeInternal (int partitionIndex)  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.AbstractDataType> inputTypes ()  { throw new RuntimeException(); }
  public  boolean nullable ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.util.random.XORShiftRandom rng ()  { throw new RuntimeException(); }
  // not preceding
  protected  long seed ()  { throw new RuntimeException(); }
}
