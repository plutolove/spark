package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Combine this {@link HintInfo} with another {@link HintInfo} and return the new {@link HintInfo}.
 * param:  other the other {@link HintInfo}
 * param:  hintErrorHandler the error handler to notify if any {@link HintInfo} has been overridden
 *                         in this merge.
 * <p>
 * Currently, for join strategy hints, the new {@link HintInfo} will contain the strategy in this
 * {@link HintInfo} if defined, otherwise the strategy in the other {@link HintInfo}. The
 * <code>hintOverriddenCallback</code> will be called if this {@link HintInfo} and the other {@link HintInfo}
 * both have a strategy defined but the join strategies are different.
 */
public abstract class JoinStrategyHint {
  // not preceding
  static public  scala.collection.immutable.Set<org.apache.spark.sql.catalyst.plans.logical.JoinStrategyHint> strategies ()  { throw new RuntimeException(); }
  // not preceding
  public   JoinStrategyHint ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  java.lang.String displayName ()  ;
  public abstract  scala.collection.immutable.Set<java.lang.String> hintAliases ()  ;
  public  java.lang.String toString ()  { throw new RuntimeException(); }
}
