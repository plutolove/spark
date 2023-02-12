package org.apache.spark.sql.execution;
/**
 * Send the driver-side metrics. Before calling this function, selectedPartitions has
 * been initialized. See SPARK-26327 for more details.
 */
public  class FileSourceScanExec extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.DataSourceScanExec, scala.Product, scala.Serializable {
  static public abstract  R apply (T1 v1, T2 v2, T3 v3, T4 v4, T5 v5, T6 v6, T7 v7)  ;
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  // not preceding
  public  java.lang.String nodeName ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.datasources.HadoopFsRelation relation ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType requiredSchema ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.util.collection.BitSet> optionalBucketSet ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier ()  { throw new RuntimeException(); }
  // not preceding
  public   FileSourceScanExec (org.apache.spark.sql.execution.datasources.HadoopFsRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.types.StructType requiredSchema, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> partitionFilters, scala.Option<org.apache.spark.util.collection.BitSet> optionalBucketSet, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> dataFilters, scala.Option<org.apache.spark.sql.catalyst.TableIdentifier> tableIdentifier)  { throw new RuntimeException(); }
  // not preceding
  public  boolean supportsColumnar ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.Seq<java.lang.String>> vectorTypes ()  { throw new RuntimeException(); }
  // not preceding
  public  boolean bucketedScan ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.physical.Partitioning outputPartitioning ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.SortOrder> outputOrdering ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> metadata ()  { throw new RuntimeException(); }
  public  java.lang.String verboseStringWithOperatorId ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> inputRDD ()  { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow>> inputRDDs ()  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> doExecute ()  { throw new RuntimeException(); }
  protected  org.apache.spark.rdd.RDD<org.apache.spark.sql.vectorized.ColumnarBatch> doExecuteColumnar ()  { throw new RuntimeException(); }
  public  java.lang.String nodeNamePrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.FileSourceScanExec doCanonicalize ()  { throw new RuntimeException(); }
}
