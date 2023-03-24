package pl.codecool.collections.list.zad2;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Book {

    private String title;
    private double price;
    private int publicationYear;
    private List<Author> authors;
    private Genre genre;
}
