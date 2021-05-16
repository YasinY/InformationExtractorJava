package com.dogs.window;

import com.sun.jna.platform.win32.WinDef;

public interface IWindowProperties {

    WinDef.HWND getHWND();
}
