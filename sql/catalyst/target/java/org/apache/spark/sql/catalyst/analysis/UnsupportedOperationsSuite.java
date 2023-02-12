package org.apache.spark.sql.catalyst.analysis;
/**
 * Test that an unary operator correctly fails support check when it has a streaming child plan,
 * but not when it has batch child plan. There can be batch sub-plans inside a streaming plan,
 * so it is valid for the operator to have a batch child plan.
 * <p>
 * This test wraps the logical plan in a fake operator that makes the whole plan look like
 * a streaming plan even if the child plan is a batch plan. This is to test that the operator
 * supports having a batch child plan, forming a batch subplan inside a streaming plan.
 */
public  class UnsupportedOperationsSuite extends org.apache.spark.SparkFunSuite {
  public  class StreamingPlanWrapper extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child ()  { throw new RuntimeException(); }
    // not preceding
    public   StreamingPlanWrapper (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    public  boolean isStreaming ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class StreamingPlanWrapper$ extends scala.runtime.AbstractFunction1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.StreamingPlanWrapper> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final StreamingPlanWrapper$ MODULE$ = null;
    public   StreamingPlanWrapper$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class TestStreamingRelation extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    // not preceding
    public   TestStreamingRelation (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
    // not preceding
    public   TestStreamingRelation (org.apache.spark.sql.catalyst.expressions.Attribute attribute)  { throw new RuntimeException(); }
    public  boolean isStreaming ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class TestStreamingRelation$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.TestStreamingRelation> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestStreamingRelation$ MODULE$ = null;
    public   TestStreamingRelation$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class TestStreamingRelationV2 extends org.apache.spark.sql.catalyst.plans.logical.LeafNode implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
    // not preceding
    public   TestStreamingRelationV2 (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output)  { throw new RuntimeException(); }
    // not preceding
    public   TestStreamingRelationV2 (org.apache.spark.sql.catalyst.expressions.Attribute attribute)  { throw new RuntimeException(); }
    public  boolean isStreaming ()  { throw new RuntimeException(); }
    public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class TestStreamingRelationV2$ extends scala.runtime.AbstractFunction1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute>, org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.TestStreamingRelationV2> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestStreamingRelationV2$ MODULE$ = null;
    public   TestStreamingRelationV2$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   UnsupportedOperationsSuite ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggExprs (java.lang.String name)  { throw new RuntimeException(); }
  public  void assertFailOnGlobalWatermarkLimit (java.lang.String testNamePostfix, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /** Assert that the logical plan is not supported as a batch plan */
  public  void assertNotSupportedInBatchPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, scala.collection.Seq<java.lang.String> expectedMsgs)  { throw new RuntimeException(); }
  /**
   * Assert that the logical plan is not supported inside a streaming plan.
   * <p>
   * To test this correctly, the given logical plan is wrapped in a fake operator that makes the
   * whole plan look like a streaming plan. Otherwise, a batch plan may throw not supported
   * exception simply for not being a streaming plan, even though that plan could exist as batch
   * subplan inside some streaming plan.
   * @param name (undocumented)
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   * @param expectedMsgs (undocumented)
   */
  public  void assertNotSupportedInStreamingPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode, scala.collection.Seq<java.lang.String> expectedMsgs)  { throw new RuntimeException(); }
  public  void assertPassOnGlobalWatermarkLimit (java.lang.String testNamePostfix, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /** Assert that the logical plan is supported for continuous procsssing mode */
  public  void assertSupportedForContinuousProcessing (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  /** Assert that the logical plan is supported as a batch plan */
  public  void assertSupportedInBatchPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Assert that the logical plan is supported as subplan insider a streaming plan.
   * <p>
   * To test this correctly, the given logical plan is wrapped in a fake operator that makes the
   * whole plan look like a streaming plan. Otherwise, a batch plan may throw not supported
   * exception simply for not being a streaming plan, even though that plan could exist as batch
   * subplan inside some streaming plan.
   * @param name (undocumented)
   * @param plan (undocumented)
   * @param outputMode (undocumented)
   */
  public  void assertSupportedInStreamingPlan (java.lang.String name, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference att ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attribute ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference attributeWithWatermark ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LocalRelation batchRelation ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> distinctAggExprs ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan genCogroup (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan left, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan right)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.analysis.UnsupportedOperationsSuite.TestStreamingRelation streamRelation ()  { throw new RuntimeException(); }
  /**
   * Test that a binary operator correctly fails support check when it has combinations of
   * streaming and batch child plans. There can be batch sub-plans inside a streaming plan,
   * so it is valid for the operator to have a batch child plan.
   * @param operationName (undocumented)
   * @param planGenerator (undocumented)
   * @param outputMode (undocumented)
   * @param streamStreamSupported (undocumented)
   * @param streamBatchSupported (undocumented)
   * @param batchStreamSupported (undocumented)
   * @param expectedMsg (undocumented)
   */
  public  void testBinaryOperationInStreamingPlan (java.lang.String operationName, scala.Function2<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> planGenerator, org.apache.spark.sql.streaming.OutputMode outputMode, boolean streamStreamSupported, boolean streamBatchSupported, boolean batchStreamSupported, java.lang.String expectedMsg)  { throw new RuntimeException(); }
  /**
   * Test whether the body of code will fail. If it does fail, then check if it has expected
   * messages.
   * @param testName (undocumented)
   * @param expectedMsgs (undocumented)
   * @param testBody (undocumented)
   */
  public  void testError (java.lang.String testName, scala.collection.Seq<java.lang.String> expectedMsgs, scala.Function0<scala.runtime.BoxedUnit> testBody)  { throw new RuntimeException(); }
  public  void testGlobalWatermarkLimit (java.lang.String testNamePostfix, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan, org.apache.spark.sql.streaming.OutputMode outputMode, boolean expectFailure)  { throw new RuntimeException(); }
  /** Test output mode with and without aggregation in the streaming plan */
  public  void testOutputMode (org.apache.spark.sql.streaming.OutputMode outputMode, boolean shouldSupportAggregation, boolean shouldSupportNonAggregation)  { throw new RuntimeException(); }
  /**
   * Test that an unary operator correctly fails support check when it has a streaming child plan,
   * but not when it has batch child plan. There can be batch sub-plans inside a streaming plan,
   * so it is valid for the operator to have a batch child plan.
   * <p>
   * This test wraps the logical plan in a fake operator that makes the whole plan look like
   * a streaming plan even if the child plan is a batch plan. This is to test that the operator
   * supports having a batch child plan, forming a batch subplan inside a streaming plan.
   * @param operationName (undocumented)
   * @param logicalPlanGenerator (undocumented)
   * @param outputMode (undocumented)
   * @param expectedMsg (undocumented)
   */
  public  void testUnaryOperatorInStreamingPlan (java.lang.String operationName, scala.Function1<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> logicalPlanGenerator, org.apache.spark.sql.streaming.OutputMode outputMode, java.lang.String expectedMsg)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Metadata watermarkMetadata ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan wrapInStreaming (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
