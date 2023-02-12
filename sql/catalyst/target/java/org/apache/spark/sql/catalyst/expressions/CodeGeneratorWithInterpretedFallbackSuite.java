package org.apache.spark.sql.catalyst.expressions;
public  class CodeGeneratorWithInterpretedFallbackSuite extends org.apache.spark.SparkFunSuite implements org.apache.spark.sql.catalyst.plans.PlanTestBase {
  // not preceding
  public  class FailedCodegenProjection {
    // not preceding
    static protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createCodeGeneratedObject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
    static protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createInterpretedObject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
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
    static public  OUT createObject (IN in)  { throw new RuntimeException(); }
    static public  org.slf4j.Logger org$apache$spark$internal$Logging$$log_ ()  { throw new RuntimeException(); }
    static public  void org$apache$spark$internal$Logging$$log__$eq (org.slf4j.Logger x$1)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class FailedCodegenProjection$ extends org.apache.spark.sql.catalyst.expressions.CodeGeneratorWithInterpretedFallback<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.UnsafeProjection> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FailedCodegenProjection$ MODULE$ = null;
    public   FailedCodegenProjection$ ()  { throw new RuntimeException(); }
    // not preceding
    protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createCodeGeneratedObject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
    protected  org.apache.spark.sql.catalyst.expressions.UnsafeProjection createInterpretedObject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> in)  { throw new RuntimeException(); }
  }
  // not preceding
  public   CodeGeneratorWithInterpretedFallbackSuite ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.CodeGeneratorWithInterpretedFallbackSuite.FailedCodegenProjection$ FailedCodegenProjection ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String codegenOnly ()  { throw new RuntimeException(); }
  public  java.lang.String noCodegen ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
}
