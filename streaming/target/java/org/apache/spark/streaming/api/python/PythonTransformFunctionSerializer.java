package org.apache.spark.streaming.api.python;
/**
 * Get the failure, if any, in the last call to <code>dumps</code> or <code>loads</code>.
 * <p>
 * @return the failure message if there was a failure, or <code>null</code> if there was no failure.
 */
public  interface PythonTransformFunctionSerializer {
  // not preceding
  public  byte[] dumps (java.lang.String id)  ;
  public  org.apache.spark.streaming.api.python.PythonTransformFunction loads (byte[] bytes)  ;
  /**
   * Get the failure, if any, in the last call to <code>dumps</code> or <code>loads</code>.
   * <p>
   * @return the failure message if there was a failure, or <code>null</code> if there was no failure.
   */
  public  java.lang.String getLastFailure ()  ;
}
