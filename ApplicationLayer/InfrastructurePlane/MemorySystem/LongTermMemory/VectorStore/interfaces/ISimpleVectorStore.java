package agent.applicationlayer.infrastructureplane.memorysystem.longtermmemory.vectorstore.interfaces;

public interface ISimpleVectorStore {
    void storeVectorData();
    void queryVectorData();
    void deleteVectorData();
    void indexVectorData();
}
