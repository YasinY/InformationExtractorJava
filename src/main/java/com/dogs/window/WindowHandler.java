package com.dogs.window;

public class WindowHandler {

    private IWindow currentWindow;



    public void setCurrentWindow(IWindow currentWindow) {
        this.currentWindow = currentWindow;
    }

    public IWindow getCurrentWindow() {
        return currentWindow;
    }


}
