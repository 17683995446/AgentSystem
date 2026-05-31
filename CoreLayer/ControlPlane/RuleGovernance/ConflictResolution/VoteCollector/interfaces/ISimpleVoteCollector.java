package agent.corelayer.controlplane.rulegovernance.conflictresolution.votecollector.interfaces;

public interface ISimpleVoteCollector {
    void registerVoteCast();
    void tallyAllVotes();
    void checkQuorumMet();
    void discardStaleVotes();
    void emitVoteResult();
}
