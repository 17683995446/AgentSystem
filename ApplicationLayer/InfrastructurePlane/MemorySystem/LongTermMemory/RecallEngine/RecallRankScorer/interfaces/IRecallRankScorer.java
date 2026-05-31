package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.recallengine.recallrankscorer.interfaces;

import java.util.Map;

public interface IRecallRankScorer {
    double scoreRelevance(String query, String candidate);

    void setWeights(Map<String, Double> weights);

    void normalizeScores(Map<String, Double> scores);

    double getThreshold();
}
