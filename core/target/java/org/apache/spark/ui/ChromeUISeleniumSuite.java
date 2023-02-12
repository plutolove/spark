package org.apache.spark.ui;
/**
 * Selenium tests for the Spark Web UI with Chrome.
 */
public  class ChromeUISeleniumSuite extends org.apache.spark.ui.RealBrowserUISeleniumSuite {
  // not preceding
  public   ChromeUISeleniumSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.openqa.selenium.WebDriver webDriver ()  { throw new RuntimeException(); }
}
