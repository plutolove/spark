package org.apache.spark.ml.feature;
/**
 * Generates the output ML attributes for a single input feature. Each output feature name has
 * up to three parts: the group name, feature name, and category name (for nominal features),
 * each separated by an underscore.
 * <p>
 * param:  inputAttrs The attributes of the input feature.
 * param:  groupName Optional name of the input feature group (for Vector type features).
 */
// not preceding
public  class Interaction$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.feature.Interaction>, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Interaction$ MODULE$ = null;
  public   Interaction$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.ml.feature.Interaction load (java.lang.String path)  { throw new RuntimeException(); }
}
