package com.dogs.injection.providers;

import com.dogs.engine.executors.WindowHookExecutor;
import com.dogs.engine.executors.WindowHookExecutorNotifier;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class WindowHookExecutorNotifierProvider implements Provider<WindowHookExecutorNotifier> {


    @Inject
    private WindowHookExecutor windowHookExecutor;

    @Override
    public WindowHookExecutorNotifier get() {
        return new WindowHookExecutorNotifier(null, windowHookExecutor);
    }
}
