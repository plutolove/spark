package org.apache.spark.sql.execution.streaming.state;
/** Return a new provider with a random id */
public abstract class StateStoreSuiteBase<ProviderClass extends org.apache.spark.sql.execution.streaming.state.StateStoreProvider> extends org.apache.spark.SparkFunSuite {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree().setOriginal(Ident(org.apache.spark.sql.execution.streaming.state.StateStoreProvider))))
  public   StateStoreSuiteBase ()  { throw new RuntimeException(); }
  /**
   * Get a specific version of data referred to by the given provider but not using
   * this provider
   * @param storeProvider (undocumented)
   * @param version (undocumented)
   * @return (undocumented)
   */
  public abstract  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> getData (ProviderClass storeProvider, int version)  ;
  /** Get the latest data referred to by the given provider but not using this provider */
  public abstract  scala.collection.immutable.Set<scala.Tuple2<java.lang.String, java.lang.Object>> getLatestData (ProviderClass storeProvider)  ;
  /** Return a new provider with a random id */
  public abstract  ProviderClass newStoreProvider ()  ;
  /** Return a new provider with the given id */
  public abstract  ProviderClass newStoreProvider (org.apache.spark.sql.execution.streaming.state.StateStoreId storeId)  ;
  protected  void testQuietly (java.lang.String name, scala.Function0<scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
}
