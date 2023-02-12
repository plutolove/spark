package org.apache.spark.ui;
/** Test servlet that exposes the last request object for GET calls. */
  class TestFilter implements javax.servlet.Filter {
  // not preceding
  public   TestFilter ()  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
  public  void doFilter (javax.servlet.ServletRequest req, javax.servlet.ServletResponse res, javax.servlet.FilterChain chain)  { throw new RuntimeException(); }
  public  void init (javax.servlet.FilterConfig config)  { throw new RuntimeException(); }
}
