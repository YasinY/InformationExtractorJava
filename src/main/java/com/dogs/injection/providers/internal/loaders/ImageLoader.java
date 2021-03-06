package com.dogs.injection.providers.internal.loaders;

import com.dogs.resourceloader.ResourceLoader;

import java.net.URL;
import java.util.Optional;

public class ImageLoader extends ResourceLoader {

    public Optional<URL> getImage(String name, String extension) {
        return getResourceFile(name, extension);
    }


    public Optional<URL> getPNG(String name) {
        return getResourceFile(name, "png");
    }

}
