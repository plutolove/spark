package org.apache.spark.ml.feature;
/**
 * Numeric columns to treat as categorical features. By default only string and boolean
 * columns are treated as categorical, so this param can be used to explicitly specify the
 * numerical columns to treat as categorical. Note, the relevant columns must also be set in
 * <code>inputCols</code>.
 * @group param
 */
public  class FeatureHasher extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCols, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.param.shared.HasNumFeatures, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.FeatureHasher load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Calculate a hash code value for the term object using
   * Austin Appleby's MurmurHash 3 algorithm (MurmurHash3_x86_32).
   * This is the default hash algorithm used from Spark 2.0 onwards.
   * Use hashUnsafeBytes2 to match the original algorithm with the value.
   * See SPARK-23381.
   * @param term (undocumented)
   * @return (undocumented)
   */
  static   int murmur3Hash (Object term)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam numFeatures ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.StringArrayParam inputCols ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   FeatureHasher (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   FeatureHasher ()  { throw new RuntimeException(); }
  /**
   * Numeric columns to treat as categorical features. By default only string and boolean
   * columns are treated as categorical, so this param can be used to explicitly specify the
   * numerical columns to treat as categorical. Note, the relevant columns must also be set in
   * <code>inputCols</code>.
   * @group param
   * @return (undocumented)
   */
  public  org.apache.spark.ml.param.StringArrayParam categoricalCols ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setNumFeatures (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setInputCols (scala.collection.Seq<java.lang.String> values)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setInputCols (java.lang.String[] value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String[] getCategoricalCols ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.FeatureHasher setCategoricalCols (java.lang.String[] value)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.FeatureHasher copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
