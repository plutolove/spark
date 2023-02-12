package org.apache.spark.sql;
// not preceding
public  class NoCloseColumnVector extends org.apache.spark.sql.vectorized.ColumnVector implements scala.Product, scala.Serializable {
  // not preceding
  static public  org.apache.spark.sql.NoCloseColumnVector wrapIfNeeded (org.apache.spark.sql.vectorized.ColumnVector cv)  { throw new RuntimeException(); }
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
  public  org.apache.spark.sql.vectorized.ColumnVector wrapped ()  { throw new RuntimeException(); }
  // not preceding
  public   NoCloseColumnVector (org.apache.spark.sql.vectorized.ColumnVector wrapped)  { throw new RuntimeException(); }
  /**
   * Don't actually close the ColumnVector this wraps.  The producer of the vector will take
   * care of that.
   */
  public  void close ()  { throw new RuntimeException(); }
  public  boolean hasNull ()  { throw new RuntimeException(); }
  public  int numNulls ()  { throw new RuntimeException(); }
  public  boolean isNullAt (int rowId)  { throw new RuntimeException(); }
  public  boolean getBoolean (int rowId)  { throw new RuntimeException(); }
  public  byte getByte (int rowId)  { throw new RuntimeException(); }
  public  short getShort (int rowId)  { throw new RuntimeException(); }
  public  int getInt (int rowId)  { throw new RuntimeException(); }
  public  long getLong (int rowId)  { throw new RuntimeException(); }
  public  float getFloat (int rowId)  { throw new RuntimeException(); }
  public  double getDouble (int rowId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.vectorized.ColumnarArray getArray (int rowId)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.vectorized.ColumnarMap getMap (int ordinal)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.Decimal getDecimal (int rowId, int precision, int scale)  { throw new RuntimeException(); }
  public  org.apache.spark.unsafe.types.UTF8String getUTF8String (int rowId)  { throw new RuntimeException(); }
  public  byte[] getBinary (int rowId)  { throw new RuntimeException(); }
  protected  org.apache.spark.sql.vectorized.ColumnVector getChild (int ordinal)  { throw new RuntimeException(); }
}
