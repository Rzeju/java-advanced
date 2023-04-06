package pl.codecool.generics.zad4;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book extends Medium {

    private String author;
    private String publisher;
    private String isbn;
    private int pages;
}
