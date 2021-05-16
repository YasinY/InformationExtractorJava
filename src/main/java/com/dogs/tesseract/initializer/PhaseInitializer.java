package com.dogs.tesseract.initializer;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PhaseInitializer {

    private final PhaseClassFinder phaseClassFinder;

    public PhaseInitializer(PhaseClassFinder phaseClassFinder) {
        this.phaseClassFinder = phaseClassFinder;
    }

    public void init() {
        List<Class<? extends TesseractInitializer>> classes = phaseClassFinder.findPhaseClassesByOrder();
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
