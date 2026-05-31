package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricaggengine.interfaces;

public interface IMetricAggEngine {
    double computeAverage(double[] samples);

    double computePercentile(double[] samples, double percentile);

    void registerAggregation(String metricName, String aggType);

    double getLastAggregatedValue(String metricName);
}
