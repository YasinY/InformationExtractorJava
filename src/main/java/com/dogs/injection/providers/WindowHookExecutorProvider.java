package com.dogs.injection.providers;

import com.dogs.engine.executors.WindowHookExecutor;
import com.google.inject.Provider;


public class WindowHookExecutorProvider implements Provider<WindowHookExecutor> {
    @Override
    public WindowHookExecutor get() {
        return new WindowHookExecutor(null);
    }
}
