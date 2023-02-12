package org.apache.spark.sql.catalyst.plans.logical;
/**
 *  SHOW FUNCTIONS statement, as parsed from SQL
 */
public  class ShowFunctionsStatement extends org.apache.spark.sql.catalyst.plans.logical.ParsedStatement implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean userScope ()  { throw new RuntimeException(); }
  public  boolean systemScope ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> pattern ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> functionName ()  { throw new RuntimeException(); }
  // not preceding
  public   ShowFunctionsStatement (boolean userScope, boolean systemScope, scala.Option<java.lang.String> pattern, scala.Option<scala.collection.Seq<java.lang.String>> functionName)  { throw new RuntimeException(); }
}
