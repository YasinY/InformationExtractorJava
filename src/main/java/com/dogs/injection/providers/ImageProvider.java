package com.dogs.injection.providers;

import com.dogs.resourceloader.ResourceLoader;
import com.dogs.resourceloader.impl.ImageLoader;
import com.google.inject.Provider;

public class ImageProvider implements Provider<ImageLoader> {


    @Override
    public ImageLoader get() {
        return new ImageLoader();
    }
}
