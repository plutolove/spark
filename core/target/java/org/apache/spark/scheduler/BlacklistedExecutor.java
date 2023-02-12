package org.apache.spark.scheduler;
/**
 * Verify that blacklist configurations are consistent; if not, throw an exception.  Should only
 * be called if blacklisting is enabled.
 * <p>
 * The configuration for the blacklist is expected to adhere to a few invariants.  Default
 * values follow these rules of course, but users may unwittingly change one configuration
 * without making the corresponding adjustment elsewhere.  This ensures we fail-fast when
 * there are such misconfigurations.
 */
public final class BlacklistedExecutor implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String node ()  { throw new RuntimeException(); }
  public  long expiryTime ()  { throw new RuntimeException(); }
  // not preceding
  public   BlacklistedExecutor (java.lang.String node, long expiryTime)  { throw new RuntimeException(); }
}
