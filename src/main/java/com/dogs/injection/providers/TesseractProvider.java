package com.dogs.injection.providers;

import com.dogs.extensions.PreparedTesseract;
import com.google.inject.Provider;

public class TesseractProvider implements Provider<PreparedTesseract> {
    @Override
    public PreparedTesseract get() {
        return new PreparedTesseract();
    }
}
