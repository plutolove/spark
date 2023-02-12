package org.apache.spark;
public  class NotSerializableClass {
  // not preceding
  public   NotSerializableClass ()  { throw new RuntimeException(); }
}
