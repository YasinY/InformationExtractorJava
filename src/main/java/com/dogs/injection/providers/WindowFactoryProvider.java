package com.dogs.injection.providers;

import com.dogs.factory.WindowFactory;
import com.google.inject.Provider;


public class WindowFactoryProvider implements Provider<WindowFactory> {

    @Override
    public WindowFactory get() {
        return new WindowFactory();
    }
}
