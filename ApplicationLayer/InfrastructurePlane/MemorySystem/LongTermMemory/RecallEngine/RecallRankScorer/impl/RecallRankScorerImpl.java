package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallrankscorer.impl;

import java.util.Map;
import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallrankscorer.interfaces.IRecallRankScorer;

public class RecallRankScorerImpl implements IRecallRankScorer {
    @Override
    public double scoreRelevance(String query, String candidate) {
        return 0.0;
    }

    @Override
    public void setWeights(Map<String, Double> weights) {
    }

    @Override
    public void normalizeScores(Map<String, Double> scores) {
    }

    @Override
    public double getThreshold() {
        return 0.0;
    }
}
