package com.dogs.tesseract.initializer.phases;

import com.dogs.annotations.PhaseOrder;
import com.dogs.tesseract.initializer.TesseractInitializer;
import lombok.extern.slf4j.Slf4j;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

@PhaseOrder(1)
@Slf4j
public class EnvironmentConfigurationPhase implements TesseractInitializer {

    @Override
    public void initialise() {
        try {
            URI uri = ClassLoader.getSystemResource("tessdata").toURI();
            Path dataDirectory = Paths.get(uri);
            System.setProperty("TESSDATA_PREFIX", dataDirectory.toString());
            log.debug("Added tessdata data path to environment");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
