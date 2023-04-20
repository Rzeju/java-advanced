package pl.codecool.annotations.ex1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AnnotationRuntimeExample {

    String value() default "";
    Class<?> myClass() default Void.class;



}
