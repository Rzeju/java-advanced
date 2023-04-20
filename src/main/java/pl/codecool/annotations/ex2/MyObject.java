package pl.codecool.annotations.ex2;

@TargetAnnotationExample("class")
public class MyObject {

    @TargetAnnotationExample("field: firstName")
    private String firstName;
    private String lastName;
    @TargetAnnotationExample("public field")
    public int number;
    @TargetAnnotationExample("protected field")
    protected int x = 0;

    @TargetAnnotationExample("no args constructor")
    public MyObject() {
    }

    @TargetAnnotationExample("all args constructor")
    public MyObject(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @TargetAnnotationExample("method")
    public void annotatedMethod() {

    }

    public void noAnnotatedMethod() {

    }

    @Override
    public String toString() {
        return "MyObject{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
