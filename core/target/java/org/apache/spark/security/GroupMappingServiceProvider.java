package org.apache.spark.security;
/**
 * Get the groups the user belongs to.
 * param:  userName User's Name
 * @return set of groups that the user belongs to. Empty in case of an invalid user.
 */
public  interface GroupMappingServiceProvider {
  // not preceding
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String userName)  ;
}
