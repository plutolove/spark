package org.apache.spark.ml.feature;
/**
 * An array of indices to select features from a vector column.
 * There can be no overlap with {@link names}.
 * Default: Empty array
 * @group param
 */
public final class VectorSlicer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   boolean validIndices (int[] indices)  { throw new RuntimeException(); }
  /** Return true if given feature names are valid */
  static   boolean validNames (java.lang.String[] names)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.feature.VectorSlicer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   VectorSlicer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   VectorSlicer ()  { throw new RuntimeException(); }
  /**
   * An array of indices to select features from a vector column.
   * There can be no overlap with {@link names}.
   * Default: Empty array
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.IntArrayParam indices ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  int[] getIndices ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setIndices (int[] value)  { throw new RuntimeException(); }
  /**
   * An array of feature names to select features from a vector column.
   * These names must be specified by ML {@link org.apache.spark.ml.attribute.Attribute}s.
   * There can be no overlap with {@link indices}.
   * Default: Empty Array
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam names ()  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getNames ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setNames (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.VectorSlicer setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.VectorSlicer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
