package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowtokencounter.interfaces;

public interface IWindowTokenCounter {
    int countTokens(String text);

    boolean isWithinLimit(String text, int maxTokens);

    void setEncoding(String encoding);

    int getTokenLimit();
}
