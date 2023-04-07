package pl.codecool.java_in_out.serialization;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String name;
    private String lastName;
    private int age;
}
