package agent.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.interfaces;

public interface ISimpleFilterEngine {
    void applyTopicFilter();
    void applyContentFilter();
    void resetFilterState();
    void testFilterMatch();
    void updateFilterRules();
}
