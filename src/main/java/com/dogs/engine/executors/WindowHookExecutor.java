package com.dogs.engine.executors;

import com.dogs.window.IWindow;

public class WindowHookExecutor {

    private IWindow window;

    public WindowHookExecutor(IWindow window) {
        this.window = window;
    }

    public IWindow getWindow() {
        return window;
    }

    public void setWindow(IWindow window) {
        this.window = window;
    }
}
