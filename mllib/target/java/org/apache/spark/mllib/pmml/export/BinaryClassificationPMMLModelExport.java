package org.apache.spark.mllib.pmml.export;
/**
 * Export the input LogisticRegressionModel or SVMModel to PMML format.
 */
  class BinaryClassificationPMMLModelExport implements org.apache.spark.mllib.pmml.export.PMMLModelExport {
  // not preceding
  public   BinaryClassificationPMMLModelExport (org.apache.spark.mllib.regression.GeneralizedLinearModel model, java.lang.String description, org.dmg.pmml.regression.RegressionModel.NormalizationMethod normalizationMethod, double threshold)  { throw new RuntimeException(); }
  // not preceding
  public  org.dmg.pmml.PMML pmml ()  { throw new RuntimeException(); }
}
