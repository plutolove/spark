package org.apache.spark.util;
public  class ExtensionWithConf {
  // not preceding
  public   ExtensionWithConf (org.apache.spark.SparkConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
}
