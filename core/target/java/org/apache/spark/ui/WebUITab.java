package org.apache.spark.ui;
/** Attach a page to this tab. This prepends the page's prefix with the tab's own prefix. */
 abstract class WebUITab {
  // not preceding
  public   WebUITab (org.apache.spark.ui.WebUI parent, java.lang.String prefix)  { throw new RuntimeException(); }
  /** Attach a page to this tab. This prepends the page's prefix with the tab's own prefix. */
  public  void attachPage (org.apache.spark.ui.WebUIPage page)  { throw new RuntimeException(); }
  public  java.lang.String basePath ()  { throw new RuntimeException(); }
  /** Get a list of header tabs from the parent UI. */
  public  scala.collection.Seq<org.apache.spark.ui.WebUITab> headerTabs ()  { throw new RuntimeException(); }
  public  java.lang.String name ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.ui.WebUIPage> pages ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String prefix ()  { throw new RuntimeException(); }
}
