package org.apache.spark.deploy.history;
/**
 * Throws a halt exception to stop replay if enough data to create the app listing has been
 * read.
 */
  class AppListingListener extends org.apache.spark.scheduler.SparkListener {
  // not preceding
  public   AppListingListener (org.apache.spark.deploy.history.EventLogFileReader reader, org.apache.spark.util.Clock clock, boolean haltEnabled)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.deploy.history.ApplicationInfoWrapper> applicationInfo ()  { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event)  { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event)  { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event)  { throw new RuntimeException(); }
  public  void onOtherEvent (org.apache.spark.scheduler.SparkListenerEvent event)  { throw new RuntimeException(); }
}
