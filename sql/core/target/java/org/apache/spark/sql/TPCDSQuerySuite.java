package org.apache.spark.sql;
/**
 * This test suite ensures all the TPC-DS queries can be successfully analyzed, optimized
 * and compiled without hitting the max iteration threshold.
 */
public  class TPCDSQuerySuite extends org.apache.spark.sql.BenchmarkQueryTest implements org.apache.spark.sql.TPCDSBase {
  // not preceding
  public   TPCDSQuerySuite ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.String> blackListForMethodCodeSizeCheck ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> modifiedTPCDSQueries ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sqlConfgs ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.collection.immutable.Map<java.lang.String, java.lang.String> tableColumns ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Iterable<java.lang.String> tableNames ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> tpcdsQueriesV2_7_0 ()  { throw new RuntimeException(); }
}
