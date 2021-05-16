package com.dogs.resourceloader.impl;

import com.dogs.Launcher;
import com.dogs.resourceloader.ResourceLoader;
import com.google.inject.Inject;

import java.net.URL;
import java.util.Optional;

public class ImageLoader extends ResourceLoader {

    @Inject
    public ImageLoader() {

    }
    public Optional<URL> getImage(String name, String extension, Class<?> context) {
        return getResourceFile(name, extension, context);
    }

    public Optional<URL> getImage(String name, String extension) {
        return getResourceFile(name, extension, Launcher.class);
    }

    public Optional<URL> getPNG(String name) {
        return getResourceFile(name, "png", Launcher.class);
    }
    public Optional<URL> getPNG(String name, Class<?> context) {
        return getResourceFile(name, "png", context);
    }
}
