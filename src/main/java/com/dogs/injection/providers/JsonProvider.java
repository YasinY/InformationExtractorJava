package com.dogs.injection.providers;

import com.dogs.injection.providers.internal.loaders.JsonLoader;
import com.google.inject.Provider;

public class JsonProvider implements Provider<JsonLoader> {

    @Override
    public JsonLoader get() {
        return new JsonLoader();
    }
}
