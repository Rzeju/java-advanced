package pl.codecool.annotations.ex1;


import lombok.NonNull;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

@AnnotationRuntimeExample("myAnnotation")
@AnnotationClassExample
@AnnotationSourceExample("source")
public class Main {

    public static void main(String[] args) {

        @NonNull
        Main main = new Main();

        for (Annotation annotation : main.getClass().getAnnotations()) {
            System.out.println(annotation);
        }

        AnnotationRuntimeExample annotationRuntimeExample = main.getClass().getAnnotation(AnnotationRuntimeExample.class);
        System.out.println(annotationRuntimeExample.value());
        System.out.println(annotationRuntimeExample.myClass());

        @SuppressWarnings("unchecked")
        List listOfUndefinedObjects = new ArrayList();
        @SuppressWarnings("unchecked")
        List<Integer> listOfIntegers = (List<Integer>) listOfUndefinedObjects;



    }
}

