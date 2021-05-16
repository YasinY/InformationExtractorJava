package com.dogs.window.impl;

import com.dogs.window.Window;
import com.sun.jna.platform.win32.WinDef;

public class IngameWindow extends Window {

    public IngameWindow(WinDef.HWND reference) {
        super(reference);
    }
}
