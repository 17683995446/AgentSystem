package agent.corelayer.controlplane.taskplanning.globalplan.strategybuilder.interfaces;

public interface IStrategyBuilder {
    void defineStrategy();
    void buildStrategy();
    void validateStrategy();
    void deployStrategy();
    void rollbackStrategy();
}
