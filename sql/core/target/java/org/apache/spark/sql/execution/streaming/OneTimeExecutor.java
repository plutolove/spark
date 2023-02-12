package org.apache.spark.sql.execution.streaming;
/**
 * Execute a single batch using <code>batchRunner</code>.
 */
public  class OneTimeExecutor implements org.apache.spark.sql.execution.streaming.TriggerExecutor, scala.Product, scala.Serializable {
  static public abstract  R apply ()  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public   OneTimeExecutor ()  { throw new RuntimeException(); }
  // not preceding
  public  void execute (scala.Function0<java.lang.Object> batchRunner)  { throw new RuntimeException(); }
}
