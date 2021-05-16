package com.dogs.injection.providers;

import com.dogs.injection.providers.internal.loaders.DimensionDataLoader;
import com.dogs.injection.providers.internal.loaders.JsonLoader;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class DimensionDataProvider implements Provider<DimensionDataLoader> {

    @Inject
    private JsonLoader jsonLoader;

    @Override
    public DimensionDataLoader get() {
        return new DimensionDataLoader(jsonLoader);
    }
}
