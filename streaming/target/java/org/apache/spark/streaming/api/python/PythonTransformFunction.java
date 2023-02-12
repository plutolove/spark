package org.apache.spark.streaming.api.python;
/**
 * Get the failure, if any, in the last call to <code>call</code>.
 * <p>
 * @return the failure message if there was a failure, or <code>null</code> if there was no failure.
 */
public  interface PythonTransformFunction {
  // not preceding
  public  org.apache.spark.api.java.JavaRDD<byte[]> call (long time, java.util.List<?> rdds)  ;
  /**
   * Get the failure, if any, in the last call to <code>call</code>.
   * <p>
   * @return the failure message if there was a failure, or <code>null</code> if there was no failure.
   */
  public  java.lang.String getLastFailure ()  ;
}
