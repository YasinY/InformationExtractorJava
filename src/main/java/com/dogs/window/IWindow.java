package com.dogs.window;

import com.dogs.engine.hooks.Hook;
import com.sun.jna.platform.win32.WinDef;

public interface IWindow extends IWindowProperties, Hook {

    @Override
    WinDef.HWND getHWND();

    void onCycle();
}
