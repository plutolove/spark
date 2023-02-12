package org.apache.spark.sql.execution.streaming;
/**
 * Create a file and make its contents available atomically after the output stream is closed.
 * <p>
 * param:  path                Path to create
 * param:  overwriteIfPossible If true, then the implementations must do a best-effort attempt to
 *                            overwrite the file if it already exists. It should not throw
 *                            any exception if the file exists. However, if false, then the
 *                            implementation must not overwrite if the file already exists and
 *                            must throw <code>FileAlreadyExistsException</code> in that case.
 */
public  interface CheckpointFileManager {
  // not preceding
  static public  interface RenameHelperMethods {
    /** Create a file with overwrite. */
    public  org.apache.hadoop.fs.FSDataOutputStream createTempFile (org.apache.hadoop.fs.Path path)  ;
    /**
     * Rename a file.
     * <p>
     * @param srcPath             Source path to rename
     * @param dstPath             Destination path to rename to
     * @param overwriteIfPossible If true, then the implementations must do a best-effort attempt to
     *                            overwrite the file if it already exists. It should not throw
     *                            any exception if the file exists. However, if false, then the
     *                            implementation must not overwrite if the file already exists and
     *                            must throw <code>FileAlreadyExistsException</code> in that case.
     */
    public  void renameTempFile (org.apache.hadoop.fs.Path srcPath, org.apache.hadoop.fs.Path dstPath, boolean overwriteIfPossible)  ;
  }
  // not preceding
  static public abstract class CancellableFSDataOutputStream extends org.apache.hadoop.fs.FSDataOutputStream {
    // not preceding
    public   CancellableFSDataOutputStream (java.io.OutputStream underlyingStream)  { throw new RuntimeException(); }
    // not preceding
    public abstract  void cancel ()  ;
    // not preceding
    protected  java.io.OutputStream underlyingStream ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class RenameBasedFSDataOutputStream extends org.apache.spark.sql.execution.streaming.CheckpointFileManager.CancellableFSDataOutputStream {
    // not preceding
    public   RenameBasedFSDataOutputStream (org.apache.spark.sql.execution.streaming.CheckpointFileManager fm, org.apache.hadoop.fs.Path finalPath, org.apache.hadoop.fs.Path tempPath, boolean overwriteIfPossible)  { throw new RuntimeException(); }
    // not preceding
    public   RenameBasedFSDataOutputStream (org.apache.spark.sql.execution.streaming.CheckpointFileManager fm, org.apache.hadoop.fs.Path path, boolean overwrite)  { throw new RuntimeException(); }
    public  void cancel ()  { throw new RuntimeException(); }
    public  void close ()  { throw new RuntimeException(); }
  }
  /**
   * Create a file and make its contents available atomically after the output stream is closed.
   * <p>
   * @param path                Path to create
   * @param overwriteIfPossible If true, then the implementations must do a best-effort attempt to
   *                            overwrite the file if it already exists. It should not throw
   *                            any exception if the file exists. However, if false, then the
   *                            implementation must not overwrite if the file already exists and
   *                            must throw <code>FileAlreadyExistsException</code> in that case.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.execution.streaming.CheckpointFileManager.CancellableFSDataOutputStream createAtomic (org.apache.hadoop.fs.Path path, boolean overwriteIfPossible)  ;
  /** Open a file for reading, or throw exception if it does not exist. */
  public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path path)  ;
  /** List the files in a path that match a filter. */
  public  org.apache.hadoop.fs.FileStatus[] list (org.apache.hadoop.fs.Path path, org.apache.hadoop.fs.PathFilter filter)  ;
  /** List all the files in a path. */
  public  org.apache.hadoop.fs.FileStatus[] list (org.apache.hadoop.fs.Path path)  ;
  /** Make directory at the give path and all its parent directories as needed. */
  public  void mkdirs (org.apache.hadoop.fs.Path path)  ;
  /** Whether path exists */
  public  boolean exists (org.apache.hadoop.fs.Path path)  ;
  /** Recursively delete a path if it exists. Should not throw exception if file doesn't exist. */
  public  void delete (org.apache.hadoop.fs.Path path)  ;
  /** Is the default file system this implementation is operating on the local file system. */
  public  boolean isLocal ()  ;
}
