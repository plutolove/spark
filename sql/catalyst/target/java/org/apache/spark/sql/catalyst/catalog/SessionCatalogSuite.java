package org.apache.spark.sql.catalyst.catalog;
/**
 * Tests for {@link SessionCatalog}
 * <p>
 * Note: many of the methods here are very similar to the ones in {@link ExternalCatalogSuite}.
 * This is because {@link SessionCatalog} and {@link ExternalCatalog} share many similar method
 * signatures but do not extend a common parent. This is largely by design but
 * unfortunately leads to very similar test code in two places.
 */
public abstract class SessionCatalogSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.analysis.AnalysisTest {
  // not preceding
  public   SessionCatalogSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseInsensitiveAnalyzer ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.catalyst.analysis.Analyzer caseSensitiveAnalyzer ()  { throw new RuntimeException(); }
  protected  boolean isHiveExternalCatalog ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  public  void testInvalidName (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> func)  { throw new RuntimeException(); }
  // not preceding
  protected abstract  org.apache.spark.sql.catalyst.catalog.CatalogTestUtils utils ()  ;
}
