package pl.codecool.annotations.ex3;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(RepeatableAnnotationContainer.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepeatableAnnotationExample {

    String name() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface RepeatableAnnotationContainer {
    RepeatableAnnotationExample[] value() default {};
}
