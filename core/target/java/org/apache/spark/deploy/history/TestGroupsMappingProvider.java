package org.apache.spark.deploy.history;
/**
 * Asks the provider to check for logs and calls a function to perform checks on the updated
 * app list. Example:
 * <p>
 *     updateAndCheck(provider) { list =&gt;
 *       // asserts
 *     }
 */
public  class TestGroupsMappingProvider implements org.apache.spark.security.GroupMappingServiceProvider {
  // not preceding
  public   TestGroupsMappingProvider ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> getGroups (java.lang.String username)  { throw new RuntimeException(); }
}
