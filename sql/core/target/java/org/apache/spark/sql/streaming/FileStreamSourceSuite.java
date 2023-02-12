package org.apache.spark.sql.streaming;
/** Use `format` and `path` to create FileStreamSource via DataFrameReader */
public  class FileStreamSourceSuite extends org.apache.spark.sql.streaming.FileStreamSourceTest {
  public  class FakeFileSystem extends org.apache.hadoop.fs.FileSystem {
    // not preceding
    public   FakeFileSystem (java.lang.String scheme)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataOutputStream append (org.apache.hadoop.fs.Path f, int bufferSize, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataOutputStream create (org.apache.hadoop.fs.Path f, org.apache.hadoop.fs.permission.FsPermission permission, boolean overwrite, int bufferSize, short replication, long blockSize, org.apache.hadoop.util.Progressable progress)  { throw new RuntimeException(); }
    public  boolean delete (org.apache.hadoop.fs.Path f, boolean recursive)  { throw new RuntimeException(); }
    // not preceding
    public  boolean exists (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FileStatus getFileStatus (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
    public  java.net.URI getUri ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.Path getWorkingDirectory ()  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FileStatus[] listStatus (org.apache.hadoop.fs.Path f)  { throw new RuntimeException(); }
    public  boolean mkdirs (org.apache.hadoop.fs.Path f, org.apache.hadoop.fs.permission.FsPermission permission)  { throw new RuntimeException(); }
    public  org.apache.hadoop.fs.FSDataInputStream open (org.apache.hadoop.fs.Path f, int bufferSize)  { throw new RuntimeException(); }
    public  boolean rename (org.apache.hadoop.fs.Path src, org.apache.hadoop.fs.Path dst)  { throw new RuntimeException(); }
    public  void setWorkingDirectory (org.apache.hadoop.fs.Path new_dir)  { throw new RuntimeException(); }
  }
  // not preceding
  public   FileStreamSourceSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.time.Span streamingTimeout ()  { throw new RuntimeException(); }
}
