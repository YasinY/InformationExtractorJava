package com.dogs;

import com.dogs.loader.RectangleOffsetsLoader;
import com.dogs.tesseract.initializer.InitializationPhaseRetriever;
import com.dogs.tesseract.initializer.PhaseInitializer;
import com.google.inject.Injector;

public class ApplicationInitializer {

    private final Injector injector;


    public ApplicationInitializer(Injector injector) {
        this.injector = injector;
    }


    public void initialiseApplication() {

        RectangleOffsetsLoader instance = injector.getInstance(RectangleOffsetsLoader.class);

        initialiseTesseractConfigurationPhases();
    }

    private void initialiseTesseractConfigurationPhases() {

        InitializationPhaseRetriever instance = injector.getInstance(InitializationPhaseRetriever.class);
        PhaseInitializer initializer = new PhaseInitializer(instance);
        initializer.initialize();
    }
}
