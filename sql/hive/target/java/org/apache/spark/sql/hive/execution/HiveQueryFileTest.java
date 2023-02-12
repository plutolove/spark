package org.apache.spark.sql.hive.execution;
/** A list of tests deemed out of scope and thus completely disregarded */
public abstract class HiveQueryFileTest extends org.apache.spark.sql.hive.execution.HiveComparisonTest {
  // not preceding
  public   HiveQueryFileTest ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<java.lang.String> blackList ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> realWhiteList ()  { throw new RuntimeException(); }
  public  boolean runAll ()  { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<scala.Tuple2<java.lang.String, java.io.File>> testCases ()  ;
  /**
   * The set of tests that are believed to be working in catalyst. Tests not in whiteList
   * blacklist are implicitly marked as ignored.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> whiteList ()  { throw new RuntimeException(); }
  public  java.lang.String whiteListProperty ()  { throw new RuntimeException(); }
}
