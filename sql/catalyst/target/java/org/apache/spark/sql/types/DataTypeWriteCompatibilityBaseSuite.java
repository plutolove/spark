package org.apache.spark.sql.types;
public abstract class DataTypeWriteCompatibilityBaseSuite extends org.apache.spark.SparkFunSuite {
  // not preceding
  public   DataTypeWriteCompatibilityBaseSuite ()  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.types.DataType> allNonNullTypes ()  { throw new RuntimeException(); }
  public  void assertAllowed (org.apache.spark.sql.types.DataType writeType, org.apache.spark.sql.types.DataType readType, java.lang.String name, java.lang.String desc, boolean byName)  { throw new RuntimeException(); }
  public  void assertNumErrors (org.apache.spark.sql.types.DataType writeType, org.apache.spark.sql.types.DataType readType, java.lang.String name, java.lang.String desc, int numErrs, boolean byName, scala.Function1<scala.collection.Seq<java.lang.String>, scala.runtime.BoxedUnit> checkErrors)  { throw new RuntimeException(); }
  public  void assertSingleError (org.apache.spark.sql.types.DataType writeType, org.apache.spark.sql.types.DataType readType, java.lang.String name, java.lang.String desc, scala.Function1<java.lang.String, scala.runtime.BoxedUnit> errFunc)  { throw new RuntimeException(); }
  protected  scala.collection.Seq<org.apache.spark.sql.types.AtomicType> atomicTypes ()  { throw new RuntimeException(); }
  protected abstract  scala.Function2<org.apache.spark.sql.types.DataType, org.apache.spark.sql.types.DataType, java.lang.Object> canCast ()  ;
  protected  org.apache.spark.sql.types.StructType point2 ()  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.types.StructType point3 ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  scala.Enumeration.Value storeAssignmentPolicy ()  ;
  protected  org.apache.spark.sql.types.StructType widerPoint2 ()  { throw new RuntimeException(); }
}
