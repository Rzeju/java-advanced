package pl.codecool.lambda_stream.collectors.examples;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.stream()
                .collect(Collectors.toSet());

        users.stream()
                .collect(Collectors.toCollection(TreeSet::new));

        Comparator<User> userComparator = null;

        users.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(userComparator)));


        users.add(new User(1, "UserLogin1", "12345", 20));
        users.add(new User(2, "UserLogin2", "12345", 30));
        users.add(new User(3, "UserLogin3", "12345", 40));
        users.add(new User(3, "UserLogin4", "12345", 40));
        users.add(new User(3, "UserLogin5", "12345", 40));

        Map<Long, User> userMap = users.stream()
                .collect(Collectors.toMap(
                        User::getId,
                        Function.identity(),
                        (actualValue, newValue) -> newValue,
                        LinkedHashMap::new));

        Map<Long, List<User>> allUserMap = users.stream()
                .collect(Collectors.toMap(
                        User::getId,
                        Collections::singletonList,
                        (a, b) -> {
                            List<User> newValue = new ArrayList<>(a);
                            newValue.addAll(b);
                            return newValue;
                        }));

        Map<Long, List<User>> allUserGrouping = users.stream()
                        .collect(Collectors.groupingBy(User::getId));

        System.out.println(userMap);
        System.out.println(allUserMap);
        System.out.println(allUserGrouping);

        System.out.println(allUserMap.equals(allUserGrouping));

        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());

        locales.forEach(l -> System.out.println(l.getDisplayCountry() + " -> " + l.getDisplayLanguage() + " : ORIGINAL = " + l.getDisplayLanguage(l)));
    }
}
