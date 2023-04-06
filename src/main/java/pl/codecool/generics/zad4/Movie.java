package pl.codecool.generics.zad4;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie extends Medium {

    private String title;
    private String director;
    private int productionYear;
    private String producer;
}
