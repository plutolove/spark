package org.apache.spark.sql.catalyst.optimizer;
/**
 * Visible for testing.
 * Collects all struct types from given data type object, recursively.
 */
// not preceding
public  class ObjectSerializerPruning {
  // not preceding
  static public  class IsNullCondition$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IsNullCondition$ MODULE$ = null;
    public   IsNullCondition$ ()  { throw new RuntimeException(); }
    // not preceding
    public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression expr)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.types.StructType> collectStructType (org.apache.spark.sql.types.DataType dt, scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.types.StructType> structs)  { throw new RuntimeException(); }
  // not preceding
  static public  org.apache.spark.sql.catalyst.expressions.NamedExpression pruneSerializer (org.apache.spark.sql.catalyst.expressions.NamedExpression serializer, org.apache.spark.sql.types.DataType prunedDataType)  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
  static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
}
