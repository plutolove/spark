package org.apache.spark.sql.execution.aggregate;
/**
 * Generates a method that returns true if the group-by keys exist at a given index in the
 * associated {@link org.apache.spark.sql.execution.vectorized.OnHeapColumnVector}. For instance,
 * if we have 2 long group-by keys, the generated function would be of the form:
 * <p>
 * <pre><code>
 * private boolean equals(int idx, long agg_key, long agg_key1) {
 *   return vectors[0].getLong(buckets[idx]) == agg_key &amp;&amp;
 *     vectors[1].getLong(buckets[idx]) == agg_key1;
 * }
 * </code></pre>
 */
public  class VectorizedHashMapGenerator extends org.apache.spark.sql.execution.aggregate.HashMapGenerator {
  // not preceding
  public   VectorizedHashMapGenerator (org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext ctx, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.aggregate.AggregateExpression> aggregateExpressions, java.lang.String generatedClassName, org.apache.spark.sql.types.StructType groupingKeySchema, org.apache.spark.sql.types.StructType bufferSchema, int bitMaxCapacity)  { throw new RuntimeException(); }
  /**
   * Generates a method that returns true if the group-by keys exist at a given index in the
   * associated {@link org.apache.spark.sql.execution.vectorized.OnHeapColumnVector}. For instance,
   * if we have 2 long group-by keys, the generated function would be of the form:
   * <p>
   * <pre><code>
   * private boolean equals(int idx, long agg_key, long agg_key1) {
   *   return vectors[0].getLong(buckets[idx]) == agg_key &amp;&amp;
   *     vectors[1].getLong(buckets[idx]) == agg_key1;
   * }
   * </code></pre>
   * @return (undocumented)
   */
  protected  java.lang.String generateEquals ()  { throw new RuntimeException(); }
  /**
   * Generates a method that returns a
   * {@link org.apache.spark.sql.execution.vectorized.MutableColumnarRow} which keeps track of the
   * aggregate value(s) for a given set of keys. If the corresponding row doesn't exist, the
   * generated method adds the corresponding row in the associated
   * {@link org.apache.spark.sql.execution.vectorized.OnHeapColumnVector}. For instance, if we
   * have 2 long group-by keys, the generated function would be of the form:
   * <p>
   * <pre><code>
   * public MutableColumnarRow findOrInsert(long agg_key, long agg_key1) {
   *   long h = hash(agg_key, agg_key1);
   *   int step = 0;
   *   int idx = (int) h &amp; (numBuckets - 1);
   *   while (step &lt; maxSteps) {
   *     // Return bucket index if it's either an empty slot or already contains the key
   *     if (buckets[idx] == -1) {
   *       if (numRows &lt; capacity) {
   *         vectors[0].putLong(numRows, agg_key);
   *         vectors[1].putLong(numRows, agg_key1);
   *         vectors[2].putLong(numRows, 0);
   *         buckets[idx] = numRows++;
   *         aggBufferRow.rowId = numRows;
   *         return aggBufferRow;
   *       } else {
   *         // No more space
   *         return null;
   *       }
   *     } else if (equals(idx, agg_key, agg_key1)) {
   *       aggBufferRow.rowId = buckets[idx];
   *       return aggBufferRow;
   *     }
   *     idx = (idx + 1) &amp; (numBuckets - 1);
   *     step++;
   *   }
   *   // Didn't find it
   *   return null;
   * }
   * </code></pre>
   * @return (undocumented)
   */
  protected  java.lang.String generateFindOrInsert ()  { throw new RuntimeException(); }
  protected  java.lang.String generateRowIterator ()  { throw new RuntimeException(); }
  // not preceding
  protected  java.lang.String initializeAggregateHashMap ()  { throw new RuntimeException(); }
}
