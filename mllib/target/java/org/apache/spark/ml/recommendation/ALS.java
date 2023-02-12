package org.apache.spark.ml.recommendation;
/** @group setParam */
public  class ALS extends org.apache.spark.ml.Estimator<org.apache.spark.ml.recommendation.ALSModel> implements org.apache.spark.ml.recommendation.ALSParams, org.apache.spark.ml.util.DefaultParamsWritable {
  // not preceding
  static public  class Rating<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  ID user ()  { throw new RuntimeException(); }
    public  ID item ()  { throw new RuntimeException(); }
    public  float rating ()  { throw new RuntimeException(); }
    // not preceding
    public   Rating (ID user, ID item, float rating)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Rating$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Rating$ MODULE$ = null;
    public   Rating$ ()  { throw new RuntimeException(); }
  }
  /** Size of the block. */
  static   class InBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  int[] dstPtrs ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   InBlock (java.lang.Object srcIds, int[] dstPtrs, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$2)  { throw new RuntimeException(); }
    // not preceding
    public  int size ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class InBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final InBlock$ MODULE$ = null;
    public   InBlock$ ()  { throw new RuntimeException(); }
  }
  /** Size of the block. */
  static   class RatingBlock<ID extends java.lang.Object> implements scala.Product, scala.Serializable {
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
    public  java.lang.Object dstIds ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    // not preceding
    public   RatingBlock (java.lang.Object srcIds, java.lang.Object dstIds, float[] ratings, scala.reflect.ClassTag<ID> evidence$3)  { throw new RuntimeException(); }
    // not preceding
    public  int size ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class RatingBlock$ implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final RatingBlock$ MODULE$ = null;
    public   RatingBlock$ ()  { throw new RuntimeException(); }
  }
  /** Solves a least squares problem with regularization (possibly with other constraints). */
  static public  interface LeastSquaresNESolver extends scala.Serializable {
    // not preceding
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  ;
  }
  // not preceding
  static   class CholeskySolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    // not preceding
    public   CholeskySolver ()  { throw new RuntimeException(); }
    // not preceding
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
  }
  // not preceding
  static   class NNLSSolver implements org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver {
    // not preceding
    public   NNLSSolver ()  { throw new RuntimeException(); }
    /**
     * Solves a nonnegative least squares problem with L2 regularization:
     * <p>
     *   min_x_  norm(A x - b)^2^ + lambda * n * norm(x)^2^
     *   subject to x >= 0
     * @param ne (undocumented)
     * @param lambda (undocumented)
     * @return (undocumented)
     */
    public  float[] solve (org.apache.spark.ml.recommendation.ALS.NormalEquation ne, double lambda)  { throw new RuntimeException(); }
  }
  // not preceding
  static   class NormalEquation implements scala.Serializable {
    // not preceding
    public   NormalEquation (int k)  { throw new RuntimeException(); }
    /** Adds an observation. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation add (float[] a, double b, double c)  { throw new RuntimeException(); }
    /** A^T^ * A */
    public  double[] ata ()  { throw new RuntimeException(); }
    /** A^T^ * b */
    public  double[] atb ()  { throw new RuntimeException(); }
    // not preceding
    public  int k ()  { throw new RuntimeException(); }
    /** Merges another normal equation object. */
    public  org.apache.spark.ml.recommendation.ALS.NormalEquation merge (org.apache.spark.ml.recommendation.ALS.NormalEquation other)  { throw new RuntimeException(); }
    /** Resets everything to zero, which should be called after each solve. */
    public  void reset ()  { throw new RuntimeException(); }
    // not preceding
    public  int triK ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class RatingBlockBuilder<ID extends java.lang.Object> implements scala.Serializable {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   RatingBlockBuilder (scala.reflect.ClassTag<ID> evidence$4)  { throw new RuntimeException(); }
    /** Adds a rating. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> add (org.apache.spark.ml.recommendation.ALS.Rating<ID> r)  { throw new RuntimeException(); }
    /** Builds a {@link RatingBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> build ()  { throw new RuntimeException(); }
    /** Merges another {@link RatingBlockBuilder}. */
    public  org.apache.spark.ml.recommendation.ALS.RatingBlockBuilder<ID> merge (org.apache.spark.ml.recommendation.ALS.RatingBlock<ID> other)  { throw new RuntimeException(); }
    public  int size ()  { throw new RuntimeException(); }
  }
  /**
   * Adds a dst block of (srcId, dstLocalIndex, rating) tuples.
   * <p>
   * param:  dstBlockId dst block ID
   * param:  srcIds original src IDs
   * param:  dstLocalIndices dst local indices
   * param:  ratings ratings
   */
  static   class UncompressedInBlockBuilder<ID extends java.lang.Object> {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
    public   UncompressedInBlockBuilder (org.apache.spark.ml.recommendation.ALS.LocalIndexEncoder encoder, scala.reflect.ClassTag<ID> evidence$6, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    /**
     * Adds a dst block of (srcId, dstLocalIndex, rating) tuples.
     * <p>
     * @param dstBlockId dst block ID
     * @param srcIds original src IDs
     * @param dstLocalIndices dst local indices
     * @param ratings ratings
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlockBuilder<ID> add (int dstBlockId, java.lang.Object srcIds, int[] dstLocalIndices, float[] ratings)  { throw new RuntimeException(); }
    /** Builds a {@link UncompressedInBlock}. */
    public  org.apache.spark.ml.recommendation.ALS.UncompressedInBlock<ID> build ()  { throw new RuntimeException(); }
  }
  // not preceding
  static   class UncompressedInBlock<ID extends java.lang.Object> {
    // not preceding
    public   UncompressedInBlock (java.lang.Object srcIds, int[] dstEncodedIndices, float[] ratings, scala.reflect.ClassTag<ID> evidence$7, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
    /**
     * Compresses the block into an <code>InBlock</code>. The algorithm is the same as converting a sparse
     * matrix from coordinate list (COO) format into compressed sparse column (CSC) format.
     * Sorting is done using Spark's built-in Timsort to avoid generating too many objects.
     * @return (undocumented)
     */
    public  org.apache.spark.ml.recommendation.ALS.InBlock<ID> compress ()  { throw new RuntimeException(); }
    public  int[] dstEncodedIndices ()  { throw new RuntimeException(); }
    // not preceding
    public  int length ()  { throw new RuntimeException(); }
    public  float[] ratings ()  { throw new RuntimeException(); }
    public  java.lang.Object srcIds ()  { throw new RuntimeException(); }
  }
  /** Encodes a (blockId, localIndex) into a single integer. */
  static   class LocalIndexEncoder implements scala.Serializable {
    // not preceding
    public   LocalIndexEncoder (int numBlocks)  { throw new RuntimeException(); }
    /** Gets the block id from an encoded index. */
    public  int blockId (int encoded)  { throw new RuntimeException(); }
    /** Encodes a (blockId, localIndex) into a single integer. */
    public  int encode (int blockId, int localIndex)  { throw new RuntimeException(); }
    /** Gets the local index from an encoded index. */
    public  int localIndex (int encoded)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
  // not preceding
  static public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
  /**
   * Clean the shuffles &amp; all of its parents.
   * @param sc (undocumented)
   * @param deps (undocumented)
   * @param blocking (undocumented)
   */
  static  <T extends java.lang.Object> void cleanShuffleDependencies (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps, boolean blocking)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<T> read ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   void initializeForcefully (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam rank ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam numUserBlocks ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.IntParam numItemBlocks ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.BooleanParam implicitPrefs ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.DoubleParam alpha ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> ratingCol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.BooleanParam nonnegative ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> intermediateStorageLevel ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> finalStorageLevel ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam checkpointInterval ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.DoubleParam regParam ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam maxIter ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> userCol ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> itemCol ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.expressions.UserDefinedFunction checkedCast ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.param.Param<java.lang.String> coldStartStrategy ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.IntParam blockSize ()  { throw new RuntimeException(); }
  // not preceding
  public final  org.apache.spark.ml.param.Param<java.lang.String> predictionCol ()  { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  // not preceding
  public   ALS (java.lang.String uid)  { throw new RuntimeException(); }
  // not preceding
  public   ALS ()  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRank (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumUserBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNumItemBlocks (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setImplicitPrefs (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setAlpha (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setUserCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setItemCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRatingCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setPredictionCol (java.lang.String value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setMaxIter (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setRegParam (double value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setNonnegative (boolean value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setCheckpointInterval (int value)  { throw new RuntimeException(); }
  /** @group setParam */
  public  org.apache.spark.ml.recommendation.ALS setSeed (long value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setIntermediateStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setFinalStorageLevel (java.lang.String value)  { throw new RuntimeException(); }
  /** @group expertSetParam */
  public  org.apache.spark.ml.recommendation.ALS setColdStartStrategy (java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Set block size for stacking input data in matrices.
   * Default is 4096.
   * <p>
   * @group expertSetParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALS setBlockSize (int value)  { throw new RuntimeException(); }
  /**
   * Sets both numUserBlocks and numItemBlocks to the specific value.
   * <p>
   * @group setParam
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.ml.recommendation.ALS setNumBlocks (int value)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALSModel fit (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALS copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
}
