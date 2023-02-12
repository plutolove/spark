package org.apache.spark.internal.plugin;
public  class TestDriverPlugin implements org.apache.spark.api.plugin.DriverPlugin {
  // not preceding
  public   TestDriverPlugin ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.Map<java.lang.String, java.lang.String> init (org.apache.spark.SparkContext sc, org.apache.spark.api.plugin.PluginContext ctx)  { throw new RuntimeException(); }
  public  java.lang.Object receive (java.lang.Object msg)  { throw new RuntimeException(); }
  public  void registerMetrics (java.lang.String appId, org.apache.spark.api.plugin.PluginContext ctx)  { throw new RuntimeException(); }
}
