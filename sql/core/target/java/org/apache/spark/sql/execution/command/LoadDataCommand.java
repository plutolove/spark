package org.apache.spark.sql.execution.command;
/**
 * A command that loads data into a Hive table.
 * <p>
 * The syntax of this command is:
 * <pre><code>
 *  LOAD DATA [LOCAL] INPATH 'filepath' [OVERWRITE] INTO TABLE tablename
 *  [PARTITION (partcol1=val1, partcol2=val2 ...)]
 * </code></pre>
 */
public  class LoadDataCommand extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.execution.command.RunnableCommand, scala.Product, scala.Serializable {
  // not preceding
  static   org.apache.hadoop.fs.Path makeQualified (java.net.URI defaultUri, org.apache.hadoop.fs.Path workingDir, org.apache.hadoop.fs.Path path)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.immutable.Map<java.lang.String, org.apache.spark.sql.execution.metric.SQLMetric> metrics ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.TableIdentifier table ()  { throw new RuntimeException(); }
  public  java.lang.String path ()  { throw new RuntimeException(); }
  public  boolean isLocal ()  { throw new RuntimeException(); }
  public  boolean isOverwrite ()  { throw new RuntimeException(); }
  public  scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partition ()  { throw new RuntimeException(); }
  // not preceding
  public   LoadDataCommand (org.apache.spark.sql.catalyst.TableIdentifier table, java.lang.String path, boolean isLocal, boolean isOverwrite, scala.Option<scala.collection.immutable.Map<java.lang.String, java.lang.String>> partition)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.Row> run (org.apache.spark.sql.SparkSession sparkSession)  { throw new RuntimeException(); }
}
