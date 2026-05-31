package workspace.agentsystem.corelayer.coordinationplane.messagebus.subscribeservice.filterengine.filterruleparser.interfaces;

import java.util.Map;

public interface IFilterRuleParser {
    Map<String, Object> parse(String rule);
    boolean validate(String rule);
    String getRuleType(String rule);
    Map<String, Object> getDefaults();
}
