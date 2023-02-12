package org.apache.spark.sql.catalyst.expressions.aggregate;
/**
 * Creates an empty aggregation buffer object. This is called before processing each key group
 * (group by key).
 * <p>
 * @return an aggregation buffer object
 */
public abstract class TypedImperativeAggregate<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.expressions.aggregate.ImperativeAggregate {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   TypedImperativeAggregate ()  { throw new RuntimeException(); }
  // not preceding
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> aggBufferAttributes ()  { throw new RuntimeException(); }
  public final  org.apache.spark.sql.types.StructType aggBufferSchema ()  { throw new RuntimeException(); }
  // not preceding
  public abstract  T createAggregationBuffer ()  ;
  /** De-serializes the serialized format Array[Byte], and produces aggregation buffer object T */
  public abstract  T deserialize (byte[] storageFormat)  ;
  /**
   * Generates the final aggregation result value for current key group with the aggregation buffer
   * object.
   * <p>
   * Developer note: the only return types accepted by Spark are:
   *   - primitive types
   *   - InternalRow and subclasses
   *   - ArrayData
   *   - MapData
   * <p>
   * @param buffer aggregation buffer object.
   * @return The aggregation result of current key group
   */
  public abstract  Object eval (T buffer)  ;
  public final  Object eval (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  public final  void initialize (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  // not preceding
  public final  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> inputAggBufferAttributes ()  { throw new RuntimeException(); }
  /**
   * Merges an input aggregation object into aggregation buffer object and returns a new buffer
   * object. For performance, the function may do in-place merge and return it instead of
   * constructing new buffer object.
   * <p>
   * This is typically called when doing PartialMerge or Final mode aggregation.
   * <p>
   * @param buffer the aggregation buffer object used to store the aggregation result.
   * @param input an input aggregation object. Input aggregation object can be produced by
   *              de-serializing the partial aggregate's output from Mapper side.
   * @return (undocumented)
   */
  public abstract  T merge (T buffer, T input)  ;
  public final  void merge (org.apache.spark.sql.catalyst.InternalRow buffer, org.apache.spark.sql.catalyst.InternalRow inputBuffer)  { throw new RuntimeException(); }
  /**
   * Merge an input buffer into the aggregation buffer, where both buffers contain the deserialized
   * java object. This function is used by aggregating accumulators.
   * <p>
   * @param buffer the aggregation buffer that is updated.
   * @param inputBuffer the buffer that is merged into the aggregation buffer.
   */
  public final  void mergeBuffersObjects (org.apache.spark.sql.catalyst.InternalRow buffer, org.apache.spark.sql.catalyst.InternalRow inputBuffer)  { throw new RuntimeException(); }
  /** Serializes the aggregation buffer object T to Array[Byte] */
  public abstract  byte[] serialize (T buffer)  ;
  /**
   * In-place replaces the aggregation buffer object stored at buffer's index
   * <code>mutableAggBufferOffset</code>, with SparkSQL internally supported underlying storage format
   * (BinaryType).
   * <p>
   * This is only called when doing Partial or PartialMerge mode aggregation, before the framework
   * shuffle out aggregate buffers.
   * @param buffer (undocumented)
   */
  public final  void serializeAggregateBufferInPlace (org.apache.spark.sql.catalyst.InternalRow buffer)  { throw new RuntimeException(); }
  /**
   * Updates the aggregation buffer object with an input row and returns a new buffer object. For
   * performance, the function may do in-place update and return it instead of constructing new
   * buffer object.
   * <p>
   * This is typically called when doing Partial or Complete mode aggregation.
   * <p>
   * @param buffer The aggregation buffer object.
   * @param input an input row
   * @return (undocumented)
   */
  public abstract  T update (T buffer, org.apache.spark.sql.catalyst.InternalRow input)  ;
  public final  void update (org.apache.spark.sql.catalyst.InternalRow buffer, org.apache.spark.sql.catalyst.InternalRow input)  { throw new RuntimeException(); }
}
