package pl.codecool.lambda_stream.method_reference.examples;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person>  {

    private long id;
    private String firstName;
    private int age;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compareTo(Person o) {
        return age - o.age;
    }
}
