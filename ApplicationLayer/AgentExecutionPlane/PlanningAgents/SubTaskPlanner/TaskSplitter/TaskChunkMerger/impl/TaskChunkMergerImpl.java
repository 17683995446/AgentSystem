package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.taskchunkmerger.impl;

import java.util.List;
import workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.taskchunkmerger.interfaces.ITaskChunkMerger;

public class TaskChunkMergerImpl implements ITaskChunkMerger {
    @Override
    public List<String> mergeChunks(List<String> chunks) {
        return null;
    }

    @Override
    public boolean canMerge(String chunkA, String chunkB) {
        return false;
    }

    @Override
    public List<String> reorderChunks(List<String> chunks) {
        return null;
    }

    @Override
    public String flattenChunks(List<String> chunks) {
        return null;
    }
}
