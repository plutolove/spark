package org.apache.spark.status.api.v1;
/**
 * Runs some code with the current SparkUI instance for the app / attempt.
 * <p>
 * @throws java.util.NoSuchElementException If the app / attempt pair does not exist.
 */
public  interface UIRoot {
  public  scala.Option<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfo (java.lang.String appId)  ;
  public  scala.collection.Iterator<org.apache.spark.status.api.v1.ApplicationInfo> getApplicationInfoList ()  ;
  public  org.apache.spark.SecurityManager securityManager ()  ;
  /**
   * Runs some code with the current SparkUI instance for the app / attempt.
   * <p>
   * @throws java.util.NoSuchElementException If the app / attempt pair does not exist.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param fn (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T withSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, scala.Function1<org.apache.spark.ui.SparkUI, T> fn)  ;
  /**
   * Write the event logs for the given app to the <code>ZipOutputStream</code> instance. If attemptId is
   * <code>None</code>, event logs for all attempts of this application will be written out.
   * @param appId (undocumented)
   * @param attemptId (undocumented)
   * @param zipStream (undocumented)
   */
  public  void writeEventLogs (java.lang.String appId, scala.Option<java.lang.String> attemptId, java.util.zip.ZipOutputStream zipStream)  ;
}
