package org.apache.spark.resource;
/**
 * Specify heap memory. The value specified will be converted to MiB.
 * <p>
 * param:  amount Amount of memory. In the same format as JVM memory strings (e.g. 512m, 2g).
 *               Default unit is MiB if not specified.
 */
  class ExecutorResourceRequests implements scala.Serializable {
  // not preceding
  public   ExecutorResourceRequests ()  { throw new RuntimeException(); }
  /**
   * Specify number of cores per Executor.
   * <p>
   * @param amount Number of cores to allocate per Executor.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.ExecutorResourceRequests cores (int amount)  { throw new RuntimeException(); }
  /**
   * Specify heap memory. The value specified will be converted to MiB.
   * <p>
   * @param amount Amount of memory. In the same format as JVM memory strings (e.g. 512m, 2g).
   *               Default unit is MiB if not specified.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.ExecutorResourceRequests memory (java.lang.String amount)  { throw new RuntimeException(); }
  /**
   * Specify overhead memory. The value specified will be converted to MiB.
   * <p>
   * @param amount Amount of memory. In the same format as JVM memory strings (e.g. 512m, 2g).
   *               Default unit is MiB if not specified.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.ExecutorResourceRequests memoryOverhead (java.lang.String amount)  { throw new RuntimeException(); }
  /**
   * Specify pyspark memory. The value specified will be converted to MiB.
   * <p>
   * @param amount Amount of memory. In the same format as JVM memory strings (e.g. 512m, 2g).
   *               Default unit is MiB if not specified.
   * @return (undocumented)
   */
  public  org.apache.spark.resource.ExecutorResourceRequests pysparkMemory (java.lang.String amount)  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.resource.ExecutorResourceRequest> requests ()  { throw new RuntimeException(); }
  /**
   *  Amount of a particular custom resource(GPU, FPGA, etc) to use. The resource names supported
   *  correspond to the regular Spark configs with the prefix removed. For instance, resources
   *  like GPUs are gpu (spark configs spark.executor.resource.gpu.*). If you pass in a resource
   *  that the cluster manager doesn't support the result is undefined, it may error or may just
   *  be ignored.
   * <p>
   * @param resourceName Name of the resource.
   * @param amount amount of that resource per executor to use.
   * @param discoveryScript Optional script used to discover the resources. This is required on
   *                        some cluster managers that don't tell Spark the addresses of
   *                        the resources allocated. The script runs on Executors startup to
   *                        of the resources available.
   * @param vendor Optional vendor, required for some cluster managers
   * @return (undocumented)
   */
  public  org.apache.spark.resource.ExecutorResourceRequests resource (java.lang.String resourceName, long amount, java.lang.String discoveryScript, java.lang.String vendor)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
