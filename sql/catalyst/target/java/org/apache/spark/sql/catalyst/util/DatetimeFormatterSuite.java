package org.apache.spark.sql.catalyst.util;
public  interface DatetimeFormatterSuite extends org.apache.spark.sql.catalyst.plans.SQLHelper, org.scalatest.Matchers {
  public  void assertEqual (java.lang.String pattern, java.lang.String datetimeStr, long expected)  ;
  public  void assertError (java.lang.String pattern, java.lang.String datetimeStr, java.lang.String expectedMsg)  ;
  public  void checkFormatterCreation (java.lang.String pattern, boolean isParsing)  ;
  public  org.apache.spark.sql.catalyst.util.DateFormatter dateFormatter (java.lang.String pattern, scala.Enumeration.Value ldf)  ;
  public  org.apache.spark.sql.catalyst.util.TimestampFormatter timestampFormatter (java.lang.String pattern, scala.Enumeration.Value ldf)  ;
  public  boolean useDateFormatter ()  ;
}
