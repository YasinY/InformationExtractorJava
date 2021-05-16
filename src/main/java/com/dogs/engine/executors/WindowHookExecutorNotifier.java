package com.dogs.engine.executors;

import com.dogs.window.IWindow;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.ptr.IntByReference;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WindowHookExecutorNotifier {

    private IWindow window;

    private final WindowHookExecutor windowHookExecutor;

    public WindowHookExecutorNotifier(IWindow window, WindowHookExecutor windowHookExecutor) {
        this.window = window;
        this.windowHookExecutor = windowHookExecutor;
    }

    public void init() {
        while (true) {
            if (window == null) {
                continue;
            }

            ProcessHandle.allProcesses().forEach(processHandle -> {
                IntByReference intReference = new IntByReference();
                long windowPid = User32.INSTANCE.GetWindowThreadProcessId(window.getHWND(), intReference);

                if (windowPid == processHandle.pid()) {
                     System.out.println("Still active pid: " + windowPid);
                 }
            });
        }
    }

    public void setWindow(IWindow window) {
        this.window = window;
    }

    public WindowHookExecutor getWindowHookExecutor() {
        return windowHookExecutor;
    }
}
