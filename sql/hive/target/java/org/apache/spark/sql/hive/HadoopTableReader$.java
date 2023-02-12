package org.apache.spark.sql.hive;
/**
 * Curried. After given an argument for 'path', the resulting JobConf =&gt; Unit closure is used to
 * instantiate a HadoopRDD.
 */
// not preceding
public  class HadoopTableReader$ implements org.apache.spark.sql.hive.HiveInspectors, org.apache.spark.internal.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HadoopTableReader$ MODULE$ = null;
  public   HadoopTableReader$ ()  { throw new RuntimeException(); }
  // not preceding
  public  void initializeLocalJobConfFunc (java.lang.String path, org.apache.hadoop.hive.ql.plan.TableDesc tableDesc, org.apache.hadoop.mapred.JobConf jobConf)  { throw new RuntimeException(); }
  /**
   * Builds specific unwrappers ahead of time according to object inspector
   * types to avoid pattern matching and branching costs per row.
   * @param iterator (undocumented)
   * @param rawDeser (undocumented)
   * @param nonPartitionKeyAttrs (undocumented)
   * @param mutableRow (undocumented)
   * @param tableDeser (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.InternalRow> fillObject (scala.collection.Iterator<org.apache.hadoop.io.Writable> iterator, org.apache.hadoop.hive.serde2.Deserializer rawDeser, scala.collection.Seq<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Attribute, java.lang.Object>> nonPartitionKeyAttrs, org.apache.spark.sql.catalyst.InternalRow mutableRow, org.apache.hadoop.hive.serde2.Deserializer tableDeser)  { throw new RuntimeException(); }
}
