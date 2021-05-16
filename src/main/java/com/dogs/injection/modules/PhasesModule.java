package com.dogs.injection.modules;

import com.dogs.injection.providers.InitializationPhaseProvider;
import com.dogs.tesseract.initializer.InitializationPhaseRetriever;
import com.google.inject.AbstractModule;

public class PhasesModule extends AbstractModule {

    @Override
    public void configure() {
        bind(InitializationPhaseRetriever.class).toProvider(InitializationPhaseProvider.class);
    }
}
