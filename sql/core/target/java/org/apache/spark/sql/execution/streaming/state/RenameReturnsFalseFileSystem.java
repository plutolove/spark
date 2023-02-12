package org.apache.spark.sql.execution.streaming.state;
/**
 * Fake FileSystem to test that the StateStore throws an exception while committing the
 * delta file, when <code>fs.rename</code> returns <code>false</code>.
 */
public  class RenameReturnsFalseFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  static public  java.lang.String scheme ()  { throw new RuntimeException(); }
  // not preceding
  public   RenameReturnsFalseFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  java.net.URI getUri ()  { throw new RuntimeException(); }
  public  boolean rename (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
}
