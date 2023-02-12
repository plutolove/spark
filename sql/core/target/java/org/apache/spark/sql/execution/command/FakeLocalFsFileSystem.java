package org.apache.spark.sql.execution.command;
public  class FakeLocalFsFileSystem extends org.apache.hadoop.fs.RawLocalFileSystem {
  // not preceding
  static public  org.apache.hadoop.fs.permission.AclStatus aclStatus ()  { throw new RuntimeException(); }
  // not preceding
  public   FakeLocalFsFileSystem ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean delete (org.apache.hadoop.fs.Path f, boolean recursive)  { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.permission.AclStatus getAclStatus (org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  public  void setAcl (org.apache.hadoop.fs.Path path, java.util.List<org.apache.hadoop.fs.permission.AclEntry> aclSpec)  { throw new RuntimeException(); }
}
