package org.apache.spark.network.netty;
/**
 * Utility for creating a {@link TransportConf} from a {@link SparkConf}.
 * param:  _conf the {@link SparkConf}
 * param:  module the module name
 * param:  numUsableCores if nonzero, this will restrict the server and client threads to only
 *                       use the given number of cores, rather than all of the machine's cores.
 *                       This restriction will only occur if these properties are not already set.
 * param:  role           optional role, could be driver, executor, worker and master. Default is
 *                      {@link None}, means no role specific configurations.
 */
// not preceding
public  class SparkTransportConf {
  // not preceding
  static public  org.apache.spark.network.util.TransportConf fromSparkConf (org.apache.spark.SparkConf _conf, java.lang.String module, int numUsableCores, scala.Option<java.lang.String> role)  { throw new RuntimeException(); }
}
