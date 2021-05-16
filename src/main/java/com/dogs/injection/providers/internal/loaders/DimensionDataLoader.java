package com.dogs.injection.providers.internal.loaders;

import com.dogs.extensions.DimensionData;
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
public class DimensionDataLoader {

    private final JsonLoader jsonLoader;

    private DimensionData dimensionData;

    @Inject
    public DimensionDataLoader(JsonLoader jsonLoader) {
        this.jsonLoader = jsonLoader;
    }

    public void fill() {
        Gson gson = new Gson();
        Optional<URL> potentialRectanglePositions = jsonLoader.getJSON("dimension-data");
        if (potentialRectanglePositions.isEmpty()) {
            log.error("Could not find dimension data.");
            return;
        }
        URL url = potentialRectanglePositions.get();
        try {
            Reader reader = new InputStreamReader(url.openStream(), StandardCharsets.UTF_8);
            this.dimensionData = gson.fromJson(reader, DimensionData.class);
            log.debug(String.format("Loaded %d dimensions", dimensionData.size()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DimensionData getDimensionData() {
        return dimensionData;
    }


}
