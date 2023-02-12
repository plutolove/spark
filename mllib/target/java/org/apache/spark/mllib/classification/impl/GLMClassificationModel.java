package org.apache.spark.mllib.classification.impl;
/** Model data for import/export */
// not preceding
public  class GLMClassificationModel {
  // not preceding
  // not preceding
  static public  class SaveLoadV1_0$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final SaveLoadV1_0$ MODULE$ = null;
    /** Model data for import/export */
    public  class Data implements scala.Product, scala.Serializable {
      static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
      static public  java.lang.String toString ()  { throw new RuntimeException(); }
      // not preceding
      public  org.apache.spark.mllib.linalg.Vector weights ()  { throw new RuntimeException(); }
      public  double intercept ()  { throw new RuntimeException(); }
      public  scala.Option<java.lang.Object> threshold ()  { throw new RuntimeException(); }
      // not preceding
      public   Data (org.apache.spark.mllib.linalg.Vector weights, double intercept, scala.Option<java.lang.Object> threshold)  { throw new RuntimeException(); }
    }
    // not preceding
    public  class Data$ extends scala.runtime.AbstractFunction3<org.apache.spark.mllib.linalg.Vector, java.lang.Object, scala.Option<java.lang.Object>, org.apache.spark.mllib.classification.impl.GLMClassificationModel.SaveLoadV1_0.Data> implements scala.Serializable {
      /**
       * Static reference to the singleton instance of this Scala object.
       */
      public static final Data$ MODULE$ = null;
      public   Data$ ()  { throw new RuntimeException(); }
    }
    public   SaveLoadV1_0$ ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String thisFormatVersion ()  { throw new RuntimeException(); }
    // not preceding
    public  void save (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass, int numFeatures, int numClasses, org.apache.spark.mllib.linalg.Vector weights, double intercept, scala.Option<java.lang.Object> threshold)  { throw new RuntimeException(); }
    /**
     * Helper method for loading GLM classification model data.
     * <p>
     * NOTE: Callers of this method should check numClasses, numFeatures on their own.
     * <p>
     * @param modelClass  String name for model class (used for error messages)
     * @param sc (undocumented)
     * @param path (undocumented)
     * @return (undocumented)
     */
    public  org.apache.spark.mllib.classification.impl.GLMClassificationModel.SaveLoadV1_0.Data loadData (org.apache.spark.SparkContext sc, java.lang.String path, java.lang.String modelClass)  { throw new RuntimeException(); }
  }
}
