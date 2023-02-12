package org.apache.spark;
/**
 * Initialize the authentication secret.
 * <p>
 * If authentication is disabled, do nothing.
 * <p>
 * In YARN and local mode, generate a new secret and store it in the current user's credentials.
 * <p>
 * In other modes, assert that the auth secret is set in the configuration.
 */
// not preceding
public  class SecurityManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SecurityManager$ MODULE$ = null;
  public   SecurityManager$ ()  { throw new RuntimeException(); }
  /**
   * Initialize the authentication secret.
   * <p>
   * If authentication is disabled, do nothing.
   * <p>
   * In YARN and local mode, generate a new secret and store it in the current user's credentials.
   * <p>
   * In other modes, assert that the auth secret is set in the configuration.
   * @return (undocumented)
   */
  public  scala.util.matching.Regex k8sRegex ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_AUTH_CONF ()  { throw new RuntimeException(); }
  public  java.lang.String SPARK_AUTH_SECRET_CONF ()  { throw new RuntimeException(); }
  public  java.lang.String ENV_AUTH_SECRET ()  { throw new RuntimeException(); }
  public  org.apache.hadoop.io.Text SECRET_LOOKUP_KEY ()  { throw new RuntimeException(); }
}
