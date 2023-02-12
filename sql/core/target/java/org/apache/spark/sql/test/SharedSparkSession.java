package org.apache.spark.sql.test;
/**
 * Suites extending {@link SharedSparkSession} are sharing resources (eg. SparkSession) in their
 * tests. That trait initializes the spark session in its {@link beforeAll()} implementation before
 * the automatic thread snapshot is performed, so the audit code could fail to report threads
 * leaked by that shared session.
 * <p>
 * The behavior is overridden here to take the snapshot before the spark session is initialized.
 */
public  interface SharedSparkSession extends org.apache.spark.sql.test.SQLTestUtils, org.apache.spark.sql.test.SharedSparkSessionBase {
  public  void afterAll ()  ;
  public  void beforeAll ()  ;
  /**
   * Suites extending {@link SharedSparkSession} are sharing resources (eg. SparkSession) in their
   * tests. That trait initializes the spark session in its {@link beforeAll()} implementation before
   * the automatic thread snapshot is performed, so the audit code could fail to report threads
   * leaked by that shared session.
   * <p>
   * The behavior is overridden here to take the snapshot before the spark session is initialized.
   * @return (undocumented)
   */
  public  boolean enableAutoThreadAudit ()  ;
}
