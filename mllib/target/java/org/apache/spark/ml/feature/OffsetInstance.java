package org.apache.spark.ml.feature;
/** Converts to an {@link Instance} object by leaving out the offset. */
  class OffsetInstance implements scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  double label ()  { throw new RuntimeException(); }
  public  double weight ()  { throw new RuntimeException(); }
  public  double offset ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.linalg.Vector features ()  { throw new RuntimeException(); }
  // not preceding
  public   OffsetInstance (double label, double weight, double offset, org.apache.spark.ml.linalg.Vector features)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.Instance toInstance ()  { throw new RuntimeException(); }
}
