package org.apache.spark.sql;
/**
 * This method handles exceptions occurred during query execution as they may need special care
 * to become comparable to the expected output.
 * <p>
 * param:  result a function that returns a pair of schema and output
 */
public  interface SQLQueryTestHelper {
  public  java.lang.String emptySchema ()  ;
  /** Executes a query and returns the result as (schema of the output, normalized output). */
  public  scala.Tuple2<java.lang.String, scala.collection.Seq<java.lang.String>> getNormalizedResult (org.apache.spark.sql.SparkSession session, java.lang.String sql)  ;
  /**
   * This method handles exceptions occurred during query execution as they may need special care
   * to become comparable to the expected output.
   * <p>
   * @param result a function that returns a pair of schema and output
   * @return (undocumented)
   */
  public  scala.Tuple2<java.lang.String, scala.collection.Seq<java.lang.String>> handleExceptions (scala.Function0<scala.Tuple2<java.lang.String, scala.collection.Seq<java.lang.String>>> result)  ;
  public  java.lang.String replaceNotIncludedMsg (java.lang.String line)  ;
}
