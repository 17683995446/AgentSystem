package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.vectorstore.vectorqueryengine.interfaces;

import java.util.List;

public interface IVectorQueryEngine {
    List<String> search(float[] queryVector, int topK);

    void setDistanceMetric(String metric);

    float computeSimilarity(float[] a, float[] b);

    void clearCache();
}
