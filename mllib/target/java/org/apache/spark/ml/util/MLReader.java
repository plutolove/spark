package org.apache.spark.ml.util;
/**
 * Loads the ML component from the input path.
 */
public abstract class MLReader<T extends java.lang.Object> implements org.apache.spark.ml.util.BaseReadWrite {
  // not preceding
  public   MLReader ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  T load (java.lang.String path)  ;
  public  org.apache.spark.ml.util.MLReader<T> session (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
