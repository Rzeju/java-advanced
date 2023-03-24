package pl.codecool.collections.list.zad3;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Command {

    private String value;

    public void operation() {
        System.out.println(value);
    }
}
