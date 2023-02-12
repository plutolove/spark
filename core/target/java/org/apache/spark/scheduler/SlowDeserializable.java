package org.apache.spark.scheduler;
public  class SlowDeserializable implements java.io.Externalizable {
  // not preceding
  public   SlowDeserializable ()  { throw new RuntimeException(); }
  public  void readExternal (java.io.ObjectInput in)  { throw new RuntimeException(); }
  public  void use ()  { throw new RuntimeException(); }
  // not preceding
  public  void writeExternal (java.io.ObjectOutput out)  { throw new RuntimeException(); }
}
