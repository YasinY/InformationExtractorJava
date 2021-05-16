package com.dogs.injection.modules;

import com.dogs.factory.WindowFactory;
import com.dogs.injection.providers.WindowFactoryProvider;
import com.google.inject.AbstractModule;

public class FactoriesModule extends AbstractModule {

    @Override
    public void configure() {
        bind(WindowFactory.class).toProvider(WindowFactoryProvider.class);
    }
}
