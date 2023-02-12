package org.apache.spark.ml.feature;
/**
 * SQL statement parameter. The statement is provided in string form.
 * <p>
 * @group param
 */
public  class SQLTransformer extends org.apache.spark.ml.Transformer implements org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  org.apache.spark.ml.feature.SQLTransformer load (java.lang.String path)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   SQLTransformer (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   SQLTransformer ()  { throw new RuntimeException(); }
  /**
   * SQL statement parameter. The statement is provided in string form.
   * <p>
   * @group param
   * @return (undocumented)
   */
  public final  org.apache.spark.ml.param.Param<java.lang.String> statement ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.feature.SQLTransformer setStatement (java.lang.String value)  { throw new RuntimeException(); }
  /** @group getParam */
  public  java.lang.String getStatement ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.SQLTransformer copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
