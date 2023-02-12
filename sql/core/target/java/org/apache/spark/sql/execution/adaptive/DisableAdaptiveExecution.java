package org.apache.spark.sql.execution.adaptive;
/**
 * Test with this tag will be ignored if the test suite extends <code>EnableAdaptiveExecutionSuite</code>.
 * Otherwise, it will be executed with adaptive execution disabled.
 */
public  class DisableAdaptiveExecution extends org.scalatest.Tag implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String reason ()  { throw new RuntimeException(); }
  // not preceding
  public   DisableAdaptiveExecution (java.lang.String reason)  { throw new RuntimeException(); }
}
