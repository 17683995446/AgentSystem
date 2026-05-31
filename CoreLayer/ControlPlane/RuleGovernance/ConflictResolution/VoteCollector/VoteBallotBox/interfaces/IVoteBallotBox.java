package CoreLayer.ControlPlane.RuleGovernance.ConflictResolution.VoteCollector.VoteBallotBox.interfaces;

public interface IVoteBallotBox {
    void castVote();
    void collectBallot();
    void sealBallotBox();
    void openBallotBox();
}
