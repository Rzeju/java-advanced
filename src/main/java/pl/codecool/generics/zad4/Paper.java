package pl.codecool.generics.zad4;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Paper extends Medium {

    private String content;
    private String publisher;
    private int pages;
}
