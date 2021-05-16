package com.dogs.injection.modules;

import com.dogs.injection.providers.PhaseClassFinderProvider;
import com.dogs.injection.providers.PhaseInitializerProvider;
import com.dogs.tesseract.initializer.PhaseClassFinder;
import com.dogs.tesseract.initializer.PhaseInitializer;
import com.google.inject.AbstractModule;

public class PhasesModule extends AbstractModule {

    @Override
    public void configure() {
        bind(PhaseClassFinder.class).toProvider(PhaseClassFinderProvider.class);
        bind(PhaseInitializer.class).toProvider(PhaseInitializerProvider.class);
    }
}
