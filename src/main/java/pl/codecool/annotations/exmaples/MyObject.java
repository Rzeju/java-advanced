package pl.codecool.annotations.exmaples;

@TargetAnnotationExample("class")
public class MyObject {

    private String name;
    @TargetAnnotationExample("filed: number")
    private int number;
    public long myPublicNumber;

    @TargetAnnotationExample("constructor - (String,int)")
    public MyObject(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public MyObject() {
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @TargetAnnotationExample("getter for name Field")
    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
