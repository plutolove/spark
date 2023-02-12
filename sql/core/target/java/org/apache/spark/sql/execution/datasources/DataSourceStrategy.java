package org.apache.spark.sql.execution.datasources;
/**
 * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
 */
public  class DataSourceStrategy extends org.apache.spark.sql.execution.SparkStrategy implements org.apache.spark.internal.Logging, org.apache.spark.sql.catalyst.analysis.CastSupport, scala.Product, scala.Serializable {
  // not preceding
  static protected  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> normalizeExprs (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> attributes)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   * @param predicate (undocumented)
   * @param supportNestedPredicatePushdown (undocumented)
   */
  static protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilter (org.apache.spark.sql.catalyst.expressions.Expression predicate, boolean supportNestedPredicatePushdown)  { throw new RuntimeException(); }
  /**
   * Tries to translate a Catalyst {@link Expression} into data source {@link Filter}.
   * <p>
   * @param predicate The input {@link Expression} to be translated as {@link Filter}
   * @param translatedFilterToExpr An optional map from leaf node filter expressions to its
   *                               translated {@link Filter}. The map is used for rebuilding
   *                               {@link Expression} from {@link Filter}.
   * @param nestedPredicatePushdownEnabled Whether nested predicate pushdown is enabled.
   * @return a <code>Some[Filter]</code> if the input {@link Expression} is convertible, otherwise a <code>None</code>.
   */
  static protected  scala.Option<org.apache.spark.sql.sources.Filter> translateFilterWithMapping (org.apache.spark.sql.catalyst.expressions.Expression predicate, scala.Option<scala.collection.mutable.HashMap<org.apache.spark.sql.sources.Filter, org.apache.spark.sql.catalyst.expressions.Expression>> translatedFilterToExpr, boolean nestedPredicatePushdownEnabled)  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.catalyst.expressions.Expression rebuildExpressionFromFilter (org.apache.spark.sql.sources.Filter filter, scala.collection.mutable.HashMap<org.apache.spark.sql.sources.Filter, org.apache.spark.sql.catalyst.expressions.Expression> translatedFilterToExpr)  { throw new RuntimeException(); }
  /**
   * Selects Catalyst predicate {@link Expression}s which are convertible into data source {@link Filter}s
   * and can be handled by <code>relation</code>.
   * <p>
   * @return A triplet of <code>Seq[Expression]</code>, <code>Seq[Filter]</code>, and <code>Seq[Filter]</code> . The first element
   *         contains all Catalyst predicate {@link Expression}s that are either not convertible or
   *         cannot be handled by <code>relation</code>. The second element contains all converted data source
   *         {@link Filter}s that will be pushed down to the data source. The third element contains
   *         all {@link Filter}s that are completely filtered at the DataSource.
   * @param relation (undocumented)
   * @param predicates (undocumented)
   */
  static protected  scala.Tuple3<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, scala.collection.Seq<org.apache.spark.sql.sources.Filter>, scala.collection.immutable.Set<org.apache.spark.sql.sources.Filter>> selectFilters (org.apache.spark.sql.sources.BaseRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> predicates)  { throw new RuntimeException(); }
  /**
   * Convert RDD of Row into RDD of InternalRow with objects in catalyst types
   * @param relation (undocumented)
   * @param output (undocumented)
   * @param rdd (undocumented)
   * @return (undocumented)
   */
  static   org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.InternalRow> toCatalystRDD (org.apache.spark.sql.sources.BaseRelation relation, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.Row> rdd)  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   DataSourceStrategy (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  // not preceding
  public  scala.collection.Seq<org.apache.spark.sql.execution.SparkPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
}
