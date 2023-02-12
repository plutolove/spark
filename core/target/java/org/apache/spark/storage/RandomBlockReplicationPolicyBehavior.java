package org.apache.spark.storage;
/**
 * Test if we get the required number of peers when using random sampling from
 * BlockReplicationPolicy
 */
public  class RandomBlockReplicationPolicyBehavior extends org.apache.spark.SparkFunSuite implements org.scalatest.Matchers, org.scalatest.BeforeAndAfter, org.apache.spark.LocalSparkContext {
  // not preceding
  public   RandomBlockReplicationPolicyBehavior ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AWord a ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AnWord an ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.BeWord be ()  { throw new RuntimeException(); }
  public  java.lang.String blockId ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.CompileWord compile ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ContainWord contain ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DecidedWord decided ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.DefinedWord defined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.DeterminedWord determined ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EmptyWord empty ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.EndWithWord endWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ExistWord exist ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.FullyMatchWord fullyMatch ()  { throw new RuntimeException(); }
  /**
   * Returns a sequence of {@link BlockManagerId}, whose rack is randomly picked from the given <code>racks</code>.
   * Note that, each rack will be picked at least once from <code>racks</code>, if <code>count</code> is greater or equal
   * to the number of <code>racks</code>.
   * @param count (undocumented)
   * @param racks (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<org.apache.spark.storage.BlockManagerId> generateBlockManagerIds (int count, scala.collection.Seq<java.lang.String> racks)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.HaveWord have ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.IncludeWord include ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.KeyWord key ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.LengthWord length ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.MatchPatternWord matchPattern ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.NotWord not ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ReadableWord readable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockReplicationPolicy replicationPolicy ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SizeWord size ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.SortedWord sorted ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.StartWithWord startWith ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.TheSameInstanceAsPhrase theSameInstanceAs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.TypeCheckWord typeCheck ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.ValueWord value ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.WritableWord writable ()  { throw new RuntimeException(); }
}
