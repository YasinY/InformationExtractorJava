package com.dogs.injection.providers;

import com.dogs.window.WindowHandler;
import com.google.inject.Provider;

public class WindowHandlerProvider implements Provider<WindowHandler> {


    @Override
    public WindowHandler get() {
        return new WindowHandler();
    }
}
