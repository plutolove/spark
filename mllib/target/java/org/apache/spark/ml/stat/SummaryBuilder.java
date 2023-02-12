package org.apache.spark.ml.stat;
/**
 * Returns an aggregate object that contains the summary of the column with the requested metrics.
 * param:  featuresCol a column that contains features Vector object.
 * param:  weightCol a column that contains weight value. Default weight is 1.0.
 * @return an aggregate column that contains the statistics. The exact content of this
 *         structure is determined during the creation of the builder.
 */
public abstract class SummaryBuilder {
  // not preceding
  public   SummaryBuilder ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.sql.Column summary (org.apache.spark.sql.Column featuresCol, org.apache.spark.sql.Column weightCol)  ;
  public  org.apache.spark.sql.Column summary (org.apache.spark.sql.Column featuresCol)  { throw new RuntimeException(); }
}
