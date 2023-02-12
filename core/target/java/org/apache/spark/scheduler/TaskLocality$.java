package org.apache.spark.scheduler;
// not preceding
public  class TaskLocality$ extends scala.Enumeration {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskLocality$ MODULE$ = null;
  public   TaskLocality$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.Enumeration.Value PROCESS_LOCAL ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value NODE_LOCAL ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value NO_PREF ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value RACK_LOCAL ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value ANY ()  { throw new RuntimeException(); }
  public  boolean isAllowed (scala.Enumeration.Value constraint, scala.Enumeration.Value condition)  { throw new RuntimeException(); }
}
