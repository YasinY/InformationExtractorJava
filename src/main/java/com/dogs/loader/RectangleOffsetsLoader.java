package com.dogs.loader;

import com.dogs.extensions.RectanglePositions;
import com.dogs.resourceloader.impl.JsonLoader;
import com.google.gson.Gson;
import com.google.inject.Inject;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Optional;

@Slf4j
public class RectangleOffsetsLoader {

    private final JsonLoader jsonLoader;

    private RectanglePositions rectanglePositions;

    @Inject
    public RectangleOffsetsLoader(JsonLoader jsonLoader) {
        this.jsonLoader = jsonLoader;
        fill();
    }

    public void fill() {
        log.debug("Loading potential positions..");
        Gson gson = new Gson();
        Optional<URL> potentialRectanglePositions = jsonLoader.getJSON("rectangle_positions");
        if (potentialRectanglePositions.isEmpty()) {
            log.error("Could not find rectangle positions.");
            return;
        }
        log.debug("Found rectangle positions");
        URL url = potentialRectanglePositions.get();
        try {
            Reader reader = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
            this.rectanglePositions = gson.fromJson(reader, RectanglePositions.class);
            log.debug(String.format("Loaded %d rectangle positions", rectanglePositions.size()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
