package org.apache.spark.sql.avro;
/**
 * The <code>compression</code> option allows to specify a compression codec used in write.
 * Currently supported codecs are <code>uncompressed</code>, <code>snappy</code>, <code>deflate</code>, <code>bzip2</code> and <code>xz</code>.
 * If the option is not set, the <code>spark.sql.avro.compression.codec</code> config is taken into
 * account. If the former one is not set too, the <code>snappy</code> codec is used by default.
 */
// not preceding
public  class AvroOptions$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AvroOptions$ MODULE$ = null;
  public   AvroOptions$ ()  { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.avro.AvroOptions apply (scala.collection.immutable.Map<java.lang.String, java.lang.String> parameters)  { throw new RuntimeException(); }
  public  java.lang.String ignoreExtensionKey ()  { throw new RuntimeException(); }
}
