package pl.codecool.annotations.ex2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        MyObject myObject = new MyObject("firstName", "lastName");

        Class<? extends MyObject> myClass = myObject.getClass();

        System.out.println(myClass.getAnnotation(TargetAnnotationExample.class));

        for (Constructor<?> declaredConstructor : myClass.getDeclaredConstructors()) {
            if (declaredConstructor.isAnnotationPresent(TargetAnnotationExample.class)) {
                System.out.println(declaredConstructor);
                System.out.println(declaredConstructor.getAnnotation(TargetAnnotationExample.class));
            }
        }

        for (Field field : myClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(TargetAnnotationExample.class)) {
                System.out.println(field.getAnnotation(TargetAnnotationExample.class));
            }
        }

        for (Method method : myClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(TargetAnnotationExample.class)) {
                System.out.println(method.getAnnotation(TargetAnnotationExample.class));
            } else if (method.isAnnotationPresent(Override.class)) {
                System.out.println(method.getAnnotation(Override.class));
                System.out.println("Override");
            }
        }

        System.out.println("\nREFLECTION\n");

        System.out.println(myObject);

        Field privateFiled = myObject.getClass().getDeclaredField("firstName");
        privateFiled.setAccessible(true);
        System.out.println(privateFiled.get(myObject));
        privateFiled.set(myObject, "newValue");
        System.out.println(myObject);


    }
}
