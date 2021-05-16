package com.dogs.tesseract.initializer;

import com.dogs.annotations.PhaseOrder;
import org.reflections.Reflections;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PhaseClassFinder {

    public List<Class<? extends TesseractInitializer>> findPhaseClassesByOrder() {
        Reflections reflections = new Reflections("com.dogs.tesseract.initializer");

        Set<Class<? extends TesseractInitializer>> subTypesOf = reflections.getSubTypesOf(TesseractInitializer.class);

        Comparator<Class<? extends TesseractInitializer>> phaseOrderComparator = Comparator.comparingInt(value -> value.getAnnotation(PhaseOrder.class).value());

        List<Class<? extends TesseractInitializer>> collected = subTypesOf.stream().sorted(phaseOrderComparator).collect(Collectors.toList());


        return collected;
    }
}
