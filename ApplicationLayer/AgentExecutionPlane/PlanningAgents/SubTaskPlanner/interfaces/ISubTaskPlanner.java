package agent.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.interfaces;

public interface ISubTaskPlanner {
    void decomposeGoal();
    void assignSubTask();
    void trackSubTask();
    void mergeSubTasks();
}
