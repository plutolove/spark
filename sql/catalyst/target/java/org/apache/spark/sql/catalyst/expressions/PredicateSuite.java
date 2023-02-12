package org.apache.spark.sql.catalyst.expressions;
/**
 * Checks for three-valued-logic.  Based on:
 * http://en.wikipedia.org/wiki/Null_(SQL)#Comparisons_with_NULL_and_the_three-valued_logic_.283VL.29
 * I.e. in flat cpo "False -> Unknown -> True",
 *   OR is lowest upper bound,
 *   AND is greatest lower bound.
 * p       q       p OR q  p AND q  p = q
 * True    True    True    True     True
 * True    False   True    False    False
 * True    Unknown True    Unknown  Unknown
 * False   True    True    False    False
 * False   False   False   False    True
 * False   Unknown Unknown False    Unknown
 * Unknown True    True    Unknown  Unknown
 * Unknown False   Unknown False    Unknown
 * Unknown Unknown Unknown Unknown  Unknown
 * <p>
 * p       NOT p
 * True    False
 * False   True
 * Unknown Unknown
 */
public  class PredicateSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.expressions.ExpressionEvalHelper {
  public  org.scalatest.prop.Configuration.MaxDiscarded$ MaxDiscarded ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxDiscardedFactor$ MaxDiscardedFactor ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MaxSize$ MaxSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSize$ MinSize ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.MinSuccessful$ MinSuccessful ()  { throw new RuntimeException(); }
  // not preceding
  public   PredicateSuite ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfig$ PropertyCheckConfig ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration$ PropertyCheckConfiguration ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.SizeRange$ SizeRange ()  { throw new RuntimeException(); }
  public  org.scalatest.prop.Configuration.Workers$ Workers ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.prop.Configuration.PropertyCheckConfiguration generatorDrivenConfig ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}
