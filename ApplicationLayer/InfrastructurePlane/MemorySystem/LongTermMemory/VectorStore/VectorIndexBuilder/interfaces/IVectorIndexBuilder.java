package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.longtermmemory.vectorstore.vectorindexbuilder.interfaces;

public interface IVectorIndexBuilder {
    void addVector(String id, float[] vector);

    void buildIndex();

    void deleteVector(String id);

    int getIndexSize();
}
