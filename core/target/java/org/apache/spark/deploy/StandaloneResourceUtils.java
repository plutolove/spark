package org.apache.spark.deploy;
/**
 * A mutable resource information which provides more efficient modification on addresses.
 */
// not preceding
public  class StandaloneResourceUtils {
  // not preceding
  static   class MutableResourceInfo implements scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.HashSet<java.lang.String> addresses ()  { throw new RuntimeException(); }
    // not preceding
    public   MutableResourceInfo (java.lang.String name, scala.collection.mutable.HashSet<java.lang.String> addresses)  { throw new RuntimeException(); }
    public  org.apache.spark.resource.ResourceInformation toResourceInformation ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class MutableResourceInfo$ extends scala.runtime.AbstractFunction2<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MutableResourceInfo$ MODULE$ = null;
    public   MutableResourceInfo$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class StandaloneResourceAllocation implements scala.Product, scala.Serializable {
    // not preceding
    public  int pid ()  { throw new RuntimeException(); }
    public  scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> allocations ()  { throw new RuntimeException(); }
    // not preceding
    public   StandaloneResourceAllocation (int pid, scala.collection.Seq<org.apache.spark.resource.ResourceAllocation> allocations)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> toResourceInformationMap ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class StandaloneResourceAllocation$ extends scala.runtime.AbstractFunction2<java.lang.Object, scala.collection.Seq<org.apache.spark.resource.ResourceAllocation>, org.apache.spark.deploy.StandaloneResourceUtils.StandaloneResourceAllocation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StandaloneResourceAllocation$ MODULE$ = null;
    public   StandaloneResourceAllocation$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.Option<java.io.File> prepareResourcesFile (java.lang.String componentName, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources, java.io.File dir)  { throw new RuntimeException(); }
  static public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.deploy.StandaloneResourceUtils.MutableResourceInfo> toMutable (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> immutableResources)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesDetails (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> usedInfo, scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> freeInfo)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesAddresses (scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourcesUsed (scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesTotal, scala.collection.immutable.Map<java.lang.String, java.lang.Object> resourcesUsed)  { throw new RuntimeException(); }
  static public  java.lang.String formatResourceRequirements (scala.collection.Seq<org.apache.spark.resource.ResourceRequirement> requirements)  { throw new RuntimeException(); }
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
}
