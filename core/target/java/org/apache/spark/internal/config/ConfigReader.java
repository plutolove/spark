package org.apache.spark.internal.config;
/**
 * Binds a prefix to a provider. This method is not thread-safe and should be called
 * before the instance is used to expand values.
 */
  class ConfigReader {
  // not preceding
  public   ConfigReader (org.apache.spark.internal.config.ConfigProvider conf)  { throw new RuntimeException(); }
  // not preceding
  public   ConfigReader (java.util.Map<java.lang.String, java.lang.String> conf)  { throw new RuntimeException(); }
  /**
   * Binds a prefix to a provider. This method is not thread-safe and should be called
   * before the instance is used to expand values.
   * @param prefix (undocumented)
   * @param provider (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.internal.config.ConfigReader bind (java.lang.String prefix, org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bind (java.lang.String prefix, java.util.Map<java.lang.String, java.lang.String> values)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bindEnv (org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  public  org.apache.spark.internal.config.ConfigReader bindSystem (org.apache.spark.internal.config.ConfigProvider provider)  { throw new RuntimeException(); }
  /**
   * Reads a configuration key from the default provider, and apply variable substitution.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> get (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Perform variable substitution on the given input string.
   * @param input (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String substitute (java.lang.String input)  { throw new RuntimeException(); }
}
