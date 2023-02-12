package org.apache.spark.sql.execution.benchmark;
/** Subclass can override this function to build their own SparkSession */
public  interface SqlBasedBenchmark extends org.apache.spark.sql.catalyst.plans.SQLHelper {
  public  class DatasetToBenchmark {
    // not preceding
    public   DatasetToBenchmark (org.apache.spark.sql.Dataset<?> ds)  { throw new RuntimeException(); }
    // not preceding
    public  void noop ()  { throw new RuntimeException(); }
  }
  /** Runs function `f` with whole stage codegen on and off. */
  public  void codegenBenchmark (java.lang.String name, long cardinality, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /** Subclass can override this function to build their own SparkSession */
  public  org.apache.spark.sql.SparkSession getSparkSession ()  ;
  public  org.apache.spark.sql.SparkSession spark ()  ;
}
