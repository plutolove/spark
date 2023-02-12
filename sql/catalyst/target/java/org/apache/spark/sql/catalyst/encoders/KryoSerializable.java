package org.apache.spark.sql.catalyst.encoders;
/** For testing Kryo serialization based encoder. */
public  class KryoSerializable {
  // not preceding
  public   KryoSerializable (int value)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  // not preceding
  public  int hashCode ()  { throw new RuntimeException(); }
  // not preceding
  public  int value ()  { throw new RuntimeException(); }
}
