package org.apache.spark.mllib.stat.test;
/** Set the number of initial batches to ignore. Default: 0. */
public  class StreamingTest implements org.apache.spark.internal.Logging, scala.Serializable {
  // not preceding
  public   StreamingTest ()  { throw new RuntimeException(); }
  /** Drop all batches inside the peace period. */
    org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> dropPeacePeriod (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /**
   * Transform a stream of summaries into pairs representing summary statistics for control group
   * and experiment group up to this batch.
   * @param summarizedData (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<org.apache.spark.util.StatCounter, org.apache.spark.util.StatCounter>> pairSummaries (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizedData)  { throw new RuntimeException(); }
  /**
   * Register a <code>DStream</code> of values for significance testing.
   * <p>
   * @param data stream of BinarySample(key,value) pairs where the key denotes group membership
   *             (true = experiment, false = control) and the value is the numerical metric to
   *             test for significance
   * @return stream of significance testing results
   */
  public  org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /**
   * Register a <code>JavaDStream</code> of values for significance testing.
   * <p>
   * @param data stream of BinarySample(isExperiment,value) pairs where the isExperiment denotes
   *             group (true = experiment, false = control) and the value is the numerical metric
   *             to test for significance
   * @return stream of significance testing results
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.StreamingTestResult> registerStream (org.apache.spark.streaming.api.java.JavaDStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
  /** Set the number of initial batches to ignore. Default: 0. */
  public  org.apache.spark.mllib.stat.test.StreamingTest setPeacePeriod (int peacePeriod)  { throw new RuntimeException(); }
  /** Set the statistical method used for significance testing. Default: "welch" */
  public  org.apache.spark.mllib.stat.test.StreamingTest setTestMethod (java.lang.String method)  { throw new RuntimeException(); }
  /**
   * Set the number of batches to compute significance tests over. Default: 0.
   * A value of 0 will use all batches seen so far.
   * @param windowSize (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.mllib.stat.test.StreamingTest setWindowSize (int windowSize)  { throw new RuntimeException(); }
  /** Compute summary statistics over each key and the specified test window size. */
    org.apache.spark.streaming.dstream.DStream<scala.Tuple2<java.lang.Object, org.apache.spark.util.StatCounter>> summarizeByKeyAndWindow (org.apache.spark.streaming.dstream.DStream<org.apache.spark.mllib.stat.test.BinarySample> data)  { throw new RuntimeException(); }
}
