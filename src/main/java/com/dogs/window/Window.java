package com.dogs.window;

import com.sun.jna.platform.win32.WinDef;

public class Window implements IWindow {

    private final WinDef.HWND reference;

    public Window(WinDef.HWND reference) {
        this.reference = reference;
    }

    @Override
    public WinDef.HWND getHWND() {
        return reference;
    }

    @Override
    public void onCycle() {

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
