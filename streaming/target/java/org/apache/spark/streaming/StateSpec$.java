package org.apache.spark.streaming;
/**
 * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
 * of the <code>mapWithState</code> operation on a
 * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream}.
 * <p>
 * param:  mappingFunction The function applied on every data item to manage the associated state
 *                         and generate the mapped data
 * @param <KeyType>       Class of the keys
 * @param <ValueType>     Class of the values
 * @param <StateType>     Class of the states data
 * @param <MappedType>    Class of the mapped data
 */
// not preceding
public  class StateSpec$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final StateSpec$ MODULE$ = null;
  public   StateSpec$ ()  { throw new RuntimeException(); }
  // not preceding
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function4<org.apache.spark.streaming.Time, KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, scala.Option<MappedType>> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
   * of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.dstream.PairDStreamFunctions pair DStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated state
   *                         and generate the mapped data
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (scala.Function3<KeyType, scala.Option<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all
   * the specifications of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated
   *                        state and generate the mapped data
   * @tparam KeyType      Class of the keys
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function4<org.apache.spark.streaming.Time, KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, org.apache.spark.api.java.Optional<MappedType>> mappingFunction)  { throw new RuntimeException(); }
  /**
   * Create a {@link org.apache.spark.streaming.StateSpec StateSpec} for setting all the specifications
   * of the <code>mapWithState</code> operation on a
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream JavaPairDStream}.
   * <p>
   * @param mappingFunction The function applied on every data item to manage the associated
   *                        state and generate the mapped data
   * @tparam ValueType    Class of the values
   * @tparam StateType    Class of the states data
   * @tparam MappedType   Class of the mapped data
   * @return (undocumented)
   */
  public <KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> org.apache.spark.streaming.StateSpec<KeyType, ValueType, StateType, MappedType> function (org.apache.spark.api.java.function.Function3<KeyType, org.apache.spark.api.java.Optional<ValueType>, org.apache.spark.streaming.State<StateType>, MappedType> mappingFunction)  { throw new RuntimeException(); }
}
