package CoreLayer.ControlPlane.RuleGovernance.ConflictResolution.VoteCollector.VoteTallyEngine.interfaces;

public interface IVoteTallyEngine {
    void countVotes();
    void computeResult();
    void generateReport();
    void resetTally();
}
