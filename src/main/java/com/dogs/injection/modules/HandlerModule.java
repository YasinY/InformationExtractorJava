package com.dogs.injection.modules;

import com.dogs.injection.providers.WindowHandlerProvider;
import com.dogs.window.WindowHandler;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class HandlerModule extends AbstractModule {
    @Override
    public void configure() {

        bind(WindowHandler.class).toProvider(WindowHandlerProvider.class).in(Singleton.class);
    }
}
