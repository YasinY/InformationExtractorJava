package com.dogs.injection.providers;

import com.dogs.resourceloader.ResourceLoader;
import com.dogs.resourceloader.impl.JsonLoader;
import com.google.inject.Provider;

public class JsonProvider implements Provider<JsonLoader> {

    @Override
    public JsonLoader get() {
        return new JsonLoader();
    }
}
