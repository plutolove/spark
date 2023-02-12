package org.apache.spark.sql;
/**
 * Test cases for the {@link SparkSessionExtensions}.
 */
public  class SparkSessionExtensionSuite extends org.apache.spark.SparkFunSuite {
  public  class MyHintRule extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements scala.Product, scala.Serializable {
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.SparkSession spark ()  { throw new RuntimeException(); }
    // not preceding
    public   MyHintRule (org.apache.spark.sql.SparkSession spark)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.immutable.Set<java.lang.String> MY_HINT_NAME ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MyHintRule$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.SparkSession, org.apache.spark.sql.SparkSessionExtensionSuite.MyHintRule> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MyHintRule$ MODULE$ = null;
    public   MyHintRule$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   SparkSessionExtensionSuite ()  { throw new RuntimeException(); }
}
