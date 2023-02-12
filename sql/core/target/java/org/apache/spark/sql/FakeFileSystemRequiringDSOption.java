package org.apache.spark.sql;
public  class FakeFileSystemRequiringDSOption extends org.apache.hadoop.fs.LocalFileSystem {
  // not preceding
  public   FakeFileSystemRequiringDSOption ()  { throw new RuntimeException(); }
  // not preceding
  public  void initialize (java.net.URI name, org.apache.hadoop.conf.Configuration conf)  { throw new RuntimeException(); }
}
