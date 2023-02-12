package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * Test suite for {@link GenerateUnsafeRowJoiner}.
 * <p>
 * There is also a separate {@link GenerateUnsafeRowJoinerBitsetSuite} that tests specifically
 * concatenation for the bitset portion, since that is the hardest one to get right.
 */
public  class GenerateUnsafeRowJoinerSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   GenerateUnsafeRowJoinerSuite ()  { throw new RuntimeException(); }
}
