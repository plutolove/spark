package org.apache.spark.deploy.worker;
/**
 * Build a ProcessBuilder based on the given parameters.
 * The <code>env</code> argument is exposed for testing.
 */
// not preceding
public  class CommandUtils$ implements org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CommandUtils$ MODULE$ = null;
  public   CommandUtils$ ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.ProcessBuilder buildProcessBuilder (org.apache.spark.deploy.Command command, org.apache.spark.SecurityManager securityMgr, int memory, java.lang.String sparkHome, scala.Function1<java.lang.String, java.lang.String> substituteArguments, scala.collection.Seq<java.lang.String> classPaths, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  /** Spawn a thread that will redirect a given stream to a file */
  public  void redirectStream (java.io.InputStream in, java.io.File file)  { throw new RuntimeException(); }
}
