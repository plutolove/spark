package org.apache.spark.status.api.v1;
/**
 * :: Experimental ::
 * This aims to expose Executor metrics like REST API which is documented in
 * <p>
 *    https://spark.apache.org/docs/3.0.0/monitoring.html#executor-metrics
 * <p>
 * Note that this is based on ExecutorSummary which is different from ExecutorSource.
 */
  class PrometheusResource implements org.apache.spark.status.api.v1.ApiRequestContext {
  // not preceding
  static public  org.eclipse.jetty.servlet.ServletContextHandler getServletHandler (org.apache.spark.status.api.v1.UIRoot uiRoot)  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.ServletContext servletContext ()  { throw new RuntimeException(); }
  // not preceding
  protected  javax.servlet.http.HttpServletRequest httpRequest ()  { throw new RuntimeException(); }
  // not preceding
  public   PrometheusResource ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String executors ()  { throw new RuntimeException(); }
}
