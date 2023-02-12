package org.apache.spark.ui;
  class DelegatingServletContextHandler {
  // not preceding
  public   DelegatingServletContextHandler (org.eclipse.jetty.servlet.ServletContextHandler handler)  { throw new RuntimeException(); }
  public  void addFilter (java.lang.String filterName, java.lang.String className, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams)  { throw new RuntimeException(); }
  public  int filterCount ()  { throw new RuntimeException(); }
  public  java.lang.String getContextPath ()  { throw new RuntimeException(); }
  // not preceding
  public  void prependFilterMapping (java.lang.String filterName, java.lang.String spec, java.util.EnumSet<javax.servlet.DispatcherType> types)  { throw new RuntimeException(); }
}
