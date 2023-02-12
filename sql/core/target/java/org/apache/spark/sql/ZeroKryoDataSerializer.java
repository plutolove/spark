package org.apache.spark.sql;
/**
 * A <code>Serializer</code> that takes a {@link KryoData} and serializes it as KryoData(0).
 */
public  class ZeroKryoDataSerializer extends com.esotericsoftware.kryo.Serializer<org.apache.spark.sql.KryoData> {
  // not preceding
  public   ZeroKryoDataSerializer ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.KryoData read (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Input input, java.lang.Class<org.apache.spark.sql.KryoData> aClass)  { throw new RuntimeException(); }
  // not preceding
  public  void write (com.esotericsoftware.kryo.Kryo kryo, com.esotericsoftware.kryo.io.Output output, org.apache.spark.sql.KryoData t)  { throw new RuntimeException(); }
}
