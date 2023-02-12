package org.apache.spark.deploy.history;
/**
 * Stub cache operations.
 * The state is kept in a map of {@link CacheKey} to {@link CacheEntry},
 * the <code>probeTime</code> field in the cache entry setting the timestamp of the entry
 */
public  class ApplicationCacheSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.internal.Logging, org.scalatestplus.mockito.MockitoSugar, org.scalatest.Matchers {
  // not preceding
  public  class StubCacheOperations implements org.apache.spark.deploy.history.ApplicationCacheOperations, org.apache.spark.internal.Logging {
    // not preceding
    public   StubCacheOperations ()  { throw new RuntimeException(); }
    public  long attachCount ()  { throw new RuntimeException(); }
    public  void attachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui, boolean completed)  { throw new RuntimeException(); }
    /** Map of attached spark UIs */
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.ui.SparkUI> attached ()  { throw new RuntimeException(); }
    public  long detachCount ()  { throw new RuntimeException(); }
    /**
     * Detach a reconstructed UI
     * <p>
     * @param ui Spark UI
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     */
    public  void detachSparkUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.ui.SparkUI ui)  { throw new RuntimeException(); }
    public  scala.Option<org.apache.spark.deploy.history.LoadedAppUI> getAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    public  long getAppUICount ()  { throw new RuntimeException(); }
    /**
     * Lookup from the internal cache of attached UIs
     * @param appId (undocumented)
     * @param attemptId (undocumented)
     * @return (undocumented)
     */
    public  scala.Option<org.apache.spark.ui.SparkUI> getAttached (java.lang.String appId, scala.Option<java.lang.String> attemptId)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.mutable.HashMap<org.apache.spark.deploy.history.CacheKey, org.apache.spark.deploy.history.CacheEntry> instances ()  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.LoadedAppUI putAndAttach (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
    public  org.apache.spark.deploy.history.LoadedAppUI putAppUI (java.lang.String appId, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
    public  long updateProbeCount ()  { throw new RuntimeException(); }
  }
  // not preceding
  public   ApplicationCacheSuite ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AWord a ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalactic.Explicitly.TheAfterWord after ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.AnWord an ()  { throw new RuntimeException(); }
  /**
   * Assert that a metric counter has a specific value; failure raises an exception
   * including the cache's toString value
   * @param name counter name (for exceptions)
   * @param counter counter
   * @param expected expected value.
   * @param cache cache
   */
  public  void assertMetric (java.lang.String name, com.codahale.metrics.Counter counter, long expected, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  /**
   * Assert that a key wasn't found in cache or loaded.
   * <p>
   * Looks for the specific nested exception raised by {@link ApplicationCache}
   * @param appId application ID
   * @param attemptId attempt ID
   * @param cache app cache
   */
  public  void assertNotFound (java.lang.String appId, scala.Option<java.lang.String> attemptId, org.apache.spark.deploy.history.ApplicationCache cache)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.BeWord be ()  { throw new RuntimeException(); }
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
  public  org.apache.spark.ui.SparkUI newUI (java.lang.String name, scala.Option<java.lang.String> attemptId, boolean completed, long started, long ended)  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.NotWord not ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.words.ReadableWord readable ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatest.Matchers.RegexWord regex ()  { throw new RuntimeException(); }
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
