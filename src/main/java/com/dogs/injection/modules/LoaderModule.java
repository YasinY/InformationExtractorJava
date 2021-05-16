package com.dogs.injection.modules;

import com.dogs.injection.providers.ImageProvider;
import com.dogs.injection.providers.JsonProvider;
import com.dogs.injection.providers.RectangleOffsetsProvider;
import com.dogs.loader.RectangleOffsetsLoader;
import com.dogs.resourceloader.impl.ImageLoader;
import com.dogs.resourceloader.impl.JsonLoader;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class LoaderModule extends AbstractModule {

    @Override
    public void configure() {
        bind(ImageLoader.class).annotatedWith(Names.named("ImageLoader")).toProvider(ImageProvider.class);
        bind(JsonLoader.class).annotatedWith(Names.named("JsonLoader")).toProvider(JsonProvider.class);
        bind(RectangleOffsetsLoader.class)
                .annotatedWith(Names.named("RectangleOffsetsLoader"))
                .toProvider(RectangleOffsetsProvider.class)
                .in(Singleton.class);
    }
}
