package pl.codecool.annotations.exmaples;

@AnnotationExample(value = "Example", size = 20)
public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        AnnotationExample annotationExample = main.getClass().getAnnotation(AnnotationExample.class);

        System.out.println(annotationExample);

        System.out.println(main.getClass().getName());
        System.out.println(main.getClass().getSimpleName());
        System.out.println(main.getClass().getPackageName());
    }
}
