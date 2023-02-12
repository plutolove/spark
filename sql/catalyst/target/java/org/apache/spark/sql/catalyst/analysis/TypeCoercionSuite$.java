package org.apache.spark.sql.catalyst.analysis;
/**
 * There are rules that need to not fire before child expressions get resolved.
 * We use this test to make sure those rules do not fire early.
 */
// not preceding
public  class TypeCoercionSuite$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TypeCoercionSuite$ MODULE$ = null;
  public   TypeCoercionSuite$ ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> integralTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> fractionalTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> numericTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> atomicTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> complexTypes ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.types.DataType> allTypes ()  { throw new RuntimeException(); }
}
