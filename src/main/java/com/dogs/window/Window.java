package com.dogs.window;

import com.sun.jna.platform.win32.WinDef;

public class Window implements IWindow {

    private final WinDef.HWND reference;

    public Window(WinDef.HWND reference) {
        this.reference = reference;
    }

    public WinDef.HWND getReference() {
        return reference;
    }

    @Override
    public void onExit() {

    }

    @Override
    public void onFocus() {

    }

    @Override
    public void onHide() {

    }
}
