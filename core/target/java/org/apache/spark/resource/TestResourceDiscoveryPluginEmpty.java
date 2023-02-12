package org.apache.spark.resource;
public  class TestResourceDiscoveryPluginEmpty implements org.apache.spark.api.resource.ResourceDiscoveryPlugin {
  // not preceding
  public   TestResourceDiscoveryPluginEmpty ()  { throw new RuntimeException(); }
  // not preceding
  public  java.util.Optional<org.apache.spark.resource.ResourceInformation> discoverResource (org.apache.spark.resource.ResourceRequest request, org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
}
