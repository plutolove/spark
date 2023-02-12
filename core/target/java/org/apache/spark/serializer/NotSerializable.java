package org.apache.spark.serializer;
public  class NotSerializable {
  // not preceding
  public   NotSerializable ()  { throw new RuntimeException(); }
}
