package com.dogs.injection.providers;

import com.dogs.tesseract.initializer.PhaseClassFinder;
import com.dogs.tesseract.initializer.PhaseInitializer;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class PhaseInitializerProvider implements Provider<PhaseInitializer> {

    @Inject
    private PhaseClassFinder phaseClassFinder;

    @Override
    public PhaseInitializer get() {
        return new PhaseInitializer(phaseClassFinder);
    }
}
