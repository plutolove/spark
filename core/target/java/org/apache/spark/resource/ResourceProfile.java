package org.apache.spark.resource;
/**
 * (Java-specific) gets a Java Map of resources to TaskResourceRequest
 */
  class ResourceProfile implements scala.Serializable, org.apache.spark.internal.Logging {
  // not preceding
  static public  java.lang.String CPUS ()  { throw new RuntimeException(); }
  static public  java.lang.String CORES ()  { throw new RuntimeException(); }
  static public  java.lang.String MEMORY ()  { throw new RuntimeException(); }
  static public  java.lang.String OVERHEAD_MEM ()  { throw new RuntimeException(); }
  static public  java.lang.String PYSPARK_MEM ()  { throw new RuntimeException(); }
  static public  scala.collection.Seq<java.lang.String> allSupportedExecutorResources ()  { throw new RuntimeException(); }
  static public  int UNKNOWN_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  static public  int DEFAULT_RESOURCE_PROFILE_ID ()  { throw new RuntimeException(); }
  static   int getNextProfileId ()  { throw new RuntimeException(); }
  static   org.apache.spark.resource.ResourceProfile getOrCreateDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   void reInitDefaultProfile (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  static   void clearDefaultProfile ()  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> getCustomTaskResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  static   scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> getCustomExecutorResources (org.apache.spark.resource.ResourceProfile rp)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources ()  { throw new RuntimeException(); }
  // not preceding
  public   ResourceProfile (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResources, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResources)  { throw new RuntimeException(); }
  public  int id ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to TaskResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.TaskResourceRequest> taskResourcesJMap ()  { throw new RuntimeException(); }
  /**
   * (Java-specific) gets a Java Map of resources to ExecutorResourceRequest
   * @return (undocumented)
   */
  public  java.util.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> executorResourcesJMap ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getExecutorCores ()  { throw new RuntimeException(); }
    scala.Option<java.lang.Object> getTaskCpus ()  { throw new RuntimeException(); }
    void setToDefaultProfile ()  { throw new RuntimeException(); }
  public  boolean equals (Object obj)  { throw new RuntimeException(); }
  public  int hashCode ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
