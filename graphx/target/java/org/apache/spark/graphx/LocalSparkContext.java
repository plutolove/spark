package org.apache.spark.graphx;
/** Runs `f` on a new SparkContext and ensures that it is stopped afterwards. */
public  interface LocalSparkContext {
  /** Runs `f` on a new SparkContext and ensures that it is stopped afterwards. */
  public <T extends java.lang.Object> T withSpark (scala.Function1<org.apache.spark.SparkContext, T> f)  ;
}
