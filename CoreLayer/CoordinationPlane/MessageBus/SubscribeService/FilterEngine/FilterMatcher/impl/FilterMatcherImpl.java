package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filtermatcher.impl;

import java.util.Map;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filtermatcher.interfaces.IFilterMatcher;

public class FilterMatcherImpl implements IFilterMatcher {
    private boolean strict = true;

    public boolean match(Map<String, Object> message, Map<String, Object> rule) {
        return message.keySet().containsAll(rule.keySet());
    }

    public boolean partialMatch(Map<String, Object> message, Map<String, Object> rule) {
        return match(message, rule);
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    public String explainMatch(Map<String, Object> message, Map<String, Object> rule) {
        return strict ? "strict" : "loose";
    }
}
