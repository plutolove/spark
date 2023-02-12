package org.apache.spark.util;
public  class ExtensionWithError {
  // not preceding
  public   ExtensionWithError ()  { throw new RuntimeException(); }
}
