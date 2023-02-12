package org.apache.spark.deploy;
/**
 * Print usage and exit JVM with the given exit code.
 */
  class ClientArguments {
  // not preceding
  static public  int DEFAULT_CORES ()  { throw new RuntimeException(); }
  static public  int DEFAULT_MEMORY ()  { throw new RuntimeException(); }
  static public  boolean DEFAULT_SUPERVISE ()  { throw new RuntimeException(); }
  static public  boolean isValidJarUrl (java.lang.String s)  { throw new RuntimeException(); }
  // not preceding
  public   ClientArguments (java.lang.String[] args)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String cmd ()  { throw new RuntimeException(); }
  public  org.apache.log4j.Level logLevel ()  { throw new RuntimeException(); }
  public  java.lang.String[] masters ()  { throw new RuntimeException(); }
  public  java.lang.String jarUrl ()  { throw new RuntimeException(); }
  public  java.lang.String mainClass ()  { throw new RuntimeException(); }
  public  boolean supervise ()  { throw new RuntimeException(); }
  public  int memory ()  { throw new RuntimeException(); }
  public  int cores ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> driverOptions ()  { throw new RuntimeException(); }
  public  java.lang.String driverId ()  { throw new RuntimeException(); }
}
