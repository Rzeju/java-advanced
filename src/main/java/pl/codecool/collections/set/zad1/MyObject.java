package pl.codecool.collections.set.zad1;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
public class MyObject implements Comparable<MyObject> {

    private String name;

    @Override
    public int compareTo(MyObject o) {
        int lengthComparingResult = this.name.length() - o.name.length();
        if (lengthComparingResult == 0) {
            return this.name.compareToIgnoreCase(o.name);
        }
        return lengthComparingResult;
    }

//    @Override
//    public int compareTo(String o) {
//        int lengthComparingResult = this.name.length() - o.length();
//        if (lengthComparingResult == 0) {
//            return this.name.compareToIgnoreCase(o);
//        }
//        return lengthComparingResult;
//    }
}
