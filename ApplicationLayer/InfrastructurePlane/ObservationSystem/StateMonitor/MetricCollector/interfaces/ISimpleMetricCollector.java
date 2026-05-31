package agent.applicationlayer.infrastructureplane.observationsystem.statemonitor.metriccollector.interfaces;

public interface ISimpleMetricCollector {
    void registerMetricSource();
    void collectMetricSample();
    void aggregateMetricData();
    void exportMetricSnapshot();
}
