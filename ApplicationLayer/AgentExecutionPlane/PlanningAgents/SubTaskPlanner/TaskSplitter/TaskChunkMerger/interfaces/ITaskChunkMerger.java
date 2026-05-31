package workspace.agentsystem.applicationlayer.agentexecutionplane.planningagents.subtaskplanner.tasksplitter.taskchunkmerger.interfaces;

import java.util.List;

public interface ITaskChunkMerger {
    List<String> mergeChunks(List<String> chunks);
    boolean canMerge(String chunkA, String chunkB);
    List<String> reorderChunks(List<String> chunks);
    String flattenChunks(List<String> chunks);
}
