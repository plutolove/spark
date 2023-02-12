package org.apache.spark.ui;
  class SparkUICssErrorHandler extends com.gargoylesoftware.htmlunit.DefaultCssErrorHandler {
  // not preceding
  public   SparkUICssErrorHandler ()  { throw new RuntimeException(); }
  public  void error (org.w3c.css.sac.CSSParseException e)  { throw new RuntimeException(); }
  public  void fatalError (org.w3c.css.sac.CSSParseException e)  { throw new RuntimeException(); }
  public  void warning (org.w3c.css.sac.CSSParseException e)  { throw new RuntimeException(); }
}
