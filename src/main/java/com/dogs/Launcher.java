package com.dogs;

import com.dogs.injection.modules.PhasesModule;
import com.dogs.injection.modules.LoaderModule;
import com.dogs.injection.providers.RectangleOffsetsProvider;
import com.dogs.loader.RectangleOffsetsLoader;
import com.dogs.tesseract.initializer.InitializationPhaseRetriever;
import com.dogs.tesseract.initializer.PhaseInitializer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Launcher {


    public static void main(String[] args) {
        displayLogo();
        Injector guice = Guice.createInjector(new LoaderModule(), new PhasesModule());

        RectangleOffsetsLoader instance = guice.getInstance(RectangleOffsetsLoader.class);

        initialiseTesseractConfigurationPhases(guice);

    }

    private static void displayLogo() {
        log.info("\n" +
                "-------------------------------------------------------------------------- \n" +
                "    __                                                 ____           __ \n" +
                "   / /   ___   ____ _   ____ _  __  __  ___           / __ )  ____   / /_\n" +
                "  / /   / _ \\ / __ `/  / __ `/ / / / / / _ \\         / __  | / __ \\ / __/\n" +
                " / /___/  __// /_/ /  / /_/ / / /_/ / /  __/        / /_/ / / /_/ // /_  \n" +
                "/_____/\\___/ \\__,_/   \\__, /  \\__,_/  \\___/        /_____/  \\____/ \\__/  \n" +
                "                     /____/                                              \n" +
                "-------------------------------------------------------------------------- \n");
    }

    private static void initialiseTesseractConfigurationPhases(Injector guice) {

        InitializationPhaseRetriever instance = guice.getInstance(InitializationPhaseRetriever.class);
        PhaseInitializer initializer = new PhaseInitializer(instance);
        initializer.initialize();
    }
}
