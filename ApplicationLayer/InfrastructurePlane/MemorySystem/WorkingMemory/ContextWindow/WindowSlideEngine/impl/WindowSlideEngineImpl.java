package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowslideengine.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowslideengine.interfaces.IWindowSlideEngine;

public class WindowSlideEngineImpl implements IWindowSlideEngine {
    @Override
    public void slideWindow(int newStart, int newEnd) {
    }

    @Override
    public boolean shouldSlide(int currentTokens, int maxTokens) {
        return false;
    }

    @Override
    public void setSlideStrategy(String strategy) {
    }

    @Override
    public void resetWindow() {
    }
}
