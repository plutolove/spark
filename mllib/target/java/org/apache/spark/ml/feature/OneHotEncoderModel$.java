package org.apache.spark.ml.feature;
/**
 * If the metadata of input columns also specifies the number of categories, we need to
 * compare with expected category number with <code>handleInvalid</code> and <code>dropLast</code> taken into
 * account. Mismatched numbers will cause exception.
 */
// not preceding
public  class OneHotEncoderModel$ implements org.apache.spark.ml.util.MLReadable<org.apache.spark.ml.feature.OneHotEncoderModel>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final OneHotEncoderModel$ MODULE$ = null;
  public   OneHotEncoderModel$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.OneHotEncoderModel> read ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.OneHotEncoderModel load (java.lang.String path)  { throw new RuntimeException(); }
}
