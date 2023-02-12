package org.apache.spark.resource;
/**
 * (Java-specific) gets a Java Map of resources to ExecutorResourceRequest
 */
// not preceding
public  class ResourceProfile$ implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ResourceProfile$ MODULE$ = null;
  public   ResourceProfile$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String CPUS ()  { throw new RuntimeException(); }
  public  java.lang.String CORES ()  { throw new RuntimeException(); }
  public  java.lang.String MEMORY ()  { throw new RuntimeException(); }
  public  java.lang.String OVERHEAD_MEM ()  { throw new RuntimeException(); }
  public  java.lang.String PYSPARK_MEM ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> allSupportedExecutorResources ()  { throw new RuntimeException(); }
  public  int UNKNOWN_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  public  int DEFAULT_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
    int getNextProfileId ()  { throw new RuntimeException(); }
    org.apache.spark.resource.ResourceProfile getOrCreateDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    void reInitDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
    void clearDefaultProfile ()  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> getCustomTaskResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
    scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> getCustomExecutorResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
}
