package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricsamplepool.interfaces;

public interface IMetricSamplePool {
    void addSample(String metricName, double value);

    double[] getSamples(String metricName);

    void clearSamples(String metricName);

    int getSampleCount(String metricName);
}
