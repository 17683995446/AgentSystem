package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filterruleparser.impl;

import java.util.Map;
import java.util.HashMap;
import workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filterruleparser.interfaces.IFilterRuleParser;

public class FilterRuleParserImpl implements IFilterRuleParser {
    public Map<String, Object> parse(String rule) {
        return new HashMap<>();
    }

    public boolean validate(String rule) {
        return rule != null && !rule.isEmpty();
    }

    public String getRuleType(String rule) {
        return "simple";
    }

    public Map<String, Object> getDefaults() {
        return new HashMap<>();
    }
}
