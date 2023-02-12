package org.apache.spark.ml.clustering;
/** @group setParam */
public  class GaussianMixture extends org.apache.spark.ml.Estimator<org.apache.spark.ml.clustering.GaussianMixtureModel> implements org.apache.spark.ml.clustering.GaussianMixtureParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static   int MAX_NUM_FEATURES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.clustering.GaussianMixture load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Heuristic to distribute the computation of the {@link MultivariateGaussian}s, approximately when
   * numFeatures > 25 except for when numClusters is very small.
   * <p>
   * @param numClusters  Number of clusters
   * @param numFeatures  Number of features
   * @return (undocumented)
   */
  static   boolean shouldDistributeGaussians (int numClusters, int numFeatures)  { throw new RuntimeException(); }
  /**
   * Convert an n * (n + 1) / 2 dimension array representing the upper triangular part of a matrix
   * into an n * n array representing the full symmetric matrix (column major).
   * <p>
   * @param n The order of the n by n matrix.
   * @param triangularValues The upper triangular part of the matrix packed in an array
   *                         (column major).
   * @return A dense matrix which represents the symmetric matrix in column major.
   */
  static   org.apache.spark.ml.linalg.DenseMatrix unpackUpperTriangularMatrix (int n, double[] triangularValues)  { throw new RuntimeException(); }
  /**
   * Update the weight, mean and covariance of gaussian distribution.
   * <p>
   * @param mean The mean of the gaussian distribution.
   * @param cov The covariance matrix of the gaussian distribution. Note we only
   *            save the upper triangular part as a dense vector (column major).
   * @param weight The weight of the gaussian distribution.
   * @param sumWeights The sum of weights of all clusters.
   * @return The updated weight, mean and covariance.
   */
  static   scala.Tuple2<java.lang.Object, scala.Tuple2<org.apache.spark.ml.linalg.DenseVector, org.apache.spark.ml.linalg.DenseVector>> updateWeightsAndGaussians (org.apache.spark.ml.linalg.DenseVector mean, org.apache.spark.ml.linalg.DenseVector cov, double weight, double sumWeights)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam k ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam aggregationDepth ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam tol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> probabilityCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> weightCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> featuresCol ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixture (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.clustering.GaussianMixture copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public   GaussianMixture ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setFeaturesCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setProbabilityCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setWeightCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setK (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setTol (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.clustering.GaussianMixture setAggregationDepth (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.clustering.GaussianMixtureModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
