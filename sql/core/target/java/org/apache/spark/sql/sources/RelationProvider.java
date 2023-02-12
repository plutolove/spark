package org.apache.spark.sql.sources;
/**
 * Returns a new base relation with the given parameters.
 * <p>
 * @note The parameters' keywords are case insensitive and this insensitivity is enforced
 * by the Map that is passed to the function.
 */
public  interface RelationProvider {
  // not preceding
  public  org.apache.spark.sql.sources.BaseRelation createRelation (org.apache.spark.sql.SQLContext sqlContext, scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  ;
}
