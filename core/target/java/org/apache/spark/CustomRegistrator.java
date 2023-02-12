package org.apache.spark;
public  class CustomRegistrator implements org.apache.spark.serializer.KryoRegistrator {
  // not preceding
  public   CustomRegistrator ()  { throw new RuntimeException(); }
  // not preceding
  public  void registerClasses (com.esotericsoftware.kryo.Kryo kryo)  { throw new RuntimeException(); }
}
