package com.dogs.window.impl;

import com.dogs.window.Window;
import com.sun.jna.platform.win32.WinDef;

public class LCUWindow extends Window {

    public LCUWindow(WinDef.HWND reference) {
        super(reference);
    }
}
