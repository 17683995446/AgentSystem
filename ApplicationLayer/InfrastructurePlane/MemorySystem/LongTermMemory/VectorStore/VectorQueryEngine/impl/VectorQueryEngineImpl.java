package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.vectorstore.vectorqueryengine.impl;

import java.util.List;
import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.vectorstore.vectorqueryengine.interfaces.IVectorQueryEngine;

public class VectorQueryEngineImpl implements IVectorQueryEngine {
    @Override
    public List<String> search(float[] queryVector, int topK) {
        return null;
    }

    @Override
    public void setDistanceMetric(String metric) {
    }

    @Override
    public float computeSimilarity(float[] a, float[] b) {
        return 0.0f;
    }

    @Override
    public void clearCache() {
    }
}
