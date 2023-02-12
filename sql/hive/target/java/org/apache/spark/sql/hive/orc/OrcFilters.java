package org.apache.spark.sql.hive.orc;
/**
 * Build a SearchArgument and return the builder so far.
 * <p>
 * param:  dataTypeMap a map from the attribute name to its data type.
 * param:  expression the input predicates, which should be fully convertible to SearchArgument.
 * param:  builder the input SearchArgument.Builder.
 * @return the builder so far.
 */
// not preceding
public  class OrcFilters {
  static public  scala.Option<org.apache.hadoop.hive.ql.io.sarg.SearchArgument> createFilter (org.apache.spark.sql.types.StructType schema, org.apache.spark.sql.sources.Filter[] filters)  { throw new RuntimeException(); }
  static public  scala.collection.Seq<org.apache.spark.sql.sources.Filter> convertibleFilters (org.apache.spark.sql.types.StructType schema, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.types.DataType> dataTypeMap, scala.collection.Seq<org.apache.spark.sql.sources.Filter> filters)  { throw new RuntimeException(); }
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
