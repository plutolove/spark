package org.apache.spark.benchmark;
/**
 * Object available to benchmark code to control timing e.g. to exclude set-up time.
 * <p>
 * param:  iteration specifies this is the nth iteration of running the benchmark case
 */
// not preceding
public  class Benchmark$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Benchmark$ MODULE$ = null;
  public   Benchmark$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String getProcessorName ()  { throw new RuntimeException(); }
  /**
   * This should return a user helpful JVM &amp; OS information.
   * This should return something like
   * "OpenJDK 64-Bit Server VM 1.8.0_65-b17 on Linux 4.1.13-100.fc21.x86_64"
   * @return (undocumented)
   */
  public  java.lang.String getJVMOSInfo ()  { throw new RuntimeException(); }
}
