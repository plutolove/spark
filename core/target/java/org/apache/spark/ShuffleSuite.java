package org.apache.spark;
public abstract class ShuffleSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.apache.spark.LocalSparkContext {
  // not preceding
  static public  class AggregatedShuffleMetrics implements scala.Product, scala.Serializable {
    // not preceding
    public  long recordsWritten ()  { throw new RuntimeException(); }
    public  long recordsRead ()  { throw new RuntimeException(); }
    public  long bytesWritten ()  { throw new RuntimeException(); }
    public  long byresRead ()  { throw new RuntimeException(); }
    // not preceding
    public   AggregatedShuffleMetrics (long recordsWritten, long recordsRead, long bytesWritten, long byresRead)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class AggregatedShuffleMetrics$ extends scala.runtime.AbstractFunction4<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final AggregatedShuffleMetrics$ MODULE$ = null;
    public   AggregatedShuffleMetrics$ ()  { throw new RuntimeException(); }
  }
  static public  class NonJavaSerializableClass implements java.lang.Comparable<org.apache.spark.ShuffleSuite.NonJavaSerializableClass> {
    // not preceding
    public   NonJavaSerializableClass (int value)  { throw new RuntimeException(); }
    // not preceding
    public  int compareTo (org.apache.spark.ShuffleSuite.NonJavaSerializableClass o)  { throw new RuntimeException(); }
    // not preceding
    public  int value ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  int mergeCombineException (int x, int y)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.ShuffleSuite.AggregatedShuffleMetrics runAndReturnMetrics (org.apache.spark.SparkContext sc, scala.Function0<scala.runtime.BoxedUnit> job)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AWord a ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AnWord an ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.StartWithWord startWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EndWithWord endWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.IncludeWord include ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.HaveWord have ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.BeWord be ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ContainWord contain ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.NotWord not ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.LengthWord length ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SizeWord size ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SortedWord sorted ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.DefinedWord defined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ExistWord exist ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ReadableWord readable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.WritableWord writable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EmptyWord empty ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.CompileWord compile ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  // not preceding
  public   ShuffleSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
}
