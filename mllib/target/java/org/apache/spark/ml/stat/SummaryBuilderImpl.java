package org.apache.spark.ml.stat;
/**
 * Given a list of metrics, provides a builder that it turns computes metrics from a column.
 * <p>
 * See the documentation of {@link Summarizer} for an example.
 * <p>
 * The following metrics are accepted (case sensitive):
 *  - mean: a vector that contains the coefficient-wise mean.
 *  - sum: a vector that contains the coefficient-wise sum.
 *  - variance: a vector tha contains the coefficient-wise variance.
 *  - std: a vector tha contains the coefficient-wise standard deviation.
 *  - count: the count of all vectors seen.
 *  - numNonzeros: a vector with the number of non-zeros for each coefficients
 *  - max: the maximum for each coefficient.
 *  - min: the minimum for each coefficient.
 *  - normL2: the Euclidean norm for each coefficient.
 *  - normL1: the L1 norm of each coefficient (sum of the absolute values).
 * param:  metrics metrics that can be provided.
 * @return a builder.
 * @throws IllegalArgumentException if one of the metric names is not understood.
 * <p>
 * Note: Currently, the performance of this interface is about 2x~3x slower then using the RDD
 * interface.
 */
  class SummaryBuilderImpl extends org.apache.spark.ml.stat.SummaryBuilder {
  // not preceding
  // not preceding
  static public  class Mean$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Mean$ MODULE$ = null;
    public   Mean$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Sum$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Sum$ MODULE$ = null;
    public   Sum$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Variance$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Variance$ MODULE$ = null;
    public   Variance$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Std$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Std$ MODULE$ = null;
    public   Std$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Count$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Count$ MODULE$ = null;
    public   Count$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class NumNonZeros$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NumNonZeros$ MODULE$ = null;
    public   NumNonZeros$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Max$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Max$ MODULE$ = null;
    public   Max$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Min$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Min$ MODULE$ = null;
    public   Min$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class NormL2$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NormL2$ MODULE$ = null;
    public   NormL2$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class NormL1$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.Metric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final NormL1$ MODULE$ = null;
    public   NormL1$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeMean$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMean$ MODULE$ = null;
    public   ComputeMean$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeM2n$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeM2n$ MODULE$ = null;
    public   ComputeM2n$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeM2$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeM2$ MODULE$ = null;
    public   ComputeM2$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeL1$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeL1$ MODULE$ = null;
    public   ComputeL1$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeWeightSum$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeWeightSum$ MODULE$ = null;
    public   ComputeWeightSum$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeNNZ$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeNNZ$ MODULE$ = null;
    public   ComputeNNZ$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeMax$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMax$ MODULE$ = null;
    public   ComputeMax$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class ComputeMin$ implements org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric, scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ComputeMin$ MODULE$ = null;
    public   ComputeMin$ ()  { throw new RuntimeException(); }
  }
  /**
   * The metrics that are currently implemented.
   */
  static public  interface Metric extends java.io.Serializable {
  }
  // not preceding
  static public  interface ComputeMetric extends java.io.Serializable {
  }
  // not preceding
  static public  scala.collection.Seq<java.lang.String> implementedMetrics ()  { throw new RuntimeException(); }
  static public  scala.Tuple2<scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric>, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric>> getRelevantMetrics (scala.collection.Seq<java.lang.String> requested) throws java.lang.IllegalArgumentException { throw new RuntimeException(); }
  static public  org.apache.spark.sql.types.StructType structureForMetrics (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> metrics)  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  // not preceding
  public   SummaryBuilderImpl (scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.Metric> requestedMetrics, scala.collection.Seq<org.apache.spark.ml.stat.SummaryBuilderImpl.ComputeMetric> requestedCompMetrics)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.Column summary (org.apache.spark.sql.Column featuresCol, org.apache.spark.sql.Column weightCol)  { throw new RuntimeException(); }
}
