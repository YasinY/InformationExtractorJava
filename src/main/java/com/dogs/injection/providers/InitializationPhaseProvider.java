package com.dogs.injection.providers;

import com.dogs.tesseract.initializer.InitializationPhaseRetriever;
import com.google.inject.Provider;

public class InitializationPhaseProvider implements Provider<InitializationPhaseRetriever> {

    @Override
    public InitializationPhaseRetriever get() {
        return new InitializationPhaseRetriever();
    }
}
