package com.dogs.injection.modules;

import com.dogs.injection.providers.ImageProvider;
import com.dogs.resourceloader.impl.ImageLoader;
import com.google.inject.AbstractModule;

public class ResourcesModule extends AbstractModule {

    @Override
    public void configure() {
        bind(ImageLoader.class).toProvider(ImageProvider.class);
    }
}
