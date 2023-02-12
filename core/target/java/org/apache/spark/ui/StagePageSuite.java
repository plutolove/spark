package org.apache.spark.ui;
/**
 * Render a stage page started with the given conf and return the HTML.
 * This also runs a dummy stage to populate the page with useful content.
 */
public  class StagePageSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext {
  // not preceding
  public   StagePageSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
