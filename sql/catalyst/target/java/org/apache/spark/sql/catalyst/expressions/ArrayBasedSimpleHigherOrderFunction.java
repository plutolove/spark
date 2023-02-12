package org.apache.spark.sql.catalyst.expressions;
/**
 * Called by {@link eval}. If a subclass keeps the default nullability, it can override this method
 * in order to save null-check code.
 */
public  interface ArrayBasedSimpleHigherOrderFunction extends org.apache.spark.sql.catalyst.expressions.SimpleHigherOrderFunction {
  public  org.apache.spark.sql.types.AbstractDataType argumentType ()  ;
}
