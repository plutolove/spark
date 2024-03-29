package org.apache.spark.scheduler;
/**
 * Integration tests for the OutputCommitCoordinator.
 * <p>
 * See also: {@link OutputCommitCoordinatorSuite} for unit tests that use mocks.
 */
public  class OutputCommitCoordinatorIntegrationSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.LocalSparkContext, org.scalatest.concurrent.TimeLimits {
  // not preceding
  public   OutputCommitCoordinatorIntegrationSuite ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
}
