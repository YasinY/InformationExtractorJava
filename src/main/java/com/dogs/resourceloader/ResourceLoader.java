package com.dogs.resourceloader;

import com.dogs.Launcher;
import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.Optional;

@Slf4j
public abstract class ResourceLoader {


    @Inject
    public ResourceLoader() {

    }

    protected Optional<URL> getResourceFile(String name, String extension, Class<?> context) {
        String completeName = name + "." + extension;
        log.debug("Getting resource file " + completeName + " on context " + context.getSimpleName());
        return Optional.ofNullable(context.getResource(completeName));
    }

    public Optional<URL> getJSON(String name) {
        return getResourceFile(name, "json", Launcher.class);
    }
}
