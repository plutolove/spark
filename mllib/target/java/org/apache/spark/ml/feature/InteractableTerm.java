package org.apache.spark.ml.feature;
/** Convert to ColumnInteraction to wrap all interactions. */
public  interface InteractableTerm extends org.apache.spark.ml.feature.Term {
  /** Convert to ColumnInteraction to wrap all interactions. */
  public  org.apache.spark.ml.feature.ColumnInteraction asInteraction ()  ;
  /** Interactions of interactable terms. */
  public  org.apache.spark.ml.feature.Term interact (org.apache.spark.ml.feature.Term other)  ;
}
