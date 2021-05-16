package com.dogs.resourceloader;

import com.dogs.Launcher;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.Optional;

@Slf4j
public abstract class ResourceLoader {


    protected Optional<URL> getResourceFile(String name, String extension) {
        String completeName = name + "." + extension;
        log.debug("Getting resource file " + completeName + " on current context ");
        return Optional.ofNullable(Thread.currentThread().getContextClassLoader().getResource(completeName));
    }

    public Optional<URL> getJSON(String name) {
        return getResourceFile(name, "json");
    }
}
