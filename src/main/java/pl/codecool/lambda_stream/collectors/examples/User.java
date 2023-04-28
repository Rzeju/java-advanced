package pl.codecool.lambda_stream.collectors.examples;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private long id;
    private String userName;
    private String password;
    private int age;
}
