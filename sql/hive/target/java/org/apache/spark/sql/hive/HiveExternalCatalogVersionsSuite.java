package org.apache.spark.sql.hive;
/**
 * Test HiveExternalCatalog backward compatibility.
 * <p>
 * Note that, this test suite will automatically download spark binary packages of different
 * versions to a local directory <code>/tmp/spark-test</code>. If there is already a spark folder with
 * expected version under this local directory, e.g. <code>/tmp/spark-test/spark-2.0.3</code>, we will skip the
 * downloading for this spark version.
 */
public  class HiveExternalCatalogVersionsSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.hive.SparkSubmitTestUtils {
  // not preceding
  public   HiveExternalCatalogVersionsSuite ()  { throw new RuntimeException(); }
  public  void afterAll ()  { throw new RuntimeException(); }
  public  void beforeAll ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.concurrent.Signaler defaultSignaler ()  { throw new RuntimeException(); }
}
