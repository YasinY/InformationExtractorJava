package com.dogs.injection.providers;

import com.dogs.loader.RectangleOffsetsLoader;
import com.dogs.resourceloader.impl.JsonLoader;
import com.google.inject.Inject;
import com.google.inject.Provider;

import javax.inject.Named;

public class RectangleOffsetsProvider implements Provider<RectangleOffsetsLoader> {

    @Inject
    private JsonLoader jsonLoader;

    @Override
    public RectangleOffsetsLoader get() {
        return new RectangleOffsetsLoader(jsonLoader);
    }
}
