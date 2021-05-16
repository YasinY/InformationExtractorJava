package com.dogs.injection.providers;

import com.dogs.injection.providers.internal.loaders.ImageLoader;
import com.google.inject.Provider;

public class ImageProvider implements Provider<ImageLoader> {

    @Override
    public ImageLoader get() {
        return new ImageLoader();
    }
}
