package com.dogs.resourceloader.impl;

import com.dogs.resourceloader.ResourceLoader;

import java.net.URL;
import java.util.Optional;

public class JsonLoader extends ResourceLoader {

    public Optional<URL> getJSON(String name) {
        return getResourceFile(name, "json");
    }
}
