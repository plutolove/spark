package org.apache.spark.sql;
/**
 * A base trait for various UDFs defined in this object.
 */
// not preceding
public  class IntegratedUDFTestUtils {
  // not preceding
  static public  class TestPythonUDF implements org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF, scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   TestPythonUDF (java.lang.String name)  { throw new RuntimeException(); }
    // not preceding
      org.apache.spark.sql.execution.python.UserDefinedPythonFunction udf ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
    public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class TestPythonUDF$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.IntegratedUDFTestUtils.TestPythonUDF> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestPythonUDF$ MODULE$ = null;
    public   TestPythonUDF$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class TestScalarPandasUDF implements org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF, scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   TestScalarPandasUDF (java.lang.String name)  { throw new RuntimeException(); }
    // not preceding
      org.apache.spark.sql.execution.python.UserDefinedPythonFunction udf ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
    public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class TestScalarPandasUDF$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.IntegratedUDFTestUtils.TestScalarPandasUDF> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestScalarPandasUDF$ MODULE$ = null;
    public   TestScalarPandasUDF$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class TestScalaUDF implements org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF, scala.Product, scala.Serializable {
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    // not preceding
    public   TestScalaUDF (java.lang.String name)  { throw new RuntimeException(); }
    // not preceding
      org.apache.spark.sql.expressions.SparkUserDefinedFunction udf ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  { throw new RuntimeException(); }
    public  java.lang.String prettyName ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class TestScalaUDF$ extends scala.runtime.AbstractFunction1<java.lang.String, org.apache.spark.sql.IntegratedUDFTestUtils.TestScalaUDF> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final TestScalaUDF$ MODULE$ = null;
    public   TestScalaUDF$ ()  { throw new RuntimeException(); }
  }
  /**
   * A base trait for various UDFs defined in this object.
   */
  static public  interface TestUDF {
    // not preceding
    public  org.apache.spark.sql.Column apply (scala.collection.Seq<org.apache.spark.sql.Column> exprs)  ;
    public  java.lang.String prettyName ()  ;
  }
  // not preceding
  static protected  java.lang.String sparkHome ()  { throw new RuntimeException(); }
  // not preceding
  static public  java.lang.String pythonVer ()  { throw new RuntimeException(); }
  // not preceding
  static public  java.lang.String pandasVer ()  { throw new RuntimeException(); }
  // not preceding
  static public  java.lang.String pyarrowVer ()  { throw new RuntimeException(); }
  // not preceding
  static public  java.lang.String pythonExec ()  { throw new RuntimeException(); }
  // not preceding
  static public  boolean shouldTestPythonUDFs ()  { throw new RuntimeException(); }
  // not preceding
  static public  boolean shouldTestScalarPandasUDFs ()  { throw new RuntimeException(); }
  // not preceding
  static public  void registerTestUDF (org.apache.spark.sql.IntegratedUDFTestUtils.TestUDF testUDF, org.apache.spark.sql.SparkSession session)  { throw new RuntimeException(); }
  static protected  void withSQLConf (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> pairs, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static protected  void withTempPath (scala.Function1<java.io.File, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public <T extends java.lang.Object> void testSpecialDatetimeValues (scala.Function1<java.time.ZoneId, T> test)  { throw new RuntimeException(); }
}
