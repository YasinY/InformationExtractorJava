package com.dogs.injection.providers;

import com.dogs.tesseract.initializer.PhaseClassFinder;
import com.google.inject.Provider;

public class PhaseClassFinderProvider implements Provider<PhaseClassFinder> {

    @Override
    public PhaseClassFinder get() {
        return new PhaseClassFinder();
    }
}
