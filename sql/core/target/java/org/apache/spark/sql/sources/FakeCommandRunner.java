package org.apache.spark.sql.sources;
public  class FakeCommandRunner implements org.apache.spark.sql.connector.ExternalCommandRunner {
  // not preceding
  public   FakeCommandRunner ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String[] executeCommand (java.lang.String command, org.apache.spark.sql.util.CaseInsensitiveStringMap options)  { throw new RuntimeException(); }
}
