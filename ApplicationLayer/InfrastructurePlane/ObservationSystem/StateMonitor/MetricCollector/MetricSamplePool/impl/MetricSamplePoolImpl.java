package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricsamplepool.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricsamplepool.interfaces.IMetricSamplePool;

public class MetricSamplePoolImpl implements IMetricSamplePool {
    @Override
    public void addSample(String metricName, double value) {
    }

    @Override
    public double[] getSamples(String metricName) {
        return null;
    }

    @Override
    public void clearSamples(String metricName) {
    }

    @Override
    public int getSampleCount(String metricName) {
        return 0;
    }
}
