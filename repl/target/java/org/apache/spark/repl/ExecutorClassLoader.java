package org.apache.spark.repl;
/**
 * URL-encode a string, preserving only slashes
 */
public  class ExecutorClassLoader extends java.lang.ClassLoader implements org.apache.spark.internal.Logging {
  // not preceding
  public   ExecutorClassLoader (org.apache.spark.SparkConf conf, org.apache.spark.SparkEnv env, java.lang.String classUri, java.lang.ClassLoader parent, boolean userClassPathFirst)  { throw new RuntimeException(); }
  public  java.lang.String directory ()  { throw new RuntimeException(); }
  public  java.lang.Class<?> findClass (java.lang.String name)  { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> findClassLocally (java.lang.String name)  { throw new RuntimeException(); }
  public  java.net.URL getResource (java.lang.String name)  { throw new RuntimeException(); }
  public  java.io.InputStream getResourceAsStream (java.lang.String name)  { throw new RuntimeException(); }
  public  java.util.Enumeration<java.net.URL> getResources (java.lang.String name)  { throw new RuntimeException(); }
    int httpUrlConnectionTimeoutMillis ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.ParentClassLoader parentLoader ()  { throw new RuntimeException(); }
  public  byte[] readAndTransformClass (java.lang.String name, java.io.InputStream in)  { throw new RuntimeException(); }
  // not preceding
  public  java.net.URI uri ()  { throw new RuntimeException(); }
  /**
   * URL-encode a string, preserving only slashes
   * @param str (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String urlEncode (java.lang.String str)  { throw new RuntimeException(); }
}
