package org.apache.spark.ui;
/** Stop the server behind this web interface. Only valid after bind(). */
 abstract class SparkUITab extends org.apache.spark.ui.WebUITab {
  // not preceding
  public   SparkUITab (org.apache.spark.ui.SparkUI parent, java.lang.String prefix)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String appName ()  { throw new RuntimeException(); }
  public  java.lang.String appSparkVersion ()  { throw new RuntimeException(); }
}
