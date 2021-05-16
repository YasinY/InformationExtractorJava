package com.dogs.tesseract.initializer.phases;

import com.dogs.annotations.PhaseOrder;
import com.dogs.tesseract.initializer.TesseractInitializer;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.tess4j.util.LoadLibs;

import java.io.File;

@PhaseOrder(1)
@Slf4j
public class DependencyExtractionPhase implements TesseractInitializer {

    public static final String PLATFORM = "win32-x86-64";

    @Override
    public void initialise() {
        File tempFolder = LoadLibs.extractTessResources(PLATFORM);
        System.setProperty("java.library.path", tempFolder.getPath());
        log.debug("Extracted tess resources and linked path for platform " + PLATFORM);
    }
}
