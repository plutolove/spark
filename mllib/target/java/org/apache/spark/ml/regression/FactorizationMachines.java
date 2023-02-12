package org.apache.spark.ml.regression;
/**
 * The solver algorithm for optimization.
 * Supported options: "gd", "adamW".
 * Default: "adamW"
 * <p>
 * @group param
 */
public  interface FactorizationMachines extends org.apache.spark.ml.regression.FactorizationMachinesParams {
    org.apache.spark.mllib.linalg.Vector initCoefficients (int numFeatures)  ;
    org.apache.spark.ml.linalg.Vector trainImpl (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.linalg.Vector>> data, int numFeatures, java.lang.String loss)  ;
}
