package org.apache.spark.sql.hive;
/**
 * Wraps with Hive types based on object inspector.
 */
public  interface HiveInspectors {
  public  class typeInfoConversions {
    public  org.apache.hadoop.hive.serde2.typeinfo.TypeInfo toTypeInfo ()  { throw new RuntimeException(); }
    // not preceding
    public   typeInfoConversions (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  }
  public  org.apache.spark.sql.types.DecimalType decimalTypeInfoToCatalyst (org.apache.hadoop.hive.serde2.objectinspector.PrimitiveObjectInspector inspector)  ;
  public  org.apache.hadoop.io.BytesWritable getBinaryWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getBinaryWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.io.BooleanWritable getBooleanWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getBooleanWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.hive.serde2.io.ByteWritable getByteWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getByteWritableConstantObjectInspector (Object value)  ;
  public  org.apache.spark.sql.execution.datasources.DaysWritable getDateWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getDateWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.hive.serde2.io.HiveDecimalWritable getDecimalWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getDecimalWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.hive.serde2.io.DoubleWritable getDoubleWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getDoubleWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.io.FloatWritable getFloatWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getFloatWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.io.IntWritable getIntWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getIntWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.io.LongWritable getLongWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getLongWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getPrimitiveNullWritableConstantObjectInspector ()  ;
  public  org.apache.hadoop.hive.serde2.io.ShortWritable getShortWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getShortWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.io.Text getStringWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getStringWritableConstantObjectInspector (Object value)  ;
  public  org.apache.hadoop.hive.serde2.io.TimestampWritable getTimestampWritable (Object value)  ;
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector getTimestampWritableConstantObjectInspector (Object value)  ;
  public  org.apache.spark.sql.types.DataType inspectorToDataType (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector inspector)  ;
  public  boolean isSubClassOf (java.lang.reflect.Type t, java.lang.Class<?> parent)  ;
  public  org.apache.spark.sql.types.DataType javaTypeToDataType (java.lang.reflect.Type clz)  ;
  /**
   * @param dataType Catalyst data type
   * @return Hive java object inspector (recursively), not the Writable ObjectInspector
   * We can easily map to the Hive built-in object inspector according to the data type.
   */
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.types.DataType dataType)  ;
  /**
   * Map the catalyst expression to ObjectInspector, however,
   * if the expression is <code>Literal</code> or foldable, a constant writable object inspector returns;
   * Otherwise, we always get the object inspector according to its data type(in catalyst)
   * @param expr Catalyst expression to be mapped
   * @return Hive java objectinspector (recursively).
   */
  public  org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector toInspector (org.apache.spark.sql.catalyst.expressions.Expression expr)  ;
  /**
   * Builds unwrappers ahead of time according to object inspector
   * types to avoid pattern matching and branching costs per row.
   * <p>
   * Strictly follows the following order in unwrapping (constant OI has the higher priority):
   * Constant Null object inspector =&gt;
   *   return null
   * Constant object inspector =&gt;
   *   extract the value from constant object inspector
   * If object inspector prefers writable =&gt;
   *   extract writable from <code>data</code> and then get the catalyst type from the writable
   * Extract the java object directly from the object inspector
   * <p>
   * NOTICE: the complex data type requires recursive unwrapping.
   * <p>
   * @param objectInspector the ObjectInspector used to create an unwrapper.
   * @return A function that unwraps data objects.
   *         Use the overloaded HiveStructField version for in-place updating of a MutableRow.
   */
  public  scala.Function1<java.lang.Object, java.lang.Object> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector objectInspector)  ;
  /**
   * Builds unwrappers ahead of time according to object inspector
   * types to avoid pattern matching and branching costs per row.
   * <p>
   * @param field The HiveStructField to create an unwrapper for.
   * @return A function that performs in-place updating of a MutableRow.
   *         Use the overloaded ObjectInspector version for assignments.
   */
  public  scala.Function3<java.lang.Object, org.apache.spark.sql.catalyst.InternalRow, java.lang.Object, scala.runtime.BoxedUnit> unwrapperFor (org.apache.hadoop.hive.serde2.objectinspector.StructField field)  ;
  public  scala.Function1<java.lang.Object, java.lang.Object> withNullSafe (scala.Function1<java.lang.Object, java.lang.Object> f)  ;
  public  java.lang.Object wrap (Object a, org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  ;
  public  java.lang.Object[] wrap (org.apache.spark.sql.catalyst.InternalRow row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  ;
  public  java.lang.Object[] wrap (scala.collection.Seq<java.lang.Object> row, scala.Function1<java.lang.Object, java.lang.Object>[] wrappers, java.lang.Object[] cache, org.apache.spark.sql.types.DataType[] dataTypes)  ;
  /**
   * Wraps with Hive types based on object inspector.
   * @param oi (undocumented)
   * @param dataType (undocumented)
   * @return (undocumented)
   */
  public  scala.Function1<java.lang.Object, java.lang.Object> wrapperFor (org.apache.hadoop.hive.serde2.objectinspector.ObjectInspector oi, org.apache.spark.sql.types.DataType dataType)  ;
}
