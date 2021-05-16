package com.dogs.injection.providers;

import com.dogs.resourceloader.ResourceLoader;
import com.dogs.resourceloader.impl.JsonLoader;
import com.google.inject.Provider;

public class JsonProvider implements Provider<ResourceLoader> {
    @Override
    public ResourceLoader get() {
        return new JsonLoader();
    }
}
