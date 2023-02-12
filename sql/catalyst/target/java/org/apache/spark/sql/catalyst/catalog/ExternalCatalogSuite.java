package org.apache.spark.sql.catalyst.catalog;
/**
 * A reasonable complete test suite (i.e. behaviors) for a {@link ExternalCatalog}.
 * <p>
 * Implementations of the {@link ExternalCatalog} interface can create test suites by extending this.
 */
public abstract class ExternalCatalogSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfterEach {
  // not preceding
  public   ExternalCatalogSuite ()  { throw new RuntimeException(); }
  public  void afterEach ()  { throw new RuntimeException(); }
  protected  void resetState ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  ;
}
