package agent.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.interfaces;

public interface ISimpleTaskSplitter {
    void analyzeTaskSize();
    void splitTaskByRule();
    void assignSubTaskId();
    void linkSubTasks();
}
