package org.apache.spark.examples.sql;
// not preceding
public  class UserDefinedUntypedAggregation {
  // not preceding
  static public  class Average implements scala.Product, scala.Serializable {
    // not preceding
    public  long sum ()  { throw new RuntimeException(); }
    public  long count ()  { throw new RuntimeException(); }
    // not preceding
    public   Average (long sum, long count)  { throw new RuntimeException(); }
  }
  // not preceding
  static public  class Average$ extends scala.runtime.AbstractFunction2<java.lang.Object, java.lang.Object, org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Average$ MODULE$ = null;
    public   Average$ ()  { throw new RuntimeException(); }
  }
  // not preceding
  // not preceding
  static public  class MyAverage$ extends org.apache.spark.sql.expressions.Aggregator<java.lang.Object, org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average, java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final MyAverage$ MODULE$ = null;
    public   MyAverage$ ()  { throw new RuntimeException(); }
    // not preceding
    public  org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average zero ()  { throw new RuntimeException(); }
    public  org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average reduce (org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average buffer, long data)  { throw new RuntimeException(); }
    public  org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average merge (org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average b1, org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average b2)  { throw new RuntimeException(); }
    public  double finish (org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average reduction)  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<org.apache.spark.examples.sql.UserDefinedUntypedAggregation.Average> bufferEncoder ()  { throw new RuntimeException(); }
    public  org.apache.spark.sql.Encoder<java.lang.Object> outputEncoder ()  { throw new RuntimeException(); }
  }
  // not preceding
  static public  void main (java.lang.String[] args)  { throw new RuntimeException(); }
}
