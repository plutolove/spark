package org.apache.spark.ml.recommendation;
/**
 * Test ALS using the given training/test splits and parameters.
 * param:  training training dataset
 * param:  test test dataset
 * param:  rank rank of the matrix factorization
 * param:  maxIter max number of iterations
 * param:  regParam regularization constant
 * param:  implicitPrefs whether to use implicit preference
 * param:  numUserBlocks number of user blocks
 * param:  numItemBlocks number of item blocks
 * param:  targetRMSE target test RMSE
 */
public  class ALSCleanerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   ALSCleanerSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  // not preceding
  public  void beforeEach ()  { throw new RuntimeException(); }
}
