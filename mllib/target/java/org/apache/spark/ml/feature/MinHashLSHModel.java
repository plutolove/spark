package org.apache.spark.ml.feature;
/** @group setParam */
public  class MinHashLSHModel extends org.apache.spark.ml.feature.LSHModel<org.apache.spark.ml.feature.MinHashLSHModel> {
  static   class MinHashLSHModelWriter extends org.apache.spark.ml.util.MLWriter {
    // not preceding
    public   MinHashLSHModelWriter (org.apache.spark.ml.feature.MinHashLSHModel instance)  { throw new RuntimeException(); }
    // not preceding
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.feature.MinHashLSHModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.MinHashLSHModel load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
    scala.Tuple2<java.lang.Object, java.lang.Object>[] randCoefficients ()  { throw new RuntimeException(); }
  // not preceding
     MinHashLSHModel (java.lang.String uid, scala.Tuple2<java.lang.Object, java.lang.Object>[] randCoefficients)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.MinHashLSHModel setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.MinHashLSHModel setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  protected  org.apache.spark.ml.linalg.Vector[] hashFunction (org.apache.spark.ml.linalg.Vector elems)  { throw new RuntimeException(); }
  protected  double keyDistance (org.apache.spark.ml.linalg.Vector x, org.apache.spark.ml.linalg.Vector y)  { throw new RuntimeException(); }
  protected  double hashDistance (scala.collection.Seq<org.apache.spark.ml.linalg.Vector> x, scala.collection.Seq<org.apache.spark.ml.linalg.Vector> y)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.MinHashLSHModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.util.MLWriter write ()  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
