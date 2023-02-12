package org.apache.spark.ml.feature;
/** @group setParam */
public  class IndexToString extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.param.shared.HasInputCol, org.apache.spark.ml.param.shared.HasOutputCol, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.IndexToString load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> outputCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> inputCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   IndexToString (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   IndexToString ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setInputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setOutputCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.IndexToString setLabels (java.lang.String[] value)  { throw new RuntimeException(); }
  /**
   * Optional param for array of labels specifying index-string mapping.
   * <p>
   * Default: Not specified, in which case {@link inputCol} metadata is used for labels.
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.StringArrayParam labels ()  { throw new RuntimeException(); }
  /** @group getParam */
  public final  java.lang.String[] getLabels ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.IndexToString copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
