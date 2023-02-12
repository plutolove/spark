package org.apache.spark.serializer;
/**
 * Default ClassLoader to use in deserialization. Implementations of {@link Serializer} should
 * make sure it is using this when set.
 */
public abstract class Serializer {
  // not preceding
  public   Serializer ()  { throw new RuntimeException(); }
  // not preceding
  protected  scala.Option<java.lang.ClassLoader> defaultClassLoader ()  { throw new RuntimeException(); }
  /** Creates a new {@link SerializerInstance}. */
  public abstract  org.apache.spark.serializer.SerializerInstance newInstance ()  ;
  /**
   * Sets a class loader for the serializer to use in deserialization.
   * <p>
   * @return this Serializer object
   * @param classLoader (undocumented)
   */
  public  org.apache.spark.serializer.Serializer setDefaultClassLoader (java.lang.ClassLoader classLoader)  { throw new RuntimeException(); }
  /**
   * :: Private ::
   * Returns true if this serializer supports relocation of its serialized objects and false
   * otherwise. This should return true if and only if reordering the bytes of serialized objects
   * in serialization stream output is equivalent to having re-ordered those elements prior to
   * serializing them. More specifically, the following should hold if a serializer supports
   * relocation:
   * <p>
   * <pre><code>
   * serOut.open()
   * position = 0
   * serOut.write(obj1)
   * serOut.flush()
   * position = # of bytes written to stream so far
   * obj1Bytes = output[0:position-1]
   * serOut.write(obj2)
   * serOut.flush()
   * position2 = # of bytes written to stream so far
   * obj2Bytes = output[position:position2-1]
   * serIn.open([obj2bytes] concatenate [obj1bytes]) should return (obj2, obj1)
   * </code></pre>
   * <p>
   * In general, this property should hold for serializers that are stateless and that do not
   * write special metadata at the beginning or end of the serialization stream.
   * <p>
   * This API is private to Spark; this method should not be overridden in third-party subclasses
   * or called in user code and is subject to removal in future Spark releases.
   * <p>
   * See SPARK-7311 for more details.
   * @return (undocumented)
   */
    boolean supportsRelocationOfSerializedObjects ()  { throw new RuntimeException(); }
}
