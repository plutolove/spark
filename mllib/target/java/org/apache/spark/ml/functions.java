package org.apache.spark.ml;
/**
 * Converts a column of MLlib sparse/dense vectors into a column of dense arrays.
 * param:  v: the column of MLlib sparse/dense vectors
 * param:  dtype: the desired underlying data type in the returned array
 * @return an array&amp;lt;float&amp;gt; if dtype is float32, or array&amp;lt;double&amp;gt; if dtype is float64
 * @since 3.0.0
 */
// not preceding
public  class functions {
  /**
   * Converts a column of MLlib sparse/dense vectors into a column of dense arrays.
   * @param v: the column of MLlib sparse/dense vectors
   * @param dtype: the desired underlying data type in the returned array
   * @return an array&amp;lt;float&amp;gt; if dtype is float32, or array&amp;lt;double&amp;gt; if dtype is float64
   * @since 3.0.0
   */
  static public  org.apache.spark.sql.Column vector_to_array (org.apache.spark.sql.Column v, java.lang.String dtype)  { throw new RuntimeException(); }
}
