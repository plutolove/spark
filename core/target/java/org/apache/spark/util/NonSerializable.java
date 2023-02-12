package org.apache.spark.util;
public  class NonSerializable {
  // not preceding
  public  int id ()  { throw new RuntimeException(); }
  // not preceding
  public   NonSerializable (int id)  { throw new RuntimeException(); }
  // not preceding
  public  int hashCode ()  { throw new RuntimeException(); }
  public  boolean equals (Object other)  { throw new RuntimeException(); }
}
