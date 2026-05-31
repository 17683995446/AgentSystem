package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filtermatcher.interfaces;

import java.util.Map;

public interface IFilterMatcher {
    boolean match(Map<String, Object> message, Map<String, Object> rule);
    boolean partialMatch(Map<String, Object> message, Map<String, Object> rule);
    void setStrict(boolean strict);
    String explainMatch(Map<String, Object> message, Map<String, Object> rule);
}
