package org.apache.spark.ml.util;
/**
 * A small wrapper that contains an optional <code>Instrumentation</code> object.
 * Provide some log methods, if the containing <code>Instrumentation</code> object is defined,
 * will log via it, otherwise will log via common logger.
 */
  class OptionalInstrumentation implements org.apache.spark.internal.Logging {
  // not preceding
  static public  org.apache.spark.ml.util.OptionalInstrumentation create (org.apache.spark.ml.util.Instrumentation instr)  { throw new RuntimeException(); }
  /**
   * Creates an <code>OptionalInstrumentation</code> object from a <code>Class</code> object.
   * The created <code>OptionalInstrumentation</code> object will log messages via common logger and use the
   * specified class name as logger name.
   * @param clazz (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.ml.util.OptionalInstrumentation create (java.lang.Class<?> clazz)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.ml.util.Instrumentation> instrumentation ()  { throw new RuntimeException(); }
  public  java.lang.String className ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String logName ()  { throw new RuntimeException(); }
  public  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  public  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  public  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
}
