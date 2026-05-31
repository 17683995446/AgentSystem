package workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowtokencounter.impl;

import workspace.agentsystem.applicationlayer.infrastructureplane.memorysystem.workingmemory.contextwindow.windowtokencounter.interfaces.IWindowTokenCounter;

public class WindowTokenCounterImpl implements IWindowTokenCounter {
    @Override
    public int countTokens(String text) {
        return 0;
    }

    @Override
    public boolean isWithinLimit(String text, int maxTokens) {
        return false;
    }

    @Override
    public void setEncoding(String encoding) {
    }

    @Override
    public int getTokenLimit() {
        return 0;
    }
}
