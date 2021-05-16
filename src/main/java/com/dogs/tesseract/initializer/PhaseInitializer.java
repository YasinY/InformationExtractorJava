package com.dogs.tesseract.initializer;

import com.google.inject.Inject;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PhaseInitializer {

    private final InitializationPhaseRetriever initializationPhaseRetriever;

    @Inject
    public PhaseInitializer(InitializationPhaseRetriever initializationPhaseRetriever) {
        this.initializationPhaseRetriever = initializationPhaseRetriever;
    }

    public void initialize() {
        List<Class<? extends TesseractInitializer>> classes = initializationPhaseRetriever.retrieveClassesByOrder();
        classes.forEach(aClass -> {
            try {
                TesseractInitializer tesseractInitializer = aClass.getDeclaredConstructor().newInstance();
                tesseractInitializer.initialise();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        });

    }
}
