package org.apache.spark.deploy.history;
/**
 * Verify that the security manager needed for the history server can be instantiated
 * when <code>spark.authenticate</code> is <code>true</code>, rather than raise an <code>IllegalArgumentException</code>.
 */
public  class HistoryServerSuite extends org.apache.spark.SparkFunSuite implements org.scalatest.BeforeAndAfter, org.scalatest.Matchers, org.scalatestplus.mockito.MockitoSugar, org.apache.spark.JsonTestUtils, org.scalatest.concurrent.Eventually, org.scalatestplus.selenium.WebBrowser, org.apache.spark.LocalSparkContext, org.apache.spark.util.ResetSystemProperties {
  // not preceding
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
  static public  scala.Tuple3<java.lang.Object, scala.Option<java.io.InputStream>, scala.Option<java.lang.String>> connectAndGetInputStream (java.net.URL url)  { throw new RuntimeException(); }
  static public  java.lang.String sanitizePath (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  public  java.util.Properties oldProperties ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.SparkContext sc ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.Point$ Point ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.Dimension$ Dimension ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatestplus.selenium.WebBrowser.CookiesNoun cookies ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.go$ go ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.IdQuery$ IdQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.NameQuery$ NameQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.XPathQuery$ XPathQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.ClassNameQuery$ ClassNameQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.CssSelectorQuery$ CssSelectorQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.LinkTextQuery$ LinkTextQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.PartialLinkTextQuery$ PartialLinkTextQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.TagNameQuery$ TagNameQuery ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.click$ click ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatestplus.selenium.WebBrowser.ActiveElementTarget activeElement ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatestplus.selenium.WebBrowser.AlertTarget alertBox ()  { throw new RuntimeException(); }
  // not preceding
  public  org.scalatestplus.selenium.WebBrowser.DefaultContentTarget defaultContent ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.add$ add ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.delete$ delete ()  { throw new RuntimeException(); }
  public  org.scalatestplus.selenium.WebBrowser.capture$ capture ()  { throw new RuntimeException(); }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
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
  public   HistoryServerSuite ()  { throw new RuntimeException(); }
  public  void init (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> extraConf)  { throw new RuntimeException(); }
  public  void stop ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> cases ()  { throw new RuntimeException(); }
  public  void doDownloadTest (java.lang.String appId, scala.Option<java.lang.Object> attemptId)  { throw new RuntimeException(); }
  public  scala.Tuple3<java.lang.Object, scala.Option<java.lang.String>, scala.Option<java.lang.String>> getContentAndCode (java.lang.String path, int port)  { throw new RuntimeException(); }
  public  java.lang.String getUrl (java.lang.String path)  { throw new RuntimeException(); }
  public  java.net.URL generateURL (java.lang.String path)  { throw new RuntimeException(); }
  public  void generateExpectation (java.lang.String name, java.lang.String path)  { throw new RuntimeException(); }
}
