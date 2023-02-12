package org.apache.spark.sql;
/**
 * Returns a {@link SQLContext} as new session, with separated SQL configurations, temporary
 * tables, registered functions, but sharing the same <code>SparkContext</code>, cached data and
 * other things.
 * <p>
 * @since 1.6.0
 */
public  class SQLContext implements org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * (Scala-specific) Implicit methods available in Scala for converting
   * common Scala objects into <code>DataFrame</code>s.
   * <p>
   * <pre><code>
   *   val sqlContext = new SQLContext(sc)
   *   import sqlContext.implicits._
   * </code></pre>
   * <p>
   * @group basic
   * @since 1.3.0
   */
  // not preceding
  public  class implicits$ extends org.apache.spark.sql.SQLImplicits implements scala.Serializable {
    public   implicits$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.SQLContext _sqlContext ()  { throw new RuntimeException(); }
  }
  // not preceding
  /**
   * @deprecated Use SparkSession.builder instead. Since 2.0.0. 
  */
  static public  org.apache.spark.sql.SQLContext getOrCreate (org.apache.spark.SparkContext sparkContext)  { throw new RuntimeException(); }
  /**
   * Changes the SQLContext that will be returned in this thread and its children when
   * SQLContext.getOrCreate() is called. This can be used to ensure that a given thread receives
   * a SQLContext with an isolated session, instead of the global (first created) context.
   * <p>
   * @since 1.6.0
   * @param sqlContext (undocumented)
   *
   * @deprecated Use SparkSession.setActiveSession instead. Since 2.0.0. 
   */
  static public  void setActive (org.apache.spark.sql.SQLContext sqlContext)  { throw new RuntimeException(); }
  /**
   * Clears the active SQLContext for current thread. Subsequent calls to getOrCreate will
   * return the first created context instead of a thread-local override.
   * <p>
   * @since 1.6.0
   *
   * @deprecated Use SparkSession.clearActiveSession instead. Since 2.0.0. 
   */
  static public  void clearActive ()  { throw new RuntimeException(); }
  /**
   * Converts an iterator of Java Beans to InternalRow using the provided
   * bean info &amp; schema. This is not related to the singleton, but is a static
   * method for internal use.
   * @param data (undocumented)
   * @param beanClass (undocumented)
   * @param attrs (undocumented)
   * @return (undocumented)
   */
  static   scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> beansToRows (scala.collection.Iterator<?> data, java.lang.Class<?> beanClass, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attrs)  { throw new RuntimeException(); }
  /**
   * Extract <code>spark.sql.*</code> properties from the conf and return them as a {@link Properties}.
   * @param sparkConf (undocumented)
   * @return (undocumented)
   */
  static   java.util.Properties getSQLProperties (org.apache.spark.SparkConf sparkConf)  { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext.implicits$ implicits ()  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a <code>DataFrame</code>. This function returns an empty
   * <code>DataFrame</code> if no paths are passed in.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().parquet()</code>.
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquetFile (java.lang.String... paths)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.SparkSession sparkSession ()  { throw new RuntimeException(); }
  // not preceding
     SQLContext (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
  /**
   * @deprecated Use SparkSession.builder instead. Since 2.0.0. 
  */
  public   SQLContext (org.apache.spark.SparkContext sc)  { throw new RuntimeException(); }
  /**
   * @deprecated Use SparkSession.builder instead. Since 2.0.0. 
  */
  public   SQLContext (org.apache.spark.api.java.JavaSparkContext sparkContext)  { throw new RuntimeException(); }
    org.apache.spark.sql.internal.SessionState sessionState ()  { throw new RuntimeException(); }
    org.apache.spark.sql.internal.SharedState sharedState ()  { throw new RuntimeException(); }
    org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  /**
   * Returns a {@link SQLContext} as new session, with separated SQL configurations, temporary
   * tables, registered functions, but sharing the same <code>SparkContext</code>, cached data and
   * other things.
   * <p>
   * @since 1.6.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.SQLContext newSession ()  { throw new RuntimeException(); }
  /**
   * An interface to register custom {@link org.apache.spark.sql.util.QueryExecutionListener}s
   * that listen for execution metrics.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.util.ExecutionListenerManager listenerManager ()  { throw new RuntimeException(); }
  /**
   * Set Spark SQL configuration properties.
   * <p>
   * @group config
   * @since 1.0.0
   * @param props (undocumented)
   */
  public  void setConf (java.util.Properties props)  { throw new RuntimeException(); }
  /**
   * Set the given Spark SQL configuration property.
   * @param entry (undocumented)
   * @param value (undocumented)
   */
   <T extends java.lang.Object> void setConf (org.apache.spark.internal.config.ConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
  /**
   * Set the given Spark SQL configuration property.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @param value (undocumented)
   */
  public  void setConf (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getConf (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code>.
   * <p>
   * @group config
   * @since 1.0.0
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Return all the configuration properties that have been set (i.e. not the default).
   * This creates a new copy of the config properties in the form of a Map.
   * <p>
   * @group config
   * @since 1.0.0
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAllConfs ()  { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * A collection of methods that are considered experimental, but can be used to hook into
   * the query planner for advanced functionality.
   * <p>
   * @group basic
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.ExperimentalMethods experimental ()  { throw new RuntimeException(); }
  /**
   * Returns a <code>DataFrame</code> with no rows or columns.
   * <p>
   * @group basic
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyDataFrame ()  { throw new RuntimeException(); }
  /**
   * A collection of methods for registering user-defined functions (UDF).
   * <p>
   * The following example registers a Scala closure as UDF:
   * <pre><code>
   *   sqlContext.udf.register("myUDF", (arg1: Int, arg2: String) =&gt; arg2 + arg1)
   * </code></pre>
   * <p>
   * The following example registers a UDF in Java:
   * <pre><code>
   *   sqlContext.udf().register("myUDF",
   *       (Integer arg1, String arg2) -&gt; arg2 + arg1,
   *       DataTypes.StringType);
   * </code></pre>
   * <p>
   * @note The user-defined functions must be deterministic. Due to optimization,
   * duplicate invocations may be eliminated or the function may even be invoked more times than
   * it is present in the query.
   * <p>
   * @group basic
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.UDFRegistration udf ()  { throw new RuntimeException(); }
  /**
   * Returns true if the table is currently cached in-memory.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  boolean isCached (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Caches the specified table in-memory.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   */
  public  void cacheTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Removes the specified table from the in-memory cache.
   * @group cachemgmt
   * @since 1.3.0
   * @param tableName (undocumented)
   */
  public  void uncacheTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Removes all cached tables from the in-memory cache.
   * @since 1.3.0
   */
  public  void clearCache ()  { throw new RuntimeException(); }
  // not preceding
  public <A extends scala.Product> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<A> rdd, scala.reflect.api.TypeTags.TypeTag<A> evidence$1)  { throw new RuntimeException(); }
  /**
   * Creates a DataFrame from a local Seq of Product.
   * <p>
   * @group dataframes
   * @since 1.3.0
   * @param data (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  public <A extends scala.Product> org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (scala.collection.Seq<A> data, scala.reflect.api.TypeTags.TypeTag<A> evidence$2)  { throw new RuntimeException(); }
  /**
   * Convert a <code>BaseRelation</code> created for external data sources into a <code>DataFrame</code>.
   * <p>
   * @group dataframes
   * @since 1.3.0
   * @param baseRelation (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> baseRelationToDataFrame (org.apache.spark.sql.sources.BaseRelation baseRelation)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from an <code>RDD</code> containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided RDD matches
   * the provided schema. Otherwise, there will be runtime exception.
   * Example:
   * <pre><code>
   *  import org.apache.spark.sql._
   *  import org.apache.spark.sql.types._
   *  val sqlContext = new org.apache.spark.sql.SQLContext(sc)
   *
   *  val schema =
   *    StructType(
   *      StructField("name", StringType, false) ::
   *      StructField("age", IntegerType, true) :: Nil)
   *
   *  val people =
   *    sc.textFile("examples/src/main/resources/people.txt").map(
   *      _.split(",")).map(p =&gt; Row(p(0), p(1).trim.toInt))
   *  val dataFrame = sqlContext.createDataFrame(people, schema)
   *  dataFrame.printSchema
   *  // root
   *  // |-- name: string (nullable = false)
   *  // |-- age: integer (nullable = true)
   *
   *  dataFrame.createOrReplaceTempView("people")
   *  sqlContext.sql("select name from people").collect.foreach(println)
   * </code></pre>
   * <p>
   * @group dataframes
   * @since 1.3.0
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from a local Seq of data of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * == Example ==
   * <p>
   * <pre><code>
   *
   *   import spark.implicits._
   *   case class Person(name: String, age: Long)
   *   val data = Seq(Person("Michael", 29), Person("Andy", 30), Person("Justin", 19))
   *   val ds = spark.createDataset(data)
   *
   *   ds.show()
   *   // +-------+---+
   *   // |   name|age|
   *   // +-------+---+
   *   // |Michael| 29|
   *   // |   Andy| 30|
   *   // | Justin| 19|
   *   // +-------+---+
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @group dataset
   * @param data (undocumented)
   * @param evidence$3 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (scala.collection.Seq<T> data, org.apache.spark.sql.Encoder<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from an RDD of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * @since 2.0.0
   * @group dataset
   * @param data (undocumented)
   * @param evidence$4 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (org.apache.spark.rdd.RDD<T> data, org.apache.spark.sql.Encoder<T> evidence$4)  { throw new RuntimeException(); }
  /**
   * Creates a {@link Dataset} from a <code>java.util.List</code> of a given type. This method requires an
   * encoder (to convert a JVM object of type <code>T</code> to and from the internal Spark SQL representation)
   * that is generally created automatically through implicits from a <code>SparkSession</code>, or can be
   * created explicitly by calling static methods on {@link Encoders}.
   * <p>
   * == Java Example ==
   * <p>
   * <pre><code>
   *     List&lt;String&gt; data = Arrays.asList("hello", "world");
   *     Dataset&lt;String&gt; ds = spark.createDataset(data, Encoders.STRING());
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @group dataset
   * @param data (undocumented)
   * @param evidence$5 (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> org.apache.spark.sql.Dataset<T> createDataset (java.util.List<T> data, org.apache.spark.sql.Encoder<T> evidence$5)  { throw new RuntimeException(); }
  /**
   * Creates a DataFrame from an RDD[Row]. User can specify whether the input rows should be
   * converted to Catalyst rows.
   * @param catalystRows (undocumented)
   * @param schema (undocumented)
   * @param isStreaming (undocumented)
   * @return (undocumented)
   */
    org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> internalCreateDataFrame (org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> catalystRows, org.apache.spark.sql.types.StructType schema, boolean isStreaming)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from a <code>JavaRDD</code> containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided RDD matches
   * the provided schema. Otherwise, there will be runtime exception.
   * <p>
   * @group dataframes
   * @since 1.3.0
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Creates a <code>DataFrame</code> from a <code>java.util.List</code> containing {@link Row}s using the given schema.
   * It is important to make sure that the structure of every {@link Row} of the provided List matches
   * the provided schema. Otherwise, there will be runtime exception.
   * <p>
   * @group dataframes
   * @since 1.6.0
   * @param rows (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (java.util.List<org.apache.spark.sql.Row> rows, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Applies a schema to an RDD of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   *          SELECT * queries will return the columns in an undefined order.
   * @group dataframes
   * @since 1.3.0
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.rdd.RDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Applies a schema to an RDD of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   *          SELECT * queries will return the columns in an undefined order.
   * @group dataframes
   * @since 1.3.0
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (org.apache.spark.api.java.JavaRDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Applies a schema to a List of Java Beans.
   * <p>
   * WARNING: Since there is no guaranteed ordering for fields in a Java Bean,
   *          SELECT * queries will return the columns in an undefined order.
   * @group dataframes
   * @since 1.6.0
   * @param data (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createDataFrame (java.util.List<?> data, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Returns a {@link DataFrameReader} that can be used to read non-streaming data in as a
   * <code>DataFrame</code>.
   * <pre><code>
   *   sqlContext.read.parquet("/path/to/file.parquet")
   *   sqlContext.read.schema(schema).json("/path/to/file.json")
   * </code></pre>
   * <p>
   * @group genericdata
   * @since 1.4.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.DataFrameReader read ()  { throw new RuntimeException(); }
  /**
   * Returns a <code>DataStreamReader</code> that can be used to read streaming data in as a <code>DataFrame</code>.
   * <pre><code>
   *   sparkSession.readStream.parquet("/path/to/directory/of/parquet/files")
   *   sparkSession.readStream.schema(schema).json("/path/to/directory/of/json/files")
   * </code></pre>
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.DataStreamReader readStream ()  { throw new RuntimeException(); }
  /**
   * Creates an external table from the given path and returns the corresponding DataFrame.
   * It will use the default data source configured by spark.sql.sources.default.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Creates an external table from the given path based on a data source
   * and returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String path, java.lang.String source)  { throw new RuntimeException(); }
  /**
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Creates an external table from the given path based on a data source and a set of options.
   * Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Scala-specific)
   * Create an external table from the given path based on a data source, a schema and
   * a set of options. Then, returns the corresponding DataFrame.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   *
   * @deprecated use sparkSession.catalog.createTable instead. Since 2.2.0. 
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> createExternalTable (java.lang.String tableName, java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Registers the given <code>DataFrame</code> as a temporary table in the catalog. Temporary tables exist
   * only during the lifetime of this instance of SQLContext.
   * @param df (undocumented)
   * @param tableName (undocumented)
   */
    void registerDataFrameAsTable (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Drops the temporary table with the given table name in the catalog. If the table has been
   * cached/persisted before, it's also unpersisted.
   * <p>
   * @param tableName the name of the table to be unregistered.
   * @group basic
   * @since 1.3.0
   */
  public  void dropTempTable (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from 0 to <code>end</code> (exclusive) with step value 1.
   * <p>
   * @since 1.4.1
   * @group dataframe
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> range (long end)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from <code>start</code> to <code>end</code> (exclusive) with step value 1.
   * <p>
   * @since 1.4.0
   * @group dataframe
   * @param start (undocumented)
   * @param end (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> range (long start, long end)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in a range from <code>start</code> to <code>end</code> (exclusive) with a step value.
   * <p>
   * @since 2.0.0
   * @group dataframe
   * @param start (undocumented)
   * @param end (undocumented)
   * @param step (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> range (long start, long end, long step)  { throw new RuntimeException(); }
  /**
   * Creates a <code>DataFrame</code> with a single <code>LongType</code> column named <code>id</code>, containing elements
   * in an range from <code>start</code> to <code>end</code> (exclusive) with an step value, with partition number
   * specified.
   * <p>
   * @since 1.4.0
   * @group dataframe
   * @param start (undocumented)
   * @param end (undocumented)
   * @param step (undocumented)
   * @param numPartitions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> range (long start, long end, long step, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Executes a SQL query using Spark, returning the result as a <code>DataFrame</code>.
   * This API eagerly runs DDL/DML commands, but not for SELECT queries.
   * <p>
   * @group basic
   * @since 1.3.0
   * @param sqlText (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> sql (java.lang.String sqlText)  { throw new RuntimeException(); }
  /**
   * Returns the specified table as a <code>DataFrame</code>.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param tableName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> table (java.lang.String tableName)  { throw new RuntimeException(); }
  /**
   * Returns a <code>DataFrame</code> containing names of existing tables in the current database.
   * The returned DataFrame has three columns, database, tableName and isTemporary (a Boolean
   * indicating if a table is a temporary one or not).
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tables ()  { throw new RuntimeException(); }
  /**
   * Returns a <code>DataFrame</code> containing names of existing tables in the given database.
   * The returned DataFrame has three columns, database, tableName and isTemporary (a Boolean
   * indicating if a table is a temporary one or not).
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param databaseName (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tables (java.lang.String databaseName)  { throw new RuntimeException(); }
  /**
   * Returns a <code>StreamingQueryManager</code> that allows managing all the
   * {@link org.apache.spark.sql.streaming.StreamingQuery StreamingQueries} active on <code>this</code> context.
   * <p>
   * @since 2.0.0
   * @return (undocumented)
   */
  public  org.apache.spark.sql.streaming.StreamingQueryManager streams ()  { throw new RuntimeException(); }
  /**
   * Returns the names of tables in the current database as an array.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @return (undocumented)
   */
  public  java.lang.String[] tableNames ()  { throw new RuntimeException(); }
  /**
   * Returns the names of tables in the given database as an array.
   * <p>
   * @group ddl_ops
   * @since 1.3.0
   * @param databaseName (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String[] tableNames (java.lang.String databaseName)  { throw new RuntimeException(); }
  /**
   * @deprecated As of 1.3.0, replaced by <code>createDataFrame()</code>.
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchema (org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * @deprecated As of 1.3.0, replaced by <code>createDataFrame()</code>.
   * @param rowRDD (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchema (org.apache.spark.api.java.JavaRDD<org.apache.spark.sql.Row> rowRDD, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * @deprecated As of 1.3.0, replaced by <code>createDataFrame()</code>.
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchema (org.apache.spark.rdd.RDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * @deprecated As of 1.3.0, replaced by <code>createDataFrame()</code>.
   * @param rdd (undocumented)
   * @param beanClass (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> applySchema (org.apache.spark.api.java.JavaRDD<?> rdd, java.lang.Class<?> beanClass)  { throw new RuntimeException(); }
  /**
   * Loads a Parquet file, returning the result as a <code>DataFrame</code>. This function returns an empty
   * <code>DataFrame</code> if no paths are passed in.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().parquet()</code>.
   * @param paths (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> parquetFile (scala.collection.Seq<java.lang.String> paths)  { throw new RuntimeException(); }
  /**
   * Loads a JSON file (one object per line), returning the result as a <code>DataFrame</code>.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonFile (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Loads a JSON file (one object per line) and applies the given schema,
   * returning the result as a <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param path (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonFile (java.lang.String path, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param path (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonFile (java.lang.String path, double samplingRatio)  { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record), returning the result as a
   * <code>DataFrame</code>.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json)  { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record), returning the result as a
   * <code>DataFrame</code>.
   * It goes through the entire dataset once to determine the schema.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json)  { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record) and applies the given schema,
   * returning the result as a <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Loads an JavaRDD[String] storing JSON objects (one object per record) and applies the given
   * schema, returning the result as a <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @param schema (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  /**
   * Loads an RDD[String] storing JSON objects (one object per record) inferring the
   * schema, returning the result as a <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.rdd.RDD<java.lang.String> json, double samplingRatio)  { throw new RuntimeException(); }
  /**
   * Loads a JavaRDD[String] storing JSON objects (one object per record) inferring the
   * schema, returning the result as a <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().json()</code>.
   * @param json (undocumented)
   * @param samplingRatio (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jsonRDD (org.apache.spark.api.java.JavaRDD<java.lang.String> json, double samplingRatio)  { throw new RuntimeException(); }
  /**
   * Returns the dataset stored at path as a DataFrame,
   * using the default data source configured by spark.sql.sources.default.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().load(path)</code>.
   * @param path (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * Returns the dataset stored at path as a DataFrame, using the given data source.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).load(path)</code>.
   * @param path (undocumented)
   * @param source (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String path, java.lang.String source)  { throw new RuntimeException(); }
  /**
   * (Java-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).options(options).load()</code>.
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String source, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by <code>read().format(source).options(options).load()</code>.
   * @param source (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String source, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Java-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame, using the given schema as the schema of the DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by
   *            <code>read().format(source).schema(schema).options(options).load()</code>.
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String source, org.apache.spark.sql.types.StructType schema, java.util.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * (Scala-specific) Returns the dataset specified by the given data source and
   * a set of options as a DataFrame, using the given schema as the schema of the DataFrame.
   * <p>
   * @group genericdata
   * @deprecated As of 1.4.0, replaced by
   *            <code>read().format(source).schema(schema).options(options).load()</code>.
   * @param source (undocumented)
   * @param schema (undocumented)
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> load (java.lang.String source, org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>.
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table.  Partitions of the table will be retrieved in parallel based on the parameters
   * passed to this function.
   * <p>
   * @param columnName the name of a column of integral type that will be used for partitioning.
   * @param lowerBound the minimum value of <code>columnName</code> used to decide partition stride
   * @param upperBound the maximum value of <code>columnName</code> used to decide partition stride
   * @param numPartitions the number of partitions.  the range <code>minValue</code>-<code>maxValue</code> will be split
   *                      evenly into this many partitions
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>.
   * @param url (undocumented)
   * @param table (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table, java.lang.String columnName, long lowerBound, long upperBound, int numPartitions)  { throw new RuntimeException(); }
  /**
   * Construct a <code>DataFrame</code> representing the database table accessible via JDBC URL
   * url named table. The theParts parameter gives a list expressions
   * suitable for inclusion in WHERE clauses; each one defines one partition
   * of the <code>DataFrame</code>.
   * <p>
   * @group specificdata
   * @deprecated As of 1.4.0, replaced by <code>read().jdbc()</code>.
   * @param url (undocumented)
   * @param table (undocumented)
   * @param theParts (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> jdbc (java.lang.String url, java.lang.String table, java.lang.String[] theParts)  { throw new RuntimeException(); }
}
