package com.dogs;

import com.dogs.injection.modules.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EntryPoint {


    public static void main(String[] args) {
        displayLogo();
        Injector guice = Guice.createInjector(new LoaderModule(),
                new PhasesModule(),
                new TesseractModule(),
                new FactoriesModule(),
                new ExecutorsModule());
        new ApplicationInitializer(guice).initialiseApplication();

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
}
