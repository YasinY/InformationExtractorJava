package com.dogs.factory;

import com.dogs.window.IWindow;
import com.dogs.window.WindowType;
import com.sun.jna.platform.win32.WinDef;

public interface IWindowFactory {

    public IWindow produce(WindowType windowType, WinDef.HWND hwnd);
}
