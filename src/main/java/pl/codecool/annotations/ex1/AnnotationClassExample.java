package pl.codecool.annotations.ex1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
@AnnotationRuntimeExample()
public @interface AnnotationClassExample {

    String name() default "";

}
