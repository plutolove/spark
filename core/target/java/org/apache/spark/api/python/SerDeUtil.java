package org.apache.spark.api.python;
/**
 * Convert an RDD of Java objects to Array (no recursive conversions).
 * It is only used by pyspark.sql.
 */
// not preceding
public  class SerDeUtil {
  // not preceding
  static public  class ByteArrayConstructor extends net.razorvine.pickle.objects.ByteArrayConstructor {
    // not preceding
    public   ByteArrayConstructor ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class ArrayConstructor extends net.razorvine.pickle.objects.ArrayConstructor {
    // not preceding
    public   ArrayConstructor ()  { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args)  { throw new RuntimeException(); }
    // not preceding
    public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> machineCodes ()  { throw new RuntimeException(); }
  }
  /**
   * Choose batch size based on size of objects
   */
  static   class AutoBatchedPickler implements scala.collection.Iterator<byte[]> {
    // not preceding
    public   AutoBatchedPickler (scala.collection.Iterator<java.lang.Object> iter)  { throw new RuntimeException(); }
    public  boolean hasNext ()  { throw new RuntimeException(); }
    public  byte[] next ()  { throw new RuntimeException(); }
  }
  static public  void initialize ()  { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to Array (no recursive conversions).
   * It is only used by pyspark.sql.
   * @param jrdd (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> toJavaArray (org.apache.spark.api.java.JavaRDD<java.lang.Object> jrdd)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<?> jRDD)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   * @param pyRDD (undocumented)
   * @param batched (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of key-value pairs to an RDD of serialized Python objects, that is usable
   * by PySpark. By default, if serialization fails, toString is called and the string
   * representation is serialized
   * @param rdd (undocumented)
   * @param batchSize (undocumented)
   * @return (undocumented)
   */
  static public  org.apache.spark.rdd.RDD<byte[]> pairRDDToPython (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd, int batchSize)  { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python tuple (K, V) to RDD[(K, V)].
   * @param pyRDD (undocumented)
   * @param batched (undocumented)
   * @return (undocumented)
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> pythonToPairRDD (org.apache.spark.rdd.RDD<byte[]> pyRDD, boolean batched)  { throw new RuntimeException(); }
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
}
