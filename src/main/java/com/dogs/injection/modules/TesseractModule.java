package com.dogs.injection.modules;

import com.dogs.extensions.PreparedTesseract;
import com.dogs.injection.providers.TesseractProvider;
import com.google.inject.AbstractModule;
import net.sourceforge.tess4j.Tesseract;

public class TesseractModule extends AbstractModule {

    @Override
    public void configure() {
        bind(PreparedTesseract.class).toProvider(TesseractProvider.class);
    }
}
