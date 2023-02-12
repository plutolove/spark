package org.apache.spark.deploy.worker;
/**
 * Download the user jar into the supplied directory and return its local path.
 * Will throw an exception if there are errors downloading the jar.
 */
public  interface Sleeper {
  // not preceding
  public  void sleep (int seconds)  ;
}
