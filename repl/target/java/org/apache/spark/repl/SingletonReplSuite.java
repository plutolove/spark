package org.apache.spark.repl;
/**
 * Run the given commands string in a globally shared interpreter instance. Note that the given
 * commands should not crash the interpreter, to not affect other test cases.
 */
public  class SingletonReplSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   SingletonReplSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void assertContains (java.lang.String message, java.lang.String output)  { throw new RuntimeException(); }
  public  void assertDoesNotContain (java.lang.String message, java.lang.String output)  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  /**
   * Run the given commands string in a globally shared interpreter instance. Note that the given
   * commands should not crash the interpreter, to not affect other test cases.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String runInterpreter (java.lang.String input)  { throw new RuntimeException(); }
}
