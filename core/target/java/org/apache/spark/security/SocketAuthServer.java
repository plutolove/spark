package org.apache.spark.security;
/**
 * Handle a connection which has already been authenticated.  Any error from this function
 * will clean up this connection and the entire server, and get propagated to {@link getResult}.
 */
 abstract class SocketAuthServer<T extends java.lang.Object> {
  // not preceding
  static public  java.lang.Object[] serveToStream (java.lang.String threadName, org.apache.spark.security.SocketAuthHelper authHelper, scala.Function1<java.io.OutputStream, scala.runtime.BoxedUnit> writeFunc)  { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   SocketAuthServer (org.apache.spark.security.SocketAuthHelper authHelper, java.lang.String threadName)  { throw new RuntimeException(); }
  // not preceding
  public   SocketAuthServer (org.apache.spark.SparkEnv env, java.lang.String threadName)  { throw new RuntimeException(); }
  public   SocketAuthServer (java.lang.String threadName)  { throw new RuntimeException(); }
  public  int port ()  { throw new RuntimeException(); }
  public  java.lang.String secret ()  { throw new RuntimeException(); }
  /**
   * Handle a connection which has already been authenticated.  Any error from this function
   * will clean up this connection and the entire server, and get propagated to {@link getResult}.
   * @param sock (undocumented)
   * @return (undocumented)
   */
  public abstract  T handleConnection (java.net.Socket sock)  ;
  /**
   * Blocks indefinitely for {@link handleConnection} to finish, and returns that result.  If
   * handleConnection throws an exception, this will throw an exception which includes the original
   * exception as a cause.
   * @return (undocumented)
   */
  public  T getResult ()  { throw new RuntimeException(); }
  public  T getResult (scala.concurrent.duration.Duration wait)  { throw new RuntimeException(); }
}
