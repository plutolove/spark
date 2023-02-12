package org.apache.spark.streaming.dstream;
/** Return a pair DStream where each RDD is the snapshot of the state of all the keys. */
public abstract class MapWithStateDStream<KeyType extends java.lang.Object, ValueType extends java.lang.Object, StateType extends java.lang.Object, MappedType extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<MappedType> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   MapWithStateDStream (org.apache.spark.streaming.StreamingContext ssc, scala.reflect.ClassTag<MappedType> evidence$1)  { throw new RuntimeException(); }
  // not preceding
  public abstract  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<KeyType, StateType>> stateSnapshots ()  ;
}
