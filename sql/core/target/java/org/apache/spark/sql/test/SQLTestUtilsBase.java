package org.apache.spark.sql.test;
/**
 * A helper object for importing SQL implicits.
 * <p>
 * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
 * This is because we create the <code>SQLContext</code> immediately before the first test is run,
 * but the implicits import is needed in the constructor.
 */
public  interface SQLTestUtilsBase extends org.scalatest.concurrent.Eventually, org.scalatest.BeforeAndAfterAll, org.apache.spark.sql.test.SQLTestData, org.apache.spark.sql.catalyst.plans.PlanTestBase {
  /**
   * A helper object for importing SQL implicits.
   * <p>
   * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
   * This is because we create the <code>SQLContext</code> immediately before the first test is run,
   * but the implicits import is needed in the constructor.
   */
  // not preceding
  protected  class testImplicits {
    // not preceding
    static protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
    static public <T extends scala.Product> org.apache.spark.sql.Encoder<T> newProductEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$8)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.SQLImplicits.StringToColumn StringToColumn (scala.StringContext sc)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newIntEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newLongEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newDoubleEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newFloatEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newByteEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newShortEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Object> newBooleanEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.String> newStringEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.math.BigDecimal> newJavaDecimalEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.math.BigDecimal> newScalaDecimalEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.sql.Date> newDateEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.LocalDate> newLocalDateEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.sql.Timestamp> newTimeStampEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.time.Instant> newInstantEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Integer> newBoxedIntEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Long> newBoxedLongEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Double> newBoxedDoubleEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Float> newBoxedFloatEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Byte> newBoxedByteEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Short> newBoxedShortEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.Boolean> newBoxedBooleanEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newIntSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newLongSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newDoubleSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newFloatSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newByteSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newShortSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.Object>> newBooleanSeqEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<scala.collection.Seq<java.lang.String>> newStringSeqEncoder ()  { throw new RuntimeException(); }
    static public <A extends scala.Product> org.apache.spark.sql.Encoder<scala.collection.Seq<A>> newProductSeqEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$1)  { throw new RuntimeException(); }
    static public <T extends scala.collection.Seq<?>> org.apache.spark.sql.Encoder<T> newSequenceEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$2)  { throw new RuntimeException(); }
    static public <T extends scala.collection.Map<?, ?>> org.apache.spark.sql.Encoder<T> newMapEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$3)  { throw new RuntimeException(); }
    static public <T extends scala.collection.immutable.Set<?>> org.apache.spark.sql.Encoder<T> newSetEncoder (scala.reflect.api.TypeTags.TypeTag<T> evidence$4)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<int[]> newIntArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<long[]> newLongArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<double[]> newDoubleArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<float[]> newFloatArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<byte[]> newByteArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<short[]> newShortArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<boolean[]> newBooleanArrayEncoder ()  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.Encoder<java.lang.String[]> newStringArrayEncoder ()  { throw new RuntimeException(); }
    static public <A extends scala.Product> org.apache.spark.sql.Encoder<java.lang.Object> newProductArrayEncoder (scala.reflect.api.TypeTags.TypeTag<A> evidence$5)  { throw new RuntimeException(); }
    static public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> rddToDatasetHolder (org.apache.spark.rdd.RDD<T> rdd, org.apache.spark.sql.Encoder<T> evidence$6)  { throw new RuntimeException(); }
    static public <T extends java.lang.Object> org.apache.spark.sql.DatasetHolder<T> localSeqToDatasetHolder (scala.collection.Seq<T> s, org.apache.spark.sql.Encoder<T> evidence$7)  { throw new RuntimeException(); }
    static public  org.apache.spark.sql.ColumnName symbolToColumn (scala.Symbol s)  { throw new RuntimeException(); }
  }
  /**
   * A helper object for importing SQL implicits.
   * <p>
   * Note that the alternative of importing <code>spark.implicits._</code> is not possible here.
   * This is because we create the <code>SQLContext</code> immediately before the first test is run,
   * but the implicits import is needed in the constructor.
   */
  // not preceding
  protected  class testImplicits$ extends org.apache.spark.sql.SQLImplicits {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final testImplicits$ MODULE$ = null;
    public   testImplicits$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
  }
  /**
   * Activates database <code>db</code> before executing <code>f</code>, then switches back to <code>default</code> database after
   * <code>f</code> returns.
   * @param db (undocumented)
   * @param f (undocumented)
   */
  public  void activateDatabase (java.lang.String db, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Returns the size of the local directory except the metadata file and the temporary file.
   * @param file (undocumented)
   * @return (undocumented)
   */
  public  long getLocalDirSize (java.io.File file)  ;
  /**
   * Turn a logical plan into a <code>DataFrame</code>. This should be removed once we have an easier
   * way to construct <code>DataFrame</code> directly out of local data without relying on implicits.
   * @param plan (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> logicalPlanToSparkQuery (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  ;
  /**
   * This method is used to make the given path qualified, when a path
   * does not contain a scheme, this path will not be changed after the default
   * FileSystem is changed.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  java.net.URI makeQualifiedPath (java.lang.String path)  ;
  public  org.apache.spark.SparkContext sparkContext ()  ;
  public  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  ;
  /**
   * Strip Spark-side filtering in order to check if a datasource filters rows correctly.
   * @param df (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> stripSparkFilter (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df)  ;
  /**
   * Returns full path to the given file in the resource folder
   * @param fileName (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String testFile (java.lang.String fileName)  ;
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  ;
  public  void uncacheTable (java.lang.String tableName)  ;
  /**
   * Drops cache <code>cacheName</code> after calling <code>f</code>.
   * @param cacheNames (undocumented)
   * @param f (undocumented)
   */
  public  void withCache (scala.collection.Seq<java.lang.String> cacheNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops database <code>dbName</code> after calling <code>f</code>.
   * @param dbNames (undocumented)
   * @param f (undocumented)
   */
  public  void withDatabase (scala.collection.Seq<java.lang.String> dbNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops global temporary view <code>viewNames</code> after calling <code>f</code>.
   * @param viewNames (undocumented)
   * @param f (undocumented)
   */
  public  void withGlobalTempView (scala.collection.Seq<java.lang.String> viewNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Enables Locale <code>language</code> before executing <code>f</code>, then switches back to the default locale of JVM
   * after <code>f</code> returns.
   * @param language (undocumented)
   * @param f (undocumented)
   */
  public  void withLocale (java.lang.String language, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops namespace <code>namespace</code> after calling <code>f</code>.
   * <p>
   * Note that, if you switch current catalog/namespace in <code>f</code>, you should switch it back manually.
   * @param namespaces (undocumented)
   * @param f (undocumented)
   */
  public  void withNamespace (scala.collection.Seq<java.lang.String> namespaces, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  // not preceding
  public  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops table <code>tableName</code> after calling <code>f</code>.
   * @param tableNames (undocumented)
   * @param f (undocumented)
   */
  public  void withTable (scala.collection.Seq<java.lang.String> tableNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Creates a temporary database and switches current database to it before executing <code>f</code>.  This
   * database is dropped after <code>f</code> returns.
   * <p>
   * Note that this method doesn't switch current database before executing <code>f</code>.
   * @param f (undocumented)
   */
  public  void withTempDatabase (scala.Function1<java.lang.String, scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops temporary view <code>viewNames</code> after calling <code>f</code>.
   * @param viewNames (undocumented)
   * @param f (undocumented)
   */
  public  void withTempView (scala.collection.Seq<java.lang.String> viewNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops functions after calling <code>f</code>. A function is represented by (functionName, isTemporary).
   * @param functions (undocumented)
   * @param f (undocumented)
   */
  public  void withUserDefinedFunction (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.Object>> functions, scala.Function0<scala.runtime.BoxedUnit> f)  ;
  /**
   * Drops view <code>viewName</code> after calling <code>f</code>.
   * @param viewNames (undocumented)
   * @param f (undocumented)
   */
  public  void withView (scala.collection.Seq<java.lang.String> viewNames, scala.Function0<scala.runtime.BoxedUnit> f)  ;
}
