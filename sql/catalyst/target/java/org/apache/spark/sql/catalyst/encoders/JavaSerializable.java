package org.apache.spark.sql.catalyst.encoders;
/** For testing Java serialization based encoder. */
public  class JavaSerializable implements scala.Serializable {
  // not preceding
  public   JavaSerializable (int value)  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
  // not preceding
  public  int hashCode ()  { throw new RuntimeException(); }
  // not preceding
  public  int value ()  { throw new RuntimeException(); }
}
