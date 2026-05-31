package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowslideengine.interfaces;

public interface IWindowSlideEngine {
    void slideWindow(int newStart, int newEnd);

    boolean shouldSlide(int currentTokens, int maxTokens);

    void setSlideStrategy(String strategy);

    void resetWindow();
}
