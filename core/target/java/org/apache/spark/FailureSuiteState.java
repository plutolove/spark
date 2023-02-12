package org.apache.spark;
// not preceding
public  class FailureSuiteState {
  // not preceding
  static public  int tasksRun ()  { throw new RuntimeException(); }
  static public  int tasksFailed ()  { throw new RuntimeException(); }
  static public  void clear ()  { throw new RuntimeException(); }
}
