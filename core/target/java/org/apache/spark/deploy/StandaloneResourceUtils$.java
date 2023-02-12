package org.apache.spark.deploy;
/**
 * A mutable resource information which provides more efficient modification on addresses.
 */
// not preceding
public  class StandaloneResourceUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StandaloneResourceUtils$ MODULE$ = null;
  public   StandaloneResourceUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Option<java.io.File> prepareResourcesFile (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, java.io.File dir)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> toMutable (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> immutableResources)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesDetails (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> usedInfo, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> freeInfo)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesAddresses (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  public  java.lang.String formatResourcesUsed (scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesTotal, scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesUsed)  { throw new RuntimeException(); }
  public  java.lang.String formatResourceRequirements (scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> requirements)  { throw new RuntimeException(); }
}
