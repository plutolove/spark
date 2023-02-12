package org.apache.spark.sql.execution.adaptive;
/**
 * To equally divide n elements into m buckets, basically each bucket should have n/m elements,
 * for the remaining n%m elements, add one more element to the first n%m buckets each. Returns
 * a sequence with length numBuckets and each value represents the start index of each bucket.
 */
public  class OptimizeLocalShuffleReader extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.execution.SparkPlan> implements scala.Product, scala.Serializable {
  // not preceding
  static public  class BroadcastJoinWithShuffleLeft$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BroadcastJoinWithShuffleLeft$ MODULE$ = null;
    public   BroadcastJoinWithShuffleLeft$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.joins.BuildSide>> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class BroadcastJoinWithShuffleRight$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BroadcastJoinWithShuffleRight$ MODULE$ = null;
    public   BroadcastJoinWithShuffleRight$ ()  { throw new RuntimeException(); }
    // not preceding
    public  scala.Option<scala.Tuple2<org.apache.spark.sql.execution.SparkPlan, org.apache.spark.sql.execution.joins.BuildSide>> unapply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  java.lang.String LOCAL_SHUFFLE_READER_DESCRIPTION ()  { throw new RuntimeException(); }
  // not preceding
  static public  boolean canUseLocalShuffleReader (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   OptimizeLocalShuffleReader (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan apply (org.apache.spark.sql.execution.SparkPlan plan)  { throw new RuntimeException(); }
}
