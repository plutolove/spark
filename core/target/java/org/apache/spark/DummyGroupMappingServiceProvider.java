package org.apache.spark;
public  class DummyGroupMappingServiceProvider implements org.apache.spark.security.GroupMappingServiceProvider {
  // not preceding
  public   DummyGroupMappingServiceProvider ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String username)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Set<java.lang.String> userGroups ()  { throw new RuntimeException(); }
}
