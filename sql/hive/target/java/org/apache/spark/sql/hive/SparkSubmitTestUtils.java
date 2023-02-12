package org.apache.spark.sql.hive;
public  interface SparkSubmitTestUtils extends org.scalatest.concurrent.TimeLimits {
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  ;
  public  void runSparkSubmit (scala.collection.Seq<java.lang.String> args, scala.Option<java.lang.String> sparkHomeOpt, boolean isSparkTesting)  ;
}
