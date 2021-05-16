package com.dogs.factory;

import com.dogs.window.IWindow;
import com.dogs.window.WindowType;
import com.dogs.window.impl.IngameWindow;
import com.dogs.window.impl.LCUWindow;
import com.dogs.window.impl.LoginWindow;
import com.sun.jna.platform.win32.WinDef;

public class WindowFactory implements IWindowFactory {

    
    @Override
    public IWindow produce(WindowType windowType, WinDef.HWND hwnd) {
        switch (windowType) {
            case LCU -> new LCUWindow(hwnd);
            case LOGIN -> new LoginWindow(hwnd);
            case INGAME -> new IngameWindow(hwnd);
        }
        return null;
    }
}
