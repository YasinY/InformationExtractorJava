package com.dogs.injection.modules;

import com.dogs.engine.executors.WindowHookExecutor;
import com.dogs.engine.executors.WindowHookExecutorNotifier;
import com.dogs.injection.providers.WindowHookExecutorProvider;
import com.dogs.injection.providers.WindowHookExecutorNotifierProvider;
import com.google.inject.AbstractModule;

public class ExecutorsModule extends AbstractModule {

    @Override
    public void configure() {
        bind(WindowHookExecutorNotifier.class).toProvider(WindowHookExecutorNotifierProvider.class);
        bind(WindowHookExecutor.class).toProvider(WindowHookExecutorProvider.class);
    }
}
