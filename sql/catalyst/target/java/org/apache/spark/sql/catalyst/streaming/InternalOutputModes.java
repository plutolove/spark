package org.apache.spark.sql.catalyst.streaming;
/**
 * OutputMode in which only the new rows in the streaming DataFrame/Dataset will be
 * written to the sink. This output mode can be only be used in queries that do not
 * contain any aggregation.
 */
// not preceding
public  class InternalOutputModes {
  // not preceding
  // not preceding
  static public  class Append$ extends org.apache.spark.sql.streaming.OutputMode implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Append$ MODULE$ = null;
    public   Append$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Complete$ extends org.apache.spark.sql.streaming.OutputMode implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Complete$ MODULE$ = null;
    public   Complete$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class Update$ extends org.apache.spark.sql.streaming.OutputMode implements scala.Product, scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Update$ MODULE$ = null;
    public   Update$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  org.apache.spark.sql.streaming.OutputMode apply (java.lang.String outputMode)  { throw new RuntimeException(); }
}
