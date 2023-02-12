package org.apache.spark.sql;
/**
 * The conditional probability of a non-null value being drawn from a set of "interesting" values
 * instead of being chosen uniformly at random.
 */
// not preceding
public  class RandomDataGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RandomDataGenerator$ MODULE$ = null;
  public   RandomDataGenerator$ ()  { throw new RuntimeException(); }
  public final  int MAX_STR_LEN ()  { throw new RuntimeException(); }
  public final  int MAX_ARR_SIZE ()  { throw new RuntimeException(); }
  public final  int MAX_MAP_SIZE ()  { throw new RuntimeException(); }
  /**
   * A wrapper of Float.intBitsToFloat to use a unique NaN value for all NaN values.
   * This prevents <code>checkEvaluationWithUnsafeProjection</code> from failing due to
   * the difference between <code>UnsafeRow</code> binary presentation for NaN.
   * This is visible for testing.
   * @param bits (undocumented)
   * @return (undocumented)
   */
  public  float intBitsToFloat (int bits)  { throw new RuntimeException(); }
  /**
   * A wrapper of Double.longBitsToDouble to use a unique NaN value for all NaN values.
   * This prevents <code>checkEvaluationWithUnsafeProjection</code> from failing due to
   * the difference between <code>UnsafeRow</code> binary presentation for NaN.
   * This is visible for testing.
   * @param bits (undocumented)
   * @return (undocumented)
   */
  public  double longBitsToDouble (long bits)  { throw new RuntimeException(); }
  /**
   * Returns a randomly generated schema, based on the given accepted types.
   * <p>
   * @param numFields the number of fields in this schema
   * @param acceptedTypes types to draw from.
   * @param rand (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType randomSchema (scala.util.Random rand, int numFields, scala.collection.Seq<org.apache.spark.sql.types.DataType> acceptedTypes)  { throw new RuntimeException(); }
  /**
   * Returns a random nested schema. This will randomly generate structs and arrays drawn from
   * acceptedTypes.
   * @param rand (undocumented)
   * @param totalFields (undocumented)
   * @param acceptedTypes (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.types.StructType randomNestedSchema (scala.util.Random rand, int totalFields, scala.collection.Seq<org.apache.spark.sql.types.DataType> acceptedTypes)  { throw new RuntimeException(); }
  /**
   * Returns a function which generates random values for the given <code>DataType</code>, or <code>None</code> if no
   * random data generator is defined for that data type. The generated values will use an external
   * representation of the data type; for example, the random generator for <code>DateType</code> will return
   * instances of {@link java.sql.Date} and the generator for <code>StructType</code> will return a {@link Row}.
   * For a <code>UserDefinedType</code> for a class X, an instance of class X is returned.
   * <p>
   * @param dataType the type to generate values for
   * @param nullable whether null values should be generated
   * @param rand an optional random number generator
   * @param validJulianDatetime whether to generate dates and timestamps that are valid
   *                            in the Julian calendar.
   * @return a function which can be called to generate random values.
   */
  public  scala.Option<scala.Function0<java.lang.Object>> forType (org.apache.spark.sql.types.DataType dataType, boolean nullable, scala.util.Random rand, boolean validJulianDatetime)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Row randomRow (scala.util.Random rand, org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
}
