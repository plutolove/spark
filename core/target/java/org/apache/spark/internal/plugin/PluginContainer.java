package org.apache.spark.internal.plugin;
public abstract class PluginContainer {
  // not preceding
  static public  java.lang.String EXTRA_CONF_PREFIX ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.internal.plugin.PluginContainer> apply (org.apache.spark.SparkContext sc, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.internal.plugin.PluginContainer> apply (org.apache.spark.SparkEnv env, java.util.Map<java.lang.String, org.apache.spark.resource.ResourceInformation> resources)  { throw new RuntimeException(); }
  // not preceding
  public   PluginContainer ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  void shutdown ()  ;
  public abstract  void registerMetrics (java.lang.String appId)  ;
}
