package com.dogs.injection.modules;

import com.dogs.injection.providers.ImageProvider;
import com.dogs.injection.providers.JsonProvider;
import com.dogs.injection.providers.DimensionDataProvider;
import com.dogs.injection.providers.internal.loaders.DimensionDataLoader;
import com.dogs.injection.providers.internal.loaders.ImageLoader;
import com.dogs.injection.providers.internal.loaders.JsonLoader;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class LoaderModule extends AbstractModule {

    @Override
    public void configure() {
        bind(ImageLoader.class).annotatedWith(Names.named("ImageLoader")).toProvider(ImageProvider.class);
        bind(JsonLoader.class).annotatedWith(Names.named("JsonLoader")).toProvider(JsonProvider.class);
        bind(DimensionDataLoader.class)
                .annotatedWith(Names.named("RectangleOffsetsLoader"))
                .toProvider(DimensionDataProvider.class)
                .in(Singleton.class);
    }
}
