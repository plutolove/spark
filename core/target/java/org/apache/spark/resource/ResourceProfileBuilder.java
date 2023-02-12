package org.apache.spark.resource;
/**
 * (Java-specific) gets a Java Map of resources to TaskResourceRequest
 */
  class ResourceProfileBuilder {
  // not preceding
  public   ResourceProfileBuilder ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfile build ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder clearExecutorResourceRequests ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder clearTaskResourceRequests ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to ExecutorResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResourcesJMap ()  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder require (org.apache.spark.resource.ExecutorResourceRequests requests)  { throw new RuntimeException(); }
  public  org.apache.spark.resource.ResourceProfileBuilder require (org.apache.spark.resource.TaskResourceRequests requests)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to TaskResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResourcesJMap ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
