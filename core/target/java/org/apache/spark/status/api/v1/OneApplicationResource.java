package org.apache.spark.status.api.v1;
/**
 * This method needs to be last, otherwise it clashes with the paths for the above methods
 * and causes JAX-RS to not find things.
 */
  class OneApplicationResource extends org.apache.spark.status.api.v1.AbstractApplicationResource {
  // not preceding
  public   OneApplicationResource ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.status.api.v1.ApplicationInfo getApp ()  { throw new RuntimeException(); }
}
