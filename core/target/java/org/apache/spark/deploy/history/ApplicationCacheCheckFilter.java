package org.apache.spark.deploy.history;
/**
 * Filter the request.
 * Either the caller is given a 302 redirect to the current URL, or the
 * request is passed on to the SparkUI servlets.
 * <p>
 * param:  request HttpServletRequest
 * param:  response HttpServletResponse
 * param:  chain the rest of the request chain
 */
  class ApplicationCacheCheckFilter implements javax.servlet.Filter, org.apache.spark.internal.Logging {
  // not preceding
  public   ApplicationCacheCheckFilter (org.apache.spark.deploy.history.CacheKey key, org.apache.spark.deploy.history.LoadedAppUI loadedUI, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  public  void destroy ()  { throw new RuntimeException(); }
  // not preceding
  public  void doFilter (javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.FilterChain chain)  { throw new RuntimeException(); }
  public  void init (javax.servlet.FilterConfig config)  { throw new RuntimeException(); }
}
