package org.apache.spark.sql;
/**
 * Called when starting to process one partition of new data in the executor. See the class
 * docs for more information on how to use the <code>partitionId</code> and <code>epochId</code>.
 * <p>
 * param:  partitionId the partition id.
 * param:  epochId a unique id for data deduplication.
 * @return <code>true</code> if the corresponding partition and version id should be processed. <code>false</code>
 *         indicates the partition should be skipped.
 */
public abstract class ForeachWriter<T extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   ForeachWriter ()  { throw new RuntimeException(); }
  /**
   * Called when stopping to process one partition of new data in the executor side. This is
   * guaranteed to be called either <code>open</code> returns <code>true</code> or <code>false</code>. However,
   * <code>close</code> won't be called in the following cases:
   * <p>
   * <ul>
   * <li>JVM crashes without throwing a <code>Throwable</code></li>
   * <li><code>open</code> throws a <code>Throwable</code>.</li>
   * </ul>
   * <p>
   * @param errorOrNull the error thrown during processing data or null if there was no error.
   */
  public abstract  void close (java.lang.Throwable errorOrNull)  ;
  // not preceding
  public abstract  boolean open (long partitionId, long epochId)  ;
  /**
   * Called to process the data in the executor side. This method will be called only if <code>open</code>
   * returns <code>true</code>.
   * @param value (undocumented)
   */
  public abstract  void process (T value)  ;
}
