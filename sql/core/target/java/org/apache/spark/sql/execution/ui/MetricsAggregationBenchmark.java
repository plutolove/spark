package org.apache.spark.sql.execution.ui;
/**
 * Finer-grained measurements of how long it takes to run some parts of the benchmark. This is
 * collected by the benchmark method, so this collection slightly affects the overall benchmark
 * results, but this data helps with seeing where the time is going, since this benchmark is
 * triggering a whole lot of code in the listener class.
 */
// not preceding
public  class MetricsAggregationBenchmark {
  /**
   * Finer-grained measurements of how long it takes to run some parts of the benchmark. This is
   * collected by the benchmark method, so this collection slightly affects the overall benchmark
   * results, but this data helps with seeing where the time is going, since this benchmark is
   * triggering a whole lot of code in the listener class.
   */
  static public  class Measurements implements scala.Product, scala.Serializable {
    // not preceding
    public  scala.collection.Seq<java.lang.Object> taskEventsTimes ()  { throw new RuntimeException(); }
    public  long aggregationTime ()  { throw new RuntimeException(); }
    // not preceding
    public   Measurements (scala.collection.Seq<java.lang.Object> taskEventsTimes, long aggregationTime)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Measurements$ extends scala.runtime.AbstractFunction2<scala.collection.Seq<java.lang.Object>, java.lang.Object, org.apache.spark.sql.execution.ui.MetricsAggregationBenchmark.Measurements> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Measurements$ MODULE$ = null;
    public   Measurements$ ()  { throw new RuntimeException(); }
  }
  static public  void runBenchmarkSuite (java.lang.String[] mainArgs)  { throw new RuntimeException(); }
  static public  scala.Option<java.io.OutputStream> output ()  { throw new RuntimeException(); }
  static public  void output_$eq (scala.Option<java.io.OutputStream> x$1)  { throw new RuntimeException(); }
  static public final  void runBenchmark (java.lang.String benchmarkName, scala.Function0<java.lang.Object> func)  { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  void afterAll ()  { throw new RuntimeException(); }
}
