package org.apache.spark.sql;
/**
 * Tests random data generation for the given type by using it to generate random values then
 * converting those values into their Catalyst equivalents using CatalystTypeConverters.
 */
public  class RandomDataGeneratorSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.plans.SQLHelper {
  // not preceding
  public   RandomDataGeneratorSuite ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<org.apache.spark.sql.types.DataType> atomicTypesWithDataGenerators ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  public  void testRandomDataGeneration (org.apache.spark.sql.types.DataType dataType, boolean nullable)  { throw new RuntimeException(); }
}
