package org.apache.spark.sql.catalyst.expressions;
public abstract class CastSuiteBase extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  // not preceding
  public   CastSuiteBase ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscarded$ MaxDiscarded ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscardedFactor$ MaxDiscardedFactor ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxSize$ MaxSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSize$ MinSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSuccessful$ MinSuccessful ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfig$ PropertyCheckConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration$ PropertyCheckConfiguration ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.SizeRange$ SizeRange ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.Workers$ Workers ()  { throw new RuntimeException(); }
  protected abstract  org.apache.spark.sql.catalyst.expressions.CastBase cast (Object v, org.apache.spark.sql.types.DataType targetType, scala.Option<java.lang.String> timeZoneId)  ;
  protected  void checkCast (Object v, Object expected)  { throw new RuntimeException(); }
  protected  void checkNullCast (org.apache.spark.sql.types.DataType from, org.apache.spark.sql.types.DataType to)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration generatorDrivenConfig ()  { throw new RuntimeException(); }
  // not preceding
  protected abstract  boolean requiredAnsiEnabledForOverflowTestCases ()  ;
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}
