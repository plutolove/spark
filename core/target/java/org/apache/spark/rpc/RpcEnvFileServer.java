package org.apache.spark.rpc;
/**
 * Adds a file to be served by this RpcEnv. This is used to serve files from the driver
 * to executors when they're stored on the driver's local file system.
 * <p>
 * param:  file Local file to serve.
 * @return A URI for the location of the file.
 */
public  interface RpcEnvFileServer {
  /**
   * Adds a local directory to be served via this file server.
   * <p>
   * @param baseUri Leading URI path (files can be retrieved by appending their relative
   *                path to this base URI). This cannot be "files" nor "jars".
   * @param path Path to the local directory.
   * @return URI for the root of the directory in the file server.
   */
  public  java.lang.String addDirectory (java.lang.String baseUri, java.io.File path)  ;
  /**
   * Adds a file to be served by this RpcEnv. This is used to serve files from the driver
   * to executors when they're stored on the driver's local file system.
   * <p>
   * @param file Local file to serve.
   * @return A URI for the location of the file.
   */
  public  java.lang.String addFile (java.io.File file)  ;
  /**
   * Adds a jar to be served by this RpcEnv. Similar to <code>addFile</code> but for jars added using
   * <code>SparkContext.addJar</code>.
   * <p>
   * @param file Local file to serve.
   * @return A URI for the location of the file.
   */
  public  java.lang.String addJar (java.io.File file)  ;
  /** Validates and normalizes the base URI for directories. */
  public  java.lang.String validateDirectoryUri (java.lang.String baseUri)  ;
}
