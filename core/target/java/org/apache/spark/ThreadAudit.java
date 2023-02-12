package org.apache.spark;
/**
 * Netty related internal threads.
 * These are excluded because their lifecycle is handled by the netty itself
 * and spark has no explicit effect on them.
 */
public  interface ThreadAudit extends org.apache.spark.internal.Logging {
  public  void doThreadPostAudit ()  ;
  public  void doThreadPreAudit ()  ;
  public  scala.collection.immutable.Set<java.lang.String> runningThreadNames ()  ;
  /**
   * Netty related internal threads.
   * These are excluded because their lifecycle is handled by the netty itself
   * and spark has no explicit effect on them.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Set<java.lang.String> threadWhiteList ()  ;
}
