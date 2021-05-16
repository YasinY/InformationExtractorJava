package com.dogs;

import com.dogs.injection.providers.internal.loaders.DimensionDataLoader;
import com.dogs.tesseract.initializer.InitializationPhaseRetriever;
import com.dogs.tesseract.initializer.PhaseInitializer;
import com.google.inject.Injector;

public class ApplicationInitializer {

    private final Injector injector;


    public ApplicationInitializer(Injector injector) {
        this.injector = injector;
    }


    public void initialiseApplication() {
        initialiseDimensionData();
        initialiseTesseractConfigurationPhases();
    }

    private void initialiseDimensionData() {
        DimensionDataLoader instance = injector.getInstance(DimensionDataLoader.class);
        instance.fill();
    }

    private void initialiseTesseractConfigurationPhases() {

        InitializationPhaseRetriever instance = injector.getInstance(InitializationPhaseRetriever.class);
        PhaseInitializer initializer = new PhaseInitializer(instance);
        initializer.initialize();
    }
}
