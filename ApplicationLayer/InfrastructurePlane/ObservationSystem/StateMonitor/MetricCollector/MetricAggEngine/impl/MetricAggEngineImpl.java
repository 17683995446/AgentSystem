package workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricaggengine.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.metricaggengine.interfaces.IMetricAggEngine;

public class MetricAggEngineImpl implements IMetricAggEngine {
    @Override
    public double computeAverage(double[] samples) {
        return 0.0;
    }

    @Override
    public double computePercentile(double[] samples, double percentile) {
        return 0.0;
    }

    @Override
    public void registerAggregation(String metricName, String aggType) {
    }

    @Override
    public double getLastAggregatedValue(String metricName) {
        return 0.0;
    }
}
