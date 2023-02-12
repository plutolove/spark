package org.apache.spark.sql.catalyst.expressions;
/**
 * Computes hash of a given <code>value</code> of type <code>dataType</code>. The caller needs to check the validity
 * of input <code>value</code>.
 */
public abstract class InterpretedHashFunction {
  // not preceding
  public   InterpretedHashFunction ()  { throw new RuntimeException(); }
  /**
   * Computes hash of a given <code>value</code> of type <code>dataType</code>. The caller needs to check the validity
   * of input <code>value</code>.
   * @param value (undocumented)
   * @param dataType (undocumented)
   * @param seed (undocumented)
   * @return (undocumented)
   */
  public  long hash (Object value, org.apache.spark.sql.types.DataType dataType, long seed)  { throw new RuntimeException(); }
  // not preceding
  protected abstract  long hashInt (int i, long seed)  ;
  protected abstract  long hashLong (long l, long seed)  ;
  protected abstract  long hashUnsafeBytes (java.lang.Object base, long offset, int length, long seed)  ;
}
