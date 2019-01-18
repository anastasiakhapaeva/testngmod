package com.epam.mentoring.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotationTransformerListener implements IAnnotationTransformer {

    private final Logger LOGGER = LogManager.getLogger();

    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        if (method.getName().equals("printAge")) {
            iTestAnnotation.setDataProvider("ages");
        }

        Annotation[] annotationsUsedForTest = method.getAnnotations();
        for (Annotation annotation : annotationsUsedForTest) {
            LOGGER.info("Annotation: " + annotation.annotationType().getName());
            if(annotation.annotationType().getName().equals("com.epam.mentoring.annotation.Description")){
                iTestAnnotation.setEnabled(false);
            }
        }
    }
}
