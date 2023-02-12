package org.apache.spark.sql.execution.datasources;
/**
 * The reader schema is said to be evolved (or projected) when it changed after the data is
 * written by writers. The followings are supported in file-based data sources.
 * Note that partition columns are not maintained in files. Here, <code>column</code> means non-partition
 * column.
 * <p>
 *   1. Add a column
 *   2. Hide a column
 *   3. Change a column position
 *   4. Change a column type (Upcast)
 * <p>
 * Here, we consider safe changes without data loss. For example, data type changes should be
 * from small types to larger types like <code>int</code>-to-<code>long</code>, not vice versa.
 * <p>
 * So far, file-based data sources have the following coverages.
 * <p>
 *   | File Format  | Coverage     | Note                                                   |
 *   | ------------ | ------------ | ------------------------------------------------------ |
 *   | TEXT         | N/A          | Schema consists of a single string column.             |
 *   | CSV          | 1, 2, 4      |                                                        |
 *   | JSON         | 1, 2, 3, 4   |                                                        |
 *   | ORC          | 1, 2, 3, 4   | Native vectorized ORC reader has the widest coverage.  |
 *   | PARQUET      | 1, 2, 3      |                                                        |
 *   | AVRO         | 1, 2, 3      |                                                        |
 * <p>
 * This aims to provide an explicit test coverage for reader schema change on file-based data
 * sources. Since a file format has its own coverage, we need a test suite for each file-based
 * data source with corresponding supported test case traits.
 * <p>
 * The following is a hierarchy of test traits.
 * <p>
 *   ReadSchemaTest
 *     -> AddColumnTest
 *     -> AddColumnIntoTheMiddleTest
 *     -> HideColumnAtTheEndTest
 *     -> HideColumnInTheMiddleTest
 *     -> ChangePositionTest
 *     -> BooleanTypeTest
 *     -> ToStringTypeTest
 *     -> IntegralTypeTest
 *     -> ToDoubleTypeTest
 *     -> ToDecimalTypeTest
 */
public  interface ReadSchemaTest extends org.apache.spark.sql.test.SharedSparkSession {
  public  java.lang.String format ()  ;
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options ()  ;
}
