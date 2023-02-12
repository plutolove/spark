package org.apache.spark.sql;
/**
 * This test suite ensures all the TPC-H queries can be successfully analyzed, optimized
 * and compiled without hitting the max iteration threshold.
 */
public  class TPCHQuerySuite extends org.apache.spark.sql.BenchmarkQueryTest {
  // not preceding
  public   TPCHQuerySuite ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeAll ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> tpchQueries ()  { throw new RuntimeException(); }
}
