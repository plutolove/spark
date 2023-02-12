package org.apache.spark.sql.execution.datasources;
public abstract class SchemaPruningSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.execution.datasources.FileBasedDataSourceTest, org.apache.spark.sql.catalyst.SchemaPruningTest, org.apache.spark.sql.test.SharedSparkSession, org.apache.spark.sql.execution.adaptive.AdaptiveSparkPlanHelper {
  // not preceding
  public  class FullName implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String first ()  { throw new RuntimeException(); }
    public  java.lang.String middle ()  { throw new RuntimeException(); }
    public  java.lang.String last ()  { throw new RuntimeException(); }
    // not preceding
    public   FullName (java.lang.String first, java.lang.String middle, java.lang.String last)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class FullName$ extends scala.runtime.AbstractFunction3<java.lang.String, java.lang.String, java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FullName$ MODULE$ = null;
    public   FullName$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Company implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String name ()  { throw new RuntimeException(); }
    public  java.lang.String address ()  { throw new RuntimeException(); }
    // not preceding
    public   Company (java.lang.String name, java.lang.String address)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Company$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Company> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Company$ MODULE$ = null;
    public   Company$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Employer implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Company company ()  { throw new RuntimeException(); }
    // not preceding
    public   Employer (int id, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Company company)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Employer$ extends scala.runtime.AbstractFunction2<java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Company, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Employer$ MODULE$ = null;
    public   Employer$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Contact implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName name ()  { throw new RuntimeException(); }
    public  java.lang.String address ()  { throw new RuntimeException(); }
    public  int pets ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[] friends ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName> relatives ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employer ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String> relations ()  { throw new RuntimeException(); }
    // not preceding
    public   Contact (int id, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName name, java.lang.String address, int pets, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[] friends, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName> relatives, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employer, scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String> relations)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Contact$ extends scala.runtime.AbstractFunction8<java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String, java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[], scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName>, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer, scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String>, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Contact> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Contact$ MODULE$ = null;
    public   Contact$ ()  { throw new RuntimeException(); }
  }
  public  class Name implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String first ()  { throw new RuntimeException(); }
    public  java.lang.String last ()  { throw new RuntimeException(); }
    // not preceding
    public   Name (java.lang.String first, java.lang.String last)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class Name$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Name$ MODULE$ = null;
    public   Name$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class BriefContact implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name name ()  { throw new RuntimeException(); }
    public  java.lang.String address ()  { throw new RuntimeException(); }
    // not preceding
    public   BriefContact (int id, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name name, java.lang.String address)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class BriefContact$ extends scala.runtime.AbstractFunction3<java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name, java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.BriefContact> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BriefContact$ MODULE$ = null;
    public   BriefContact$ ()  { throw new RuntimeException(); }
  }
  public  class ContactWithDataPartitionColumn implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7, T8 v8, T9 v9)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName name ()  { throw new RuntimeException(); }
    public  java.lang.String address ()  { throw new RuntimeException(); }
    public  int pets ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[] friends ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName> relatives ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employer ()  { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String> relations ()  { throw new RuntimeException(); }
    public  int p ()  { throw new RuntimeException(); }
    // not preceding
    public   ContactWithDataPartitionColumn (int id, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName name, java.lang.String address, int pets, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[] friends, scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName> relatives, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employer, scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String> relations, int p)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class ContactWithDataPartitionColumn$ extends scala.runtime.AbstractFunction9<java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String, java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName[], scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName>, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer, scala.collection.immutable.Map<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName, java.lang.String>, java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.ContactWithDataPartitionColumn> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ContactWithDataPartitionColumn$ MODULE$ = null;
    public   ContactWithDataPartitionColumn$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class BriefContactWithDataPartitionColumn implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name name ()  { throw new RuntimeException(); }
    public  java.lang.String address ()  { throw new RuntimeException(); }
    public  int p ()  { throw new RuntimeException(); }
    // not preceding
    public   BriefContactWithDataPartitionColumn (int id, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name name, java.lang.String address, int p)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class BriefContactWithDataPartitionColumn$ extends scala.runtime.AbstractFunction4<java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Name, java.lang.String, java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.BriefContactWithDataPartitionColumn> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BriefContactWithDataPartitionColumn$ MODULE$ = null;
    public   BriefContactWithDataPartitionColumn$ ()  { throw new RuntimeException(); }
  }
  public  class MixedCaseColumn implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  java.lang.String a ()  { throw new RuntimeException(); }
    public  int B ()  { throw new RuntimeException(); }
    // not preceding
    public   MixedCaseColumn (java.lang.String a, int B)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MixedCaseColumn$ extends scala.runtime.AbstractFunction2<java.lang.String, java.lang.Object, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.MixedCaseColumn> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MixedCaseColumn$ MODULE$ = null;
    public   MixedCaseColumn$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MixedCase implements scala.Product, scala.Serializable {
    static public abstract  R apply (T1 v1, T2 v2, T3 v3)  ;
    static public  java.lang.String toString ()  { throw new RuntimeException(); }
    // not preceding
    public  int id ()  { throw new RuntimeException(); }
    public  java.lang.String CoL1 ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.MixedCaseColumn coL2 ()  { throw new RuntimeException(); }
    // not preceding
    public   MixedCase (int id, java.lang.String CoL1, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.MixedCaseColumn coL2)  { throw new RuntimeException(); }
  }
  // not preceding
  public  class MixedCase$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.String, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.MixedCaseColumn, org.apache.spark.sql.execution.datasources.SchemaPruningSuite.MixedCase> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MixedCase$ MODULE$ = null;
    public   MixedCase$ ()  { throw new RuntimeException(); }
  }
  public  org.scalatest.concurrent.AbstractPatienceConfiguration.PatienceConfig$ PatienceConfig ()  { throw new RuntimeException(); }
  // not preceding
  public   SchemaPruningSuite ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> allNulls ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.ArrayData> arrayData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> binaryData ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.BriefContactWithDataPartitionColumn> briefContactsWithDataPartitionColumn ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntervalData> calenderIntervalData ()  { throw new RuntimeException(); }
  protected  void checkScan (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> expectedSchemaCatalogStrings)  { throw new RuntimeException(); }
  protected  void checkScanSchemata (org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> df, scala.collection.Seq<java.lang.String> expectedSchemaCatalogStrings)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> complexData ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Contact> contacts ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.List<org.apache.spark.sql.execution.datasources.SchemaPruningSuite.ContactWithDataPartitionColumn> contactsWithDataPartitionColumn ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> courseSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> decimalData ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.Employer employerWithNullCompany ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> emptyTestData ()  { throw new RuntimeException(); }
  // not preceding
  protected  boolean enableAutoThreadAudit ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName janeDoe ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName johnDoe ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> largeAndSmallInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> lowerCaseDataWithDuplicates ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.MapData> mapData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> negativeData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullInts ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> nullStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> nullableRepeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> person ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.StringData> repeatedData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> salary ()  { throw new RuntimeException(); }
  protected  java.lang.Object schemaEquality ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Function1<java.lang.String, org.apache.spark.sql.Dataset<org.apache.spark.sql.Row>> sql ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.SchemaPruningSuite.FullName susanSmith ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> tableName ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData2 ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> testData3 ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.SQLTestUtilsBase.testImplicits$ testImplicits ()  { throw new RuntimeException(); }
  protected  void testSchemaPruning (java.lang.String testName, scala.Function0<scala.runtime.BoxedUnit> testThunk)  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> trainingSales ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<java.lang.String> unparsedStrings ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> upperCaseData ()  { throw new RuntimeException(); }
  // not preceding
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.test.SQLTestData.IntField> withEmptyParts ()  { throw new RuntimeException(); }
}
