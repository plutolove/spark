package org.apache.spark.ui;
/**
 * Create a test SparkContext with the SparkUI enabled.
 * It is safe to <code>get</code> the SparkUI directly from the SparkContext returned here.
 */
public  class UISuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   UISuite ()  { throw new RuntimeException(); }
  public  void closeSocket (java.net.ServerSocket socket)  { throw new RuntimeException(); }
  public  void stopServer (org.apache.spark.ui.ServerInfo info)  { throw new RuntimeException(); }
}
