package org.apache.spark.internal.plugin;
public  class TestExecutorPlugin implements org.apache.spark.api.plugin.ExecutorPlugin {
  // not preceding
  public   TestExecutorPlugin ()  { throw new RuntimeException(); }
  // not preceding
  public  void init (org.apache.spark.api.plugin.PluginContext ctx, java.util.Map<java.lang.String, java.lang.String> extraConf)  { throw new RuntimeException(); }
}
