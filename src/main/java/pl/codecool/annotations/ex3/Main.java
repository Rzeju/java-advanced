package pl.codecool.annotations.ex3;


import java.lang.annotation.Annotation;

@RepeatableAnnotationExample(name = "annotation 1")
@RepeatableAnnotationExample(name = "annotation 2")
@RepeatableAnnotationExample(name = "annotation 3")
@RepeatableAnnotationExample(name = "annotation 4")
public class Main extends ToExtends {

    public static void main(String[] args) {
        Class<? extends Main> mainClass = Main.class;

        for (RepeatableAnnotationExample repeatableAnnotationExample : mainClass.getAnnotationsByType(RepeatableAnnotationExample.class)) {
            System.out.println(repeatableAnnotationExample);
        }

        for (Annotation annotation : mainClass.getAnnotations()) {
            System.out.println(annotation);
        }

        for (RepeatableAnnotationContainer repeatableAnnotationExample : mainClass.getAnnotationsByType(RepeatableAnnotationContainer.class)) {
            System.out.println(repeatableAnnotationExample);
        }
    }



}
