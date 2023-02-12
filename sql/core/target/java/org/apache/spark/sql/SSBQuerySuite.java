package org.apache.spark.sql;
/**
 * This test suite ensures all the Star Schema Benchmark queries can be successfully analyzed,
 * optimized and compiled without hitting the max iteration threshold.
 */
public  class SSBQuerySuite extends org.apache.spark.sql.BenchmarkQueryTest {
  // not preceding
  public   SSBQuerySuite ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> ssbQueries ()  { throw new RuntimeException(); }
}
